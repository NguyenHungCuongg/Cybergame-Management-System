package com.cybergamems.model.entities;

public class KhachHang {
    private int maKhachHang;
    private String hoVaTen;
    private String username;
    private String matKhau;
    private String email;
    private boolean trangThaiKH;
    
    //Constructor
    public KhachHang(){
        maKhachHang = -1;
        hoVaTen = "";
        username = "";
        matKhau = "";
        email="";
        trangThaiKH = false;
    }
    
    public KhachHang(int maKhachHang, String hoVaTen, String username, String matKhau, String email, boolean trangThaiKH) {
        this.maKhachHang = maKhachHang;
        this.hoVaTen = hoVaTen;
        this.username = username;
        this.matKhau = matKhau;
        this.email = email;
        this.trangThaiKH = trangThaiKH;
    }

    //Getter
    public int getMaKhachHang() {
        return maKhachHang;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public String getUsername() {
        return username;
    }

    public String getMatKhau(){
        return matKhau;
    }
    
    public String getEmail() {
        return email;
    }

    public boolean isTrangThaiKH() {
        return trangThaiKH;
    }
    
    //Setter
    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setMatKhau(String matKhau){
        this.matKhau = matKhau;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTrangThaiKH(boolean trangThaiKH) {
        this.trangThaiKH = trangThaiKH;
    }
}
