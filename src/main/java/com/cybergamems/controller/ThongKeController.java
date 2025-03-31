package com.cybergamems.controller;

import com.cybergamems.model.dao.ThongKeDAO;
import com.cybergamems.model.entities.SoLuong;
import java.util.ArrayList;

public class ThongKeController {
    private ThongKeDAO ThongKeModel;
    
    public ThongKeController(){
        this.ThongKeModel = new ThongKeDAO();
    }
    
    public ArrayList<Integer> getSoLuongMayFromModel(){
        ArrayList<Integer> result = new ArrayList<>();
        try{
            result = ThongKeModel.getSoLuongMay();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return result;
    };
    
    public int getSoLuongKHFromModel(){
        try{
            return ThongKeModel.getSoLuongKhachHang();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }
    
    public int getSoLuongNVFromModel(){
        try{
            return ThongKeModel.getSoLuongNhanVien();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
