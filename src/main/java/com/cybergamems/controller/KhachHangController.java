package com.cybergamems.controller;


import com.cybergamems.model.dao.KhachHangDAO;
import com.cybergamems.model.entities.KhachHang;
import java.util.ArrayList;

public class KhachHangController {
    private KhachHangDAO khachHangModel;
    
    public KhachHangController(){
        khachHangModel = new KhachHangDAO();
    }
    
    public Object[][] getKhachHangFromModel(){
        ArrayList<KhachHang> khachHangList = khachHangModel.getAllKhachHang();
        
        int columnNum = 5; //"Mã khách hàng","Họ và tên","Tên đăng nhập","Email","Trạng thái"
        int rowNum = khachHangList.size();
        
        Object[][] khachHangTableData = new Object[rowNum][columnNum];
        for(int i = 0 ; i<rowNum;i++){
            khachHangTableData[i][0] = khachHangList.get(i).getMaKhachHang();
            khachHangTableData[i][1] = khachHangList.get(i).getHoVaTen();
            khachHangTableData[i][2] = khachHangList.get(i).getUsername();
            khachHangTableData[i][3] = khachHangList.get(i).getEmail();
            khachHangTableData[i][4] = khachHangList.get(i).isTrangThaiKH()? "Hoạt động" : "Vắng mặt";
        }
        return khachHangTableData;
    }
    
    public boolean addKhachHangIntoModel(String hoVaTen, String tenDangNhap, String matKhau,String email){
        if(hoVaTen.trim().isEmpty() || tenDangNhap.trim().isEmpty() || matKhau.trim().isEmpty() 
                || email.trim().isEmpty()){
            return false;
        }
        else{            
            //Trạng thái mặc định khi thêm khách hàng sẽ là "vắng mặt"
            int trangThai = 2;
            
            try{
                //Khi sử dụng truy xuất SQL thì nên sử dụng trong Try Catch.
                khachHangModel.addKhachHang(hoVaTen, tenDangNhap, matKhau, email, trangThai);
                return true;
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }
        }
    }
    
    public boolean deleteKhachHangFromModel(int makhachHang){
        try{
            khachHangModel.deleteKhachHang(makhachHang);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    };
    
    public KhachHang getKhachHang(int makhachHang){
        KhachHang khachHang = new KhachHang();
        try{
            khachHang = khachHangModel.getKhachHang(makhachHang);
            return khachHang;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean updateKhachHangModel(int makhachHang, String hoVaTen, String tenDangNhap, String matKhau,String email, int trangThai){
        if(hoVaTen.trim().isEmpty() || tenDangNhap.trim().isEmpty() || matKhau.trim().isEmpty() 
                || email.trim().isEmpty() || makhachHang<0){
            return false;
        }
        else{
            try{
                //Khi sử dụng truy xuất SQL thì nên sử dụng trong Try Catch.
                khachHangModel.updateKhachHang(makhachHang, hoVaTen, tenDangNhap, matKhau, email,trangThai);
                return true;
            }
            catch(Exception e){
                e.printStackTrace();
                return false;
            }
        }
    }
   
}
