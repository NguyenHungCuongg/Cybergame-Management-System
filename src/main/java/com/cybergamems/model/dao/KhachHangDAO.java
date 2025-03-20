package com.cybergamems.model.dao;

import com.cybergamems.model.entities.KhachHang;
import com.cybergamems.model.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class KhachHangDAO {
    public ArrayList<KhachHang> getAllKhachHang(){
        ArrayList<KhachHang> dsKhachHang = new ArrayList<>();
        String query = "Select * from KhachHang";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ){
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                KhachHang currentKhachHang = new KhachHang(
                        rs.getInt("MaKhachHang"),
                        rs.getString("HoVaTen"),
                        rs.getString("Username"),
                        rs.getString("Email"),
                        rs.getBoolean("TrangThaiKH")
                );
                dsKhachHang.add(currentKhachHang);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return dsKhachHang;
    }
}
