package com.cybergamems.controller;

import com.cybergamems.model.dao.ThongKeDAO;
import java.util.ArrayList;

public class ThongKeController {
    private ThongKeDAO thongKeModel;
    
    public ThongKeController(){
        this.thongKeModel = new ThongKeDAO();
    }
    
    public ArrayList<Integer> getSoLuongMayFromModel(){
        ArrayList<Integer> result = new ArrayList<>();
        try{
            result = thongKeModel.getSoLuongMay();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
    };
    
    public int getSoLuongKHFromModel(){
        try{
            return thongKeModel.getSoLuongKhachHang();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }
    
    public int getSoLuongNVFromModel(){
        try{
            return thongKeModel.getSoLuongNhanVien();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }
    
    public boolean addChiPhiIntoModel(int thang, int nam, double tienDien, double tienNuoc, double tienTaiNguyen){
        try{
            //Kiểm tra xem tháng năm này đã có chi phí chưa? nếu chưa thì thêm vào, nếu rồi thì cập nhật
            boolean kiemTraChiPhi = thongKeModel.checkChiPhi(thang,nam);
            if(kiemTraChiPhi){
                thongKeModel.updateChiPhi(thang, nam, tienDien, tienNuoc, tienTaiNguyen);
            }
            else{
                thongKeModel.addChiPhi(thang, nam, tienDien, tienNuoc, tienTaiNguyen);
            }
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
