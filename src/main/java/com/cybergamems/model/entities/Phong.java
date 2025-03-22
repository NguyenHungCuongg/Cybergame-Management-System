package com.cybergamems.model.entities;

public class Phong {
    private String tenPhong;
    private double giaMoiGio; 
    
    //Constructor
    public Phong(){
        tenPhong = "";
        giaMoiGio=0;
    }

    public Phong(String tenPhong, double giaMoiGio) {
        this.tenPhong = tenPhong;
        this.giaMoiGio = giaMoiGio;
    }

    //Getter
    public String getTenPhong() {
        return tenPhong;
    }

    public double getGiaMoiGio() {
        return giaMoiGio;
    }
    
    //Setter
    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public void setGiaMoiGio(double giaMoiGio) {
        this.giaMoiGio = giaMoiGio;
    }
    
}
