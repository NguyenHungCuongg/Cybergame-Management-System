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
    double tongTien;
    private Date ngayLapHoaDon;
    
    //Constructor
    public HoaDon(){
    }
    
    public HoaDon(int maHoaDon,String tenKhachHang, String tenNhanVien, boolean trangThaiHD, double tongTien, Date ngayLapHoaDon)   {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.tenNhanVien = tenNhanVien;
        this.trangThaiHD = trangThaiHD;
        this.ngayLapHoaDon = new Date();
        this.tongTien = tongTien;
        this.ngayLapHoaDon = ngayLapHoaDon;
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


    public Date getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }
    
    public double getTongTien(){
        return tongTien;
    }
    
}
