package com.cybergamems.controller;

import com.cybergamems.model.dao.KhachHangDAO;
import com.cybergamems.model.dao.MayTinhDAO;
import com.cybergamems.model.entities.KhachHang;
import com.cybergamems.model.entities.MayTinh;
import java.util.ArrayList;

public class MayTinhController {
    private MayTinhDAO mayTinhModel;
    private KhachHangDAO khachHangModel;
    
    public MayTinhController(){
        this.mayTinhModel = new MayTinhDAO();
        this.khachHangModel = new KhachHangDAO();
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
    
    public int addPhienChoiIntoModel(String tenDangNhap, int maMay){
        //Kiểm tra máy có available không?
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
            return 0;
        }
        catch(Exception e){
            e.printStackTrace();
            return 3;
        }
    }
}
