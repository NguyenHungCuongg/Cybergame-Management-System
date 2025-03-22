package com.cybergamems.model.dao;

import com.cybergamems.model.DatabaseConnection;
import com.cybergamems.model.entities.MayTinh;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class MayTinhDAO {
    public ArrayList<MayTinh> getAllMayTinh(int maPhong){
        ArrayList<MayTinh> dsMayTinh = new ArrayList<>();
        String query = "SELECT \n" +
                        "    MayTinh.MaMay, \n" +
                        "    MayTinh.TrangThaiMay, \n" +
                        "    PhienChoi.MaKhachHang, \n" +
                        "    KhachHang.Username, \n" +
                        "    PhienChoi.ThoiGianBatDau\n" +
                        "FROM MayTinh\n" +
                        "LEFT JOIN PhienChoi ON MayTinh.MaMay = PhienChoi.MaMay \n" +
                        "    AND PhienChoi.ThoiGianKetThuc IS NULL  \n" +
                        "LEFT JOIN KhachHang ON PhienChoi.MaKhachHang = KhachHang.MaKhachHang\n" +
                        "WHERE MayTinh.MaPhong = ?; ";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setInt(1, maPhong);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                MayTinh currentMayTinh = new MayTinh(
                    rs.getInt("MaMay"),
                    rs.getString("TrangThaiMay"),
                    rs.getInt("MaKhachHang"),
                    rs.getString("Username"),
                    rs.getDate("ThoiGianBatDau")
                );
                dsMayTinh.add(currentMayTinh);
            }
            return dsMayTinh;
        }
        catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
