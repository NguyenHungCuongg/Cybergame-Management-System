package com.cybergamems.model.entities;

import java.util.Date;

public class MayTinh {
    private int maMayTinh;
    private String trangThaiMay;
    private int maNguoiChoi;
    private String tenDangNhap;
    private Date thoiGianBatDau;

    //Constructor
    public MayTinh(){
        maMayTinh = 0;
        trangThaiMay = "";
        maNguoiChoi=0;
        tenDangNhap="";
        thoiGianBatDau=new Date();
    }
    
    public MayTinh(int maMayTinh, String trangThaiMay, int maNguoiChoi, String tenDangNhap, Date thoiGianBatDau) {
        this.maMayTinh = maMayTinh;
        this.trangThaiMay = trangThaiMay;
        this.maNguoiChoi = maNguoiChoi;
        this.tenDangNhap = tenDangNhap;
        this.thoiGianBatDau = thoiGianBatDau;
    }

    //Getter
    public int getMaMayTinh() {
        return maMayTinh;
    }

    public String getTrangThaiMay() {
        return trangThaiMay;
    }

    public int getMaNguoiChoi() {
        return maNguoiChoi;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public Date getThoiGianBatDau() {
        return thoiGianBatDau;
    }
    
    //Setter
    public void setMaMayTinh(int maMayTinh) {
        this.maMayTinh = maMayTinh;
    }

    public void setTrangThaiMay(String trangThaiMay) {
        this.trangThaiMay = trangThaiMay;
    }

    public void setMaNguoiChoi(int maNguoiChoi) {
        this.maNguoiChoi = maNguoiChoi;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public void setThoiGianBatDau(Date thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }    
}
