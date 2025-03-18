package com.cybergamems.model;

import com.cybergamems.model.dao.NhanVienDAO;

public class TestDAO {
    public static void main(String[] args){
        NhanVienDAO nv = new NhanVienDAO();
        nv.getAllNhanVien();
    }
}
