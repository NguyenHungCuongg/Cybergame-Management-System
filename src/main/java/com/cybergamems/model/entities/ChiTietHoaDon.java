package com.cybergamems.model.entities;

public class ChiTietHoaDon {
    private int maCTHD;
    private String tenDichVu;
    private String loaiDichVu;
    private double soLuong;
    private double donGia;
    private double thanhTien;
    
    //Constructor
    public ChiTietHoaDon(){
        maCTHD = 0;
        tenDichVu = "";
        loaiDichVu="";
        soLuong = 0;
        donGia = 0;
    }
    
    public ChiTietHoaDon(int maCTHD,String tenDichVu, String loaiDichVu,double soLuong,double donGia){
        this.maCTHD = maCTHD;
        this.tenDichVu = tenDichVu;
        this.loaiDichVu = loaiDichVu;
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
    
    public String getLoaiDichVu(){
        return loaiDichVu;
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

    public void setLoaiDichVu(String loaiDichVu){
        this.loaiDichVu = loaiDichVu;
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
