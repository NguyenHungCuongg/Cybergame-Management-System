package com.cybergamems.model.dao;

import com.cybergamems.model.DatabaseConnection;
import com.cybergamems.model.entities.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HoaDonDAO {
    public void addHoaDon(int maKhachHang,int maNhanVien, boolean trangThaiHD){
        String query="INSERT INTO HoaDon (MaKhachHang,MaNhanVien,NgayLapHD,TrangThaiHD)\n" +
                "VALUES\n" +
                "(?,?,GETDATE(),?)";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ){
            stmt.setInt(1, maKhachHang);
            stmt.setInt(2, maNhanVien);
            stmt.setInt(3, trangThaiHD?1:0);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }   
    }
    
    public HoaDon getHoaDon(int maKhachHang, int maNhanVien){
        String query = "SELECT " +
                "HoaDon.MaHoaDon, " +
                "HoaDon.TrangThaiHD, " +
                "NhanVien.HoVaTen AS HoVaTenNhanVien, " +
                "KhachHang.HoVaTen AS HoVaTenKhachHang " +
            "FROM HoaDon " +
            "JOIN NhanVien ON NhanVien.MaNhanVien = HoaDon.MaNhanVien " +
            "JOIN KhachHang ON KhachHang.MaKhachHang = HoaDon.MaKhachHang " +
            "WHERE HoaDon.MaKhachHang = ? AND HoaDon.MaNhanVien = ?;";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, maKhachHang);
            stmt.setInt(2, maNhanVien);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                HoaDon hoaDon = new HoaDon(
                        rs.getInt("MaHoaDon"),
                        rs.getString("HoVatenNhanVien"),
                        rs.getString("HoVaTenKhachHang"),
                        rs.getBoolean("TrangThaiHD") //Ta có thể lấy giá trị Boolean với kiểu BIT trong database
                );
                return hoaDon;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void addCTHD(int maHoaDon,int maDichVu,double soLuong, double donGia, double thanhTien){
        String query = "INSERT INTO ChiTietHoaDon (MaHoaDon, MaDichVu, SoLuong, DonGia, ThanhTien) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, maHoaDon);
            stmt.setInt(2, maDichVu);
            stmt.setDouble(3, soLuong);
            stmt.setDouble(4, donGia);
            stmt.setDouble(5, thanhTien);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
