package com.cybergamems.model.entities;

import java.util.ArrayList;
import java.util.Date;

public class HoaDon {
    int maHoaDon;
    int maKhachHang;
    int maNhanVien;
    String tenKhachHang;
    String tenNhanVien;
    boolean trangThaiHD;
    private ArrayList<ChiTietHoaDon> dsCTHD;
    private Date ngayLapHoaDon;
    
    //Constructor
    public HoaDon(){
    }
    
    public HoaDon(int maHoaDon,String tenKhachHang, String tenNhanVien, boolean trangThaiHD){
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.tenNhanVien = tenNhanVien;
        this.trangThaiHD = trangThaiHD;
        this.dsCTHD = new ArrayList<>();
        this.ngayLapHoaDon = new Date();
    }
    
    //Getter
    public int getMaHoaDon() {
        return maHoaDon;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public boolean isTrangThaiHD() {
        return trangThaiHD;
    }

    public ArrayList<ChiTietHoaDon> getDsCTHD() {
        return dsCTHD;
    }

    public Date getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }
    
}
