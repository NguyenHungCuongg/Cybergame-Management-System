package com.cybergamems.model.entities;

public class SoLuong {
    private int soMayPhongThuong;
    private int soMayPhongVIP;
    private int soMayPhongLivestream;
    private int soNhanVien;
    private int soKhachHang;
    
    //Constructor
    public SoLuong(){}

    public SoLuong(int soMayPhongThuong, int soMayPhongVIP, int soMayPhongLivestream, int soNhanVien, int soKhachHang) {
        this.soMayPhongThuong = soMayPhongThuong;
        this.soMayPhongVIP = soMayPhongVIP;
        this.soMayPhongLivestream = soMayPhongLivestream;
        this.soNhanVien = soNhanVien;
        this.soKhachHang = soKhachHang;
    }
    
    //Getter
    public int getSoMayPhongThuong() {
        return soMayPhongThuong;
    }

    public int getSoMayPhongVIP() {
        return soMayPhongVIP;
    }

    public int getSoMayPhongLivestream() {
        return soMayPhongLivestream;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public int getSoKhachHang() {
        return soKhachHang;
    }
    
    
    //Setter
    public void setSoMayPhongThuong(int soMayPhongThuong) {
        this.soMayPhongThuong = soMayPhongThuong;
    }

    public void setSoMayPhongVIP(int soMayPhongVIP) {
        this.soMayPhongVIP = soMayPhongVIP;
    }

    public void setSoMayPhongLivestream(int soMayPhongLivestream) {
        this.soMayPhongLivestream = soMayPhongLivestream;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    public void setSoKhachHang(int soKhachHang) {
        this.soKhachHang = soKhachHang;
    }
    
}
