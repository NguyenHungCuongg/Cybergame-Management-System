package com.cybergamems.controller;

import com.cybergamems.model.dao.NhanVienDAO;
import com.cybergamems.model.entities.NhanVien;
import java.util.ArrayList;
import java.util.Date;

public class NhanVienController {
    private NhanVienDAO nhanVienModel;
    
    public NhanVienController(){
        this.nhanVienModel = new NhanVienDAO();
    }
    
    //Đây sẽ là phương thức trả về đúng kiểu dữ liệu mảng 2 chiều Object mà JTable sẽ dùng trong view
    public Object[][] getNhanVienFromModel(){
        ArrayList<NhanVien> nhanVienList = nhanVienModel.getAllNhanVien();
        
        int columnNum = 7; //"Mã nhân viên","Họ và tên","Tên đăng nhập","Email","Trạng thái","Vị trí","Ngày vào làm"
        int rowNum = nhanVienList.size();
        
        Object[][] nhanVienTableData = new Object[rowNum][columnNum];
        for(int i=0;i<rowNum;i++){
            nhanVienTableData[i][0] = nhanVienList.get(i).getMaNhanVien();
            nhanVienTableData[i][1] = nhanVienList.get(i).getHoVaTen();
            nhanVienTableData[i][2] = nhanVienList.get(i).getUsername();
            nhanVienTableData[i][3] = nhanVienList.get(i).getEmail();
            nhanVienTableData[i][4] = nhanVienList.get(i).isTrangThaiNV()?"Hoạt động":"Vắng mặt";
            nhanVienTableData[i][5] = nhanVienList.get(i).getViTri();
            nhanVienTableData[i][6] = nhanVienList.get(i).getNgayVaoLam();
        }
        return nhanVienTableData;
    }
    
    public boolean addNhanVienIntoModel(String hoVaTen, String tenDangNhap, String matKhau,String email, String viTri ){
        if(hoVaTen.trim().isEmpty() || tenDangNhap.trim().isEmpty() || matKhau.trim().isEmpty() 
                || email.trim().isEmpty() || viTri.trim().isEmpty()){
            return false;
        }
        else{
            
            //Xử lí tìm mã vị trí theo tên vị trí
            int maViTri;
            switch(viTri){
                case "Quản lí":
                    maViTri = 1;
                    break;
                case "Nhân viên":
                    maViTri = 2;
                    break;
                case "Đầu bếp":
                    maViTri = 3;
                    break;
                default:
                    return false;
            }
            
            //Xử lí truy xuất thông tin Date tính từ thời điểm hiện tại
            Date ngayVaoLam = new Date();
            
            //Trạng thái mặc định khi thêm nhân viên sẽ là "hoạt động"
            int trangThai = 1;
            
            try{
                //Khi sử dụng truy xuất SQL thì nên sử dụng trong Try Catch.
                nhanVienModel.addNhanVien(maViTri, hoVaTen, tenDangNhap, matKhau, email, trangThai, ngayVaoLam);
                return true;
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }
        }
    }
    
    public boolean deleteNhanVienFromModel(int maNhanVien){
        try{
            nhanVienModel.deleteNhanVien(maNhanVien);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    };
    
    public NhanVien getNhanVien(int maNhanVien){
        NhanVien nhanVien = new NhanVien();
        try{
            nhanVien = nhanVienModel.getNhanVien(maNhanVien);
            return nhanVien;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean updateNhanVienModel(int maNhanVien, String hoVaTen, String tenDangNhap, String matKhau,String email, String viTri, int trangThai){
        if(hoVaTen.trim().isEmpty() || tenDangNhap.trim().isEmpty() || matKhau.trim().isEmpty() 
                || email.trim().isEmpty() || viTri.trim().isEmpty() || maNhanVien<0){
            return false;
        }
        else{
            int maViTri;
            switch(viTri){
                case "Quản lí":
                    maViTri = 1;
                    break;
                case "Nhân viên":
                    maViTri = 2;
                    break;
                case "Đầu bếp":
                    maViTri = 3;
                    break;
                default:
                    return false;
            }
            try{
                //Khi sử dụng truy xuất SQL thì nên sử dụng trong Try Catch.
                nhanVienModel.updateNhanVIen(maNhanVien, maViTri, hoVaTen, tenDangNhap, matKhau, email,trangThai);
                return true;
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }
        }
    }
}
