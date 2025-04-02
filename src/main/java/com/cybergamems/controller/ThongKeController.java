package com.cybergamems.controller;

import com.cybergamems.model.dao.ThongKeDAO;
import com.cybergamems.model.entities.ThongKe;
import java.util.ArrayList;
import com.cybergamems.utils.ViewUtilities;

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
    
    public ThongKe getThongKeFromModel(int thang, int nam){
        try{
            return thongKeModel.getThongKe(thang, nam);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public Object[][] getThongkeFromModelByYear(int nam){
        ArrayList<ThongKe> thongKeList = thongKeModel.getAllThongKe(nam);
        
        int columnNum = 7; //"Mã nhân viên","Họ và tên","Tên đăng nhập","Email","Trạng thái","Vị trí","Ngày vào làm"
        int rowNum = thongKeList.size();
        
        Object[][] thongKeTableData = new Object[rowNum][columnNum];
        for(int i=0;i<rowNum;i++){
            thongKeTableData[i][0] = thongKeList.get(i).getThang();
            thongKeTableData[i][1] = ViewUtilities.formatDoubleWithoutDecimal(thongKeList.get(i).getTongDoanhThu());
            thongKeTableData[i][2] = ViewUtilities.formatDoubleWithoutDecimal(thongKeList.get(i).getTongChiTieu());
            double loiNhuan = thongKeList.get(i).getTongDoanhThu() - thongKeList.get(i).getTongChiTieu();
            thongKeTableData[i][3] = ViewUtilities.formatDoubleWithoutDecimal(loiNhuan);
        }
        return thongKeTableData;
    }
}
