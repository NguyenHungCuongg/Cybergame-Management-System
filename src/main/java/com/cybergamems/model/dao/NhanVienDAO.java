package com.cybergamems.model.dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cybergamems.model.entities.NhanVien;
import com.cybergamems.model.DatabaseConnection;
import java.util.Date;

public class NhanVienDAO {
    public ArrayList<NhanVien> getAllNhanVien(){
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        String query ="SELECT * FROM NhanVien JOIN ViTri On NhanVien.MaViTri = ViTri.MaViTri";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                NhanVien currentNhanvien = new NhanVien(
                        rs.getInt("MaNhanvien"),
                        rs.getString("HoVaTen"),
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getString("Email"),
                        rs.getBoolean("TrangThaiNV"),
                        rs.getString("TenViTri"),
                        rs.getDate("NgayVaoLam") //trả về java.sql.Date
                );
                dsNhanVien.add(currentNhanvien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }
    
    public NhanVien getNhanVien(int maNhanVien){
        String query = "Select * From NhanVien Join ViTri On NhanVien.MaViTri = ViTri.MaViTri Where NhanVien.MaNhanVien = ?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setInt(1, maNhanVien);
            ResultSet rs = stmt.executeQuery();
            NhanVien currentNhanVien = new NhanVien();
            while(rs.next()){
                currentNhanVien = new NhanVien(
                        rs.getInt("MaNhanvien"),
                        rs.getString("HoVaTen"),
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getString("Email"),
                        rs.getBoolean("TrangThaiNV"),
                        rs.getString("TenViTri"),
                        rs.getDate("NgayVaoLam") 
                );
            }
            return currentNhanVien;
        }
        catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
    public void addNhanVien(int maViTri, String hoVaTen, String username, String matKhau, String email, int trangThai, Date ngayVaoLam){
        String query="INSERT INTO NhanVien (MaViTri,HoVaTen,Username,Password,Email,TrangThaiNV,NgayVaoLam)\n" +
                "VALUES\n" +
                "(?,?,?,?,?,?,?)";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ){
            stmt.setInt(1, maViTri);
            stmt.setString(2, hoVaTen);
            stmt.setString(3, username);
            stmt.setString(4, matKhau);
            stmt.setString(5, email);
            stmt.setInt(6, trangThai);
            stmt.setDate(7, new java.sql.Date(ngayVaoLam.getTime())); //java.sql.Date nhận vào timestamp từ java.util.Date.
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }   
    }
    
    public void deleteNhanVien(int maNhanVien){
        String query="Delete from NhanVien Where MaNhanVien=?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setInt(1, maNhanVien);
            stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void updateNhanVIen(int maNhanVien,int maViTri, String hoVaTen, String username, String matKhau, String email, int trangThai){
        String query = "Update NhanVien Set HoVaTen=?, Username=?,Password=?,Email=?, MaViTri=?, TrangThaiNV=? Where MaNhanVien=?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setString(1, hoVaTen);
            stmt.setString(2, username);
            stmt.setString(3,matKhau);
            stmt.setString(4, email);
            stmt.setInt(5, maViTri);
            stmt.setInt(6, trangThai);
            stmt.setInt(7,maNhanVien);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
