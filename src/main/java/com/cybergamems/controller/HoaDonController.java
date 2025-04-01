package com.cybergamems.controller;

import com.cybergamems.model.dao.HoaDonDAO;
import com.cybergamems.model.dao.KhachHangDAO;
import com.cybergamems.model.entities.ChiTietHoaDon;
import com.cybergamems.model.entities.HoaDon;
import com.cybergamems.model.entities.KhachHang;
import com.cybergamems.model.entities.NhanVien;
import com.cybergamems.utils.ViewUtilities;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class HoaDonController {
    private HoaDonDAO hoaDonModel;
    private KhachHangDAO khachHangModel;
    
    public HoaDonController(){
        this.hoaDonModel = new HoaDonDAO();
        this.khachHangModel = new KhachHangDAO();
    }
    
    //Đây sẽ là phương thức trả về đúng kiểu dữ liệu mảng 2 chiều Object mà JTable sẽ dùng trong view
    public Object[][] getHoaDonFromModel(){
        ArrayList<HoaDon> hoaDonList = hoaDonModel.getAllHoaDon();
        
        int columnNum = 6; 
        int rowNum = hoaDonList.size();
        
        Object[][] hoaDonTableData = new Object[rowNum][columnNum];
        for(int i=0;i<rowNum;i++){
            hoaDonTableData[i][0] = hoaDonList.get(i).getMaHoaDon();
            hoaDonTableData[i][1] = hoaDonList.get(i).getTenNhanVien();
            hoaDonTableData[i][2] = hoaDonList.get(i).getTenKhachHang();
            hoaDonTableData[i][3] = hoaDonList.get(i).getNgayLapHoaDon();
            hoaDonTableData[i][4] = ViewUtilities.formatDoubleWithoutDecimal(hoaDonList.get(i).getTongTien());
            hoaDonTableData[i][5] = hoaDonList.get(i).isTrangThaiHD()?"Đã thanh toán":"Chưa thanh toán";
        }
        return hoaDonTableData;
    }
    
    
    public Object[][] getCTHDFromModel(int maHoaDon){
        ArrayList<ChiTietHoaDon> CTHDList = hoaDonModel.getAllCTHD(maHoaDon);
        
        int columnNum = 5; 
        int rowNum = CTHDList.size();
        
        Object[][] detailBillTableData = new Object[rowNum][columnNum];
        for(int i = 0 ; i<rowNum;i++){
            detailBillTableData[i][0] = CTHDList.get(i).getTenDichVu();
            detailBillTableData[i][1] = CTHDList.get(i).getLoaiDichVu();
            detailBillTableData[i][2] = CTHDList.get(i).getSoLuong();
            detailBillTableData[i][3] = ViewUtilities.formatDoubleWithoutDecimal(CTHDList.get(i).getDonGia());
            detailBillTableData[i][4] = ViewUtilities.formatDoubleWithoutDecimal(CTHDList.get(i).getThanhTien());
        }
        
        return detailBillTableData;
    }
    
    public HoaDon getHoaDonFromModel(int maHoaDon){
        try{
            return hoaDonModel.getHoaDonByID(maHoaDon);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public int addFoodAndDrinkBill(String tenDangNhap,NhanVien loginedNhanVien,DefaultTableModel tableData ){
        KhachHang currentKhachHang = khachHangModel.getKhachHangByUsername(tenDangNhap);
        if (currentKhachHang.getMaKhachHang()==-1 ) return 0;
        if(currentKhachHang.isTrangThaiKH()==false) return 2;
        int maKhachHang = currentKhachHang.getMaKhachHang();
        int maNhanVien = loginedNhanVien.getMaNhanVien();
        HoaDon currentHoaDon = new HoaDon();
        currentHoaDon = hoaDonModel.getHoaDon(maKhachHang, maNhanVien);
        int maHoaDon = currentHoaDon.getMaHoaDon();
        
        try{
            for(int row = 0; row < tableData.getRowCount(); row++){
                String tenDichVu = tableData.getValueAt(row,0).toString();
                int maDichVu = hoaDonModel.getMaDichVuByTenDichVu(tenDichVu);
                int soLuong = Integer.parseInt(tableData.getValueAt(row,2).toString());
                double donGia = Double.parseDouble(tableData.getValueAt(row,3).toString());
                double thanhTien = soLuong * donGia;
                hoaDonModel.addCTHD(maHoaDon, maDichVu, soLuong, donGia, thanhTien);
            }
            return 1;
        }
        catch(Exception e){
            e.printStackTrace();
            return 3;
        }
    }
    
    public boolean paymentComplete(int phuongThucTT, int maHoaDon, double tongTien){
        try{
            hoaDonModel.addBillPayment(phuongThucTT, maHoaDon, tongTien);
            hoaDonModel.updatePaymentStatus(true, maHoaDon);
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
