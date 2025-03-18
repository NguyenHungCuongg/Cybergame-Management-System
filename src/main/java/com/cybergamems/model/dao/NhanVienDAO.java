package com.cybergamems.model.dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cybergamems.model.entities.NhanVien;
import com.cybergamems.model.DatabaseConnection;

public class NhanVienDAO {
    public ArrayList<NhanVien> getAllNhanVien(){
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        String query ="SELECT * FROM NhanVien JOIN ViTri On NhanVien.MaViTri = ViTri.MaViTri";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                NhanVien currentNhanvien = new NhanVien(
                        rs.getInt("MaNhanvien"),
                        rs.getString("HoVaTen"),
                        rs.getString("Username"),
                        rs.getString("Email"),
                        rs.getBoolean("TrangThaiNV"),
                        rs.getString("TenViTri"),
                        rs.getDate("NgayVaoLam")
                );
                dsNhanVien.add(currentNhanvien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }
}
