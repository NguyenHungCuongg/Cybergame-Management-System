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
   
}
