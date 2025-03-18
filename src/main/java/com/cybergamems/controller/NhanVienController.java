package com.cybergamems.controller;

import com.cybergamems.model.dao.NhanVienDAO;
import com.cybergamems.model.entities.NhanVien;
import java.util.ArrayList;

public class NhanVienController {
    private NhanVienDAO nhanVienModel;
    
    public NhanVienController(){
        this.nhanVienModel = new NhanVienDAO();
    }
    
    //Đây sẽ là phương thức trả về đúng kiểu dữ liệu mảng 2 chiều Object mà JTable sẽ dùng trong view
    public Object[][] getNhanVienTableData(){
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
}
