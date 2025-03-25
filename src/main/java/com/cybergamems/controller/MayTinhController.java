package com.cybergamems.controller;

import com.cybergamems.model.dao.HoaDonDAO;
import com.cybergamems.model.dao.KhachHangDAO;
import com.cybergamems.model.dao.MayTinhDAO;
import com.cybergamems.model.entities.HoaDon;
import com.cybergamems.model.entities.KhachHang;
import com.cybergamems.model.entities.MayTinh;
import com.cybergamems.model.entities.NhanVien;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class MayTinhController {
    private MayTinhDAO mayTinhModel;
    private KhachHangDAO khachHangModel;
    private HoaDonDAO hoaDonModel;
    
    public MayTinhController(){
        this.mayTinhModel = new MayTinhDAO();
        this.khachHangModel = new KhachHangDAO();
        this.hoaDonModel = new HoaDonDAO();
    }
    
    public Object[][] getAllMayTinhFromModel(int maPhong){
        ArrayList<MayTinh> mayTinhList = mayTinhModel.getAllMayTinh(maPhong);
        
        int columnNum = 5;
        int rowNum = mayTinhList.size();
        
        Object[][] mayTinhTableData = new Object[rowNum][columnNum];
        for(int i=0;i<rowNum;i++){
            mayTinhTableData[i][0] = mayTinhList.get(i).getMaMayTinh();
            mayTinhTableData[i][1] = mayTinhList.get(i).getTrangThaiMay();
            mayTinhTableData[i][2] = mayTinhList.get(i).getMaNguoiChoi();
            mayTinhTableData[i][3] = mayTinhList.get(i).getTenDangNhap();
            mayTinhTableData[i][4] = mayTinhList.get(i).getThoiGianBatDau();
        }
        return mayTinhTableData;
    }
    
    public int addPhienChoiIntoModel(String tenDangNhap, int maMay, NhanVien loginedNhanVien){
        
        //Thêm phiên chơi
        String kiemTraTrangThai = mayTinhModel.kiemTraTinhTrang(maMay);
        if(!kiemTraTrangThai.equals("Trống")) return 1;
        
        //Kiểm tra tên đăng nhập có tồn tại không?
        KhachHang currentKhachHang = new KhachHang();
        currentKhachHang = khachHangModel.getKhachHangByUsername(tenDangNhap);
        if (currentKhachHang.getMaKhachHang()==-1 ) return 2;
        
        int maKhachHang = currentKhachHang.getMaKhachHang();
        try{
            mayTinhModel.addPhienChoi(maKhachHang, maMay);
            mayTinhModel.capNhatTrangThai(maMay, "Đang sử dụng");
        }
        catch(Exception e){
            e.printStackTrace();
            return 3;
        }
        
        //Tạo hóa đơn cho người dùng này.
        int maNhanVien = loginedNhanVien.getMaNhanVien();
        Date ngayLapHD = new Date();
        try{
            hoaDonModel.addHoaDon(maKhachHang, maNhanVien, false, ngayLapHD);
            return 0;
        }
        catch(Exception e){
            e.printStackTrace();
            return 3;
        }
    }
    
    public boolean deletePhienChoiFromModel(int maMay , NhanVien loginedNhanVien){
   
        //Tạo chi tiết hóa đơn với phiên chơi này và thêm vào hóa đơn của người dùng tương ứng.
        /*
        *Ta đang cố tạo một chi tiết hóa đơn cho một hóa đơn có sẵn(hóa đơn này được tạo lúc bắt đầu phiên chơi),
        *Để làm được điều này thì ta cần phải truy xuất được mã hóa đơn tương tứng -> để tìm được mã hóa đơn tương tứng
        *Ta cần tìm thông qua mã khách hàng đang chơi máy này và mã nhân viên đang đăng nhập
        */
        System.out.println("Ma may: "+maMay);
        KhachHang currentKhachHang = new KhachHang();
        currentKhachHang = khachHangModel.getKhachHangByMaMay(maMay);
        int maKhachHang = currentKhachHang.getMaKhachHang();
        int maNhanVien = loginedNhanVien.getMaNhanVien();
        System.out.println("Ma khach hang: "+maKhachHang);
        System.out.println("Ma nhan vien: "+maNhanVien);
        HoaDon currentHoaDon = new HoaDon();
        currentHoaDon = hoaDonModel.getHoaDon(maKhachHang, maNhanVien);
        int maHoaDon = currentHoaDon.getMaHoaDon();
        
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String thoiGianBatDauPhienChoi = mayTinhModel.getMayTinh(maMay).getThoiGianBatDau();
        //Biến thoiGianBatDauPhienChoi từ String sang kiểu LocalDateTime
        LocalDateTime thoiGianBatDau = LocalDateTime.parse(thoiGianBatDauPhienChoi, formatter);
        // Lấy thời gian hiện tại (kiểu LocalDateTime)
        LocalDateTime thoiGianHienTai = LocalDateTime.now();
        //Tính hiệu số giờ hiện tại bằng class Duration;
        double soGioPhienChoi = Duration.between(thoiGianBatDau, thoiGianHienTai).toMinutes() / 60.0;
        soGioPhienChoi = (soGioPhienChoi<=1)?1:soGioPhienChoi;
        System.out.println("So gio choi: " + soGioPhienChoi);
        
        double giaMoiGio = mayTinhModel.getMayTinh(maMay).getGiaMoiGio();
        
        double thanhTien = soGioPhienChoi*giaMoiGio;
        
        int maDichVu = 1;//Mã dịch vụ của dịch vụ chơi game mặc định bằng 1;
        
        //Sử dụng các giá trị "maHoaDon", "maDichVu", "soGioPhienChoi", "giaMoiGio", "thanhTien" vừa tìm được để lập CTHD.
        hoaDonModel.addCTHD(maHoaDon, maDichVu, soGioPhienChoi, giaMoiGio, thanhTien);
        
        
        
         //Xóa phiên chơi 
        String kiemTraTrangThai = mayTinhModel.kiemTraTinhTrang(maMay);
        if(!kiemTraTrangThai.equals("Đang sử dụng")) return false;
        
        try{
            mayTinhModel.deletePhienChoi(maMay);
            mayTinhModel.capNhatTrangThai(maMay, "Trống");
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
        
        return true;
    }
    
}
