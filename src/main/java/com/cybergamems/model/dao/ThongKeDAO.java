package com.cybergamems.model.dao;

import com.cybergamems.model.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ThongKeDAO {
    public ArrayList<Integer> getSoLuongMay(){
        ArrayList<Integer> soLuongMay = new ArrayList<>();
        String query ="SELECT MaPhong, COUNT(MaMay) AS SoLuongMay\n" +
                "FROM MayTinh\n" +
                "WHERE MaPhong IN (1, 2, 3) \n" +
                "GROUP BY MaPhong;";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                soLuongMay.add(rs.getInt("SoLuongMay"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return soLuongMay;
    }
    
    public int getSoLuongKhachHang(){
        String query ="SELECT \n" +
            "COUNT(MaKhachHang) AS SoLuongKH\n" +
            "FROM KhachHang";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ) {
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("SoLuongKH");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public int getSoLuongNhanVien(){
        String query ="SELECT \n" +
            "COUNT(MaNhanVien) AS SoLuongNV\n" +
            "FROM NhanVien";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ) {
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("SoLuongNV");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public void addChiPhi(int thang, int nam, double tienDien, double tienNuoc, double tienTaiNguyen){
        String query = "INSERT INTO ChiPhiHoatDong(Thang,Nam,TienDien,TienNuoc,TienTaiNguyen,NgayNhap)\n" +
            "VALUES (?,?,?,?,?,GETDATE());";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, thang);
            stmt.setInt(2, nam);
            stmt.setDouble(3, tienDien);
            stmt.setDouble(4, tienNuoc);
            stmt.setDouble(5, tienTaiNguyen);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void updateChiPhi(int thang, int nam, double tienDien, double tienNuoc, double tienTaiNguyen){
        String query = "UPDATE ChiPhiHoatDong\n" +
                "SET\n" +
                "TienDien = ?,\n" +
                "TienNuoc = ?,\n" +
                "TienTaiNguyen = ?,\n" +
                "NgayNhap = GETDATE()\n" +
                "WHERE Thang = ? AND Nam = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDouble(1, tienDien);
            stmt.setDouble(2, tienNuoc);
            stmt.setDouble(3, tienTaiNguyen);
            stmt.setInt(4, thang);
            stmt.setInt(5, nam);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public boolean checkChiPhi(int thang, int nam){
        String query = "SELECT * FROM ChiPhiHoatDong\n" +
            "WHERE Thang=? AND Nam =?";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ) {
            stmt.setInt(1, thang);
            stmt.setInt(2,nam);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
            else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
