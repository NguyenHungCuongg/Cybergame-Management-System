package com.cybergamems.model.dao;

import com.cybergamems.model.DatabaseConnection;
import com.cybergamems.model.entities.MayTinh;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class MayTinhDAO {
    public ArrayList<MayTinh> getAllMayTinh(int maPhong){
        ArrayList<MayTinh> dsMayTinh = new ArrayList<>();
        String query = "SELECT \n" +
                        "MayTinh.MaMay,\n" +
                        "MayTinh.TrangThaiMay,\n" +
                        "PhienChoi.MaKhachHang,\n" +
                        "KhachHang.Username,\n" +
                        "PhienChoi.ThoiGianBatDau,\n" +
                        "Phong.GiaMoiGio\n" +
                        "FROM MayTinh\n" +
                        "JOIN Phong ON MayTinh.MaPhong = Phong.MaPhong\n" +
                        "LEFT JOIN PhienChoi ON MayTinh.MaMay = PhienChoi.MaMay\n" +
                        "AND PhienChoi.ThoiGianKetThuc IS NULL\n" +
                        "LEFT JOIN KhachHang ON PhienChoi.MaKhachHang = KhachHang.MaKhachHang\n" +
                        "WHERE MayTinh.MaPhong = ?; ";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setInt(1, maPhong);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Timestamp timestamp = rs.getTimestamp("ThoiGianBatDau");
                String formattedDate = null;
                if (timestamp != null) {
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    formattedDate = formatter.format(timestamp);
                } else {
                    formattedDate = "N/A"; 
                }
                MayTinh currentMayTinh = new MayTinh(
                    rs.getInt("MaMay"),
                    rs.getString("TrangThaiMay"),
                    rs.getInt("MaKhachHang"),
                    rs.getString("Username"),
                    formattedDate,
                    rs.getDouble("GiaMoiGio")
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
    
    public String kiemTraTinhTrang(int maMay){
        String result = "";
        String query = "SELECT TrangThaiMay FROM MayTinh WHERE MaMay = ?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setInt(1, maMay);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                result = rs.getString("TrangThaiMay");
            }
            return result;
        }
        catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
    public void addPhienChoi(int maKhachHang, int maMay){
        String query = "INSERT INTO PhienChoi (MaKhachHang,MaMay,ThoiGianBatDau)"
                + "VALUES(?,?,GETDATE())";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ){
            stmt.setInt(1, maKhachHang);
            stmt.setInt(2, maMay);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }   
    }
    
    public MayTinh getMayTinh(int maMay){
        String query = "SELECT \n" +
                        "MayTinh.MaMay,\n" +
                        "MayTinh.TrangThaiMay,\n" +
                        "PhienChoi.MaKhachHang,\n" +
                        "KhachHang.Username,\n" +
                        "PhienChoi.ThoiGianBatDau,\n" +
                        "Phong.GiaMoiGio\n" +
                        "FROM MayTinh\n" +
                        "JOIN Phong ON MayTinh.MaPhong = Phong.MaPhong\n" +
                        "LEFT JOIN PhienChoi ON MayTinh.MaMay = PhienChoi.MaMay\n" +
                        "AND PhienChoi.ThoiGianKetThuc IS NULL\n" +
                        "LEFT JOIN KhachHang ON PhienChoi.MaKhachHang = KhachHang.MaKhachHang\n" +
                        "WHERE MayTinh.MaMay = ?; ";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setInt(1, maMay);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                Timestamp timestamp = rs.getTimestamp("ThoiGianBatDau");
                String formattedDate = null;
                if (timestamp != null) {
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    formattedDate = formatter.format(timestamp);
                } else {
                    formattedDate = "N/A"; 
                }
                MayTinh currentMayTinh = new MayTinh(
                    rs.getInt("MaMay"),
                    rs.getString("TrangThaiMay"),
                    rs.getInt("MaKhachHang"),
                    rs.getString("Username"),
                    formattedDate,
                    rs.getDouble("GiaMoiGio")
                );
                return currentMayTinh;
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public void capNhatTrangThai(int maMay, String trangThai){
        String query = "UPDATE MayTinh SET TrangThaiMay = ? WHERE MaMay=?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ){
            stmt.setString(1, trangThai);
            stmt.setInt(2, maMay);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }  
    }
    
    public void deletePhienChoi(int maMay){
        String query = "DELETE FROM PhienChoi WHERE MaMay=?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ){
            stmt.setInt(1, maMay);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }   
    }
}
