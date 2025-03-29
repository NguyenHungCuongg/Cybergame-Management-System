package com.cybergamems.controller;

import com.cybergamems.model.dao.HoaDonDAO;
import com.cybergamems.model.entities.ChiTietHoaDon;
import com.cybergamems.model.entities.HoaDon;
import com.cybergamems.utils.viewUtils;
import java.util.ArrayList;

public class HoaDonController {
    private HoaDonDAO hoaDonModel;
    
    public HoaDonController(){
        this.hoaDonModel = new HoaDonDAO();
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
            hoaDonTableData[i][4] = viewUtils.formatDoubleWithoutDecimal(hoaDonList.get(i).getTongTien());
            hoaDonTableData[i][5] = "chua chuyen";
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
            detailBillTableData[i][3] = viewUtils.formatDoubleWithoutDecimal(CTHDList.get(i).getDonGia());
            detailBillTableData[i][4] = viewUtils.formatDoubleWithoutDecimal(CTHDList.get(i).getThanhTien());
        }
        
        
        
        return detailBillTableData;
    }
}
