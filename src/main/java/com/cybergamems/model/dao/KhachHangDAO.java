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
                        rs.getString("Password"),
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

    public KhachHang getKhachHang(int maKhachHang){
        String query = "Select * From KhachHang Where KhachHang.MaKhachHang = ?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setInt(1, maKhachHang);
            ResultSet rs = stmt.executeQuery();
            KhachHang currentKhachHang = new KhachHang();
            while(rs.next()){
                currentKhachHang = new KhachHang(
                        rs.getInt("MaKhachHang"),
                        rs.getString("HoVaTen"),
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getString("Email"),
                        rs.getBoolean("TrangThaiKH")
                );
            }
            return currentKhachHang;
        }
        catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
    public void addKhachHang(String hoVaTen, String username, String matKhau, String email, int trangThai){
        String query="INSERT INTO KhachHang (HoVaTen,Username,Password,Email,TrangThaiKH)\n" +
                "VALUES\n" +
                "(?,?,?,?,?)";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ){
            stmt.setString(1, hoVaTen);
            stmt.setString(2, username);
            stmt.setString(3, matKhau);
            stmt.setString(4, email);
            stmt.setInt(5, trangThai);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }   
    }
    
    public void deleteKhachHang(int maKhachHang){
        String query="Delete from KhachHang Where MaKhachHang=?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setInt(1, maKhachHang);
            stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void updateKhachHang(int maKhachHang,String hoVaTen, String username, String matKhau, String email, int trangThai){
        String query = "Update KhachHang Set HoVaTen=?, Username=?,Password=?,Email=?, TrangThaiKH=? Where MaKhachHang=?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setString(1, hoVaTen);
            stmt.setString(2, username);
            stmt.setString(3,matKhau);
            stmt.setString(4, email);
            stmt.setInt(5, trangThai);
            stmt.setInt(6,maKhachHang);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
