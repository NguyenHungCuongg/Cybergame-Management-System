package com.cybergamems.controller;

import com.cybergamems.model.dao.MayTinhDAO;
import com.cybergamems.model.entities.MayTinh;
import java.util.ArrayList;

public class MayTinhController {
    private MayTinhDAO mayTinhModel;
    
    public MayTinhController(){
        this.mayTinhModel = new MayTinhDAO();
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
}
