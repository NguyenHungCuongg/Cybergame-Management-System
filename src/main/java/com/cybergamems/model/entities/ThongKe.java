package com.cybergamems.model.entities;

public class ThongKe {
    private int thang;
    private int nam;
    private double tongDoanhThu;
    private double tongChiTieu;
    
    //Constructor
    public ThongKe(){}

    public ThongKe(int thang, int nam, double tongDoanhThu, double tongChiTieu) {
        this.thang = thang;
        this.nam = nam;
        this.tongDoanhThu = tongDoanhThu;
        this.tongChiTieu = tongChiTieu;
    }

    //Getter
    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }

    public double getTongDoanhThu() {
        return tongDoanhThu;
    }

    public double getTongChiTieu() {
        return tongChiTieu;
    }
    
    //Setter

    public void setThang(int thang) {
        this.thang = thang;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setTongDoanhThu(double tongDoanhThu) {
        this.tongDoanhThu = tongDoanhThu;
    }

    public void setTongChiTieu(double tongChiTieu) {
        this.tongChiTieu = tongChiTieu;
    }
    
}
