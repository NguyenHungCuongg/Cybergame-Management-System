package com.cybergamems.model.entities;

import java.util.Date;

public class NhanVien {
    private int maNhanVien;
    private String hoVaTen;
    private String username;
    private String matKhau;
    private String email;
    private boolean trangThaiNV;
    private String viTri;
    private Date ngayVaoLam;

    //Constructor
    public NhanVien(){
        maNhanVien = -1;
        hoVaTen = "";
        username = "";
        matKhau = "";
        email="";
        trangThaiNV =false;
        viTri ="";
        ngayVaoLam = new Date();
    }
    
    public NhanVien(int maNhanVien, String hoVaTen, String username, String matKhau, String email,boolean trangThaiNV, String viTri, Date ngayVaoLam) {
        this.maNhanVien = maNhanVien;
        this.hoVaTen = hoVaTen;
        this.username = username;
        this.email = email;
        this.matKhau = matKhau;
        this.trangThaiNV = trangThaiNV;
        this.viTri =viTri;
        this.ngayVaoLam = ngayVaoLam;
    }
    
    //Getter
    public int getMaNhanVien() {
        return maNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
    
    public String getMatKhau(){
        return matKhau;
    }

    public boolean isTrangThaiNV() {
        return trangThaiNV;
    }
    
    public String getViTri(){
        return viTri;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }
 
    //Setter
    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setMatKhau(String matKhau){
        this.matKhau = matKhau;
    }

    public void setTrangThaiNV(boolean trangThaiNV) {
        this.trangThaiNV = trangThaiNV;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
    
}
