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
}
