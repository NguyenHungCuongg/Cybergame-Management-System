package com.cybergamems.model.entities;

public class MayTinh {
    private int maMayTinh;
    private String trangThaiMay;
    private int maNguoiChoi;
    private String tenDangNhap;
    private String thoiGianBatDau;
    private double giaMoiGio;

    //Constructor
    public MayTinh(){
        maMayTinh = 0;
        trangThaiMay = "";
        maNguoiChoi=0;
        tenDangNhap="";
        thoiGianBatDau="";
        giaMoiGio=0;
    }
    
    public MayTinh(int maMayTinh, String trangThaiMay, int maNguoiChoi, String tenDangNhap, String thoiGianBatDau, double giaMoiGio) {
        this.maMayTinh = maMayTinh;
        this.trangThaiMay = trangThaiMay;
        this.maNguoiChoi = maNguoiChoi;
        this.tenDangNhap = tenDangNhap;
        this.thoiGianBatDau = thoiGianBatDau;
        this.giaMoiGio = giaMoiGio;
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

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }
    
    public double getGiaMoiGio(){
        return giaMoiGio;
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

    public void setThoiGianBatDau(String thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }    
    
    public void setGiaMoiGio(double giaMoiGio){
        this.giaMoiGio = giaMoiGio;
    }
}
