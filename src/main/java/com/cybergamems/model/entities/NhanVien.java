package com.cybergamems.model.entities;

import java.util.Date;

public class NhanVien {
    private int maNhanVien;
    private String hoVaTen;
    private String username;
    private String email;
    private boolean trangThaiNV;
    private String viTri;
    private Date ngayVaoLam;

    //Constructor
    public NhanVien(int maNhanVien, String hoVaTen, String username, String email, boolean trangThaiNV, String viTri, Date ngayVaoLam) {
        this.maNhanVien = maNhanVien;
        this.hoVaTen = hoVaTen;
        this.username = username;
        this.email = email;
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

    public void setTrangThaiNV(boolean trangThaiNV) {
        this.trangThaiNV = trangThaiNV;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
    
}
