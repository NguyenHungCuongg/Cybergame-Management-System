package com.cybergamems.model.entities;

public class ChiTietHoaDon {
    private int maCTHD;
    private String tenDichVu;
    private double soLuong;
    private double donGia;
    
    //Constructor
    public ChiTietHoaDon(){
        maCTHD = 0;
        tenDichVu = "";
        soLuong = 0;
        donGia = 0;
    }
    
    public ChiTietHoaDon(int maCTHD,String tenDichVu,double soLuong,double donGia){
        this.maCTHD = maCTHD;
        this.tenDichVu = tenDichVu;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    //Getter
    public int getMaCTHD() {
        return maCTHD;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    //Setter
    public void setMaCTHD(int maCTHD) {
        this.maCTHD = maCTHD;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
        
    //Methods
    public double getThanhTien(){
        return donGia * soLuong;
    }
}
