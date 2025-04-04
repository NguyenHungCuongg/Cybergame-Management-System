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
    
    public ArrayList<NhanVien> getAllSearchedNhanVien(String searchInput){
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        String query ="SELECT * FROM NhanVien JOIN ViTri On NhanVien.MaViTri = ViTri.MaViTri "
                + "WHERE MaNhanvien LIKE ? OR HoVaTen LIKE ? OR Username LIKE ? "
                + "OR Email LIKE ?";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ) {
            String searchPattern = "%" + searchInput + "%";
            stmt.setString(1, searchPattern);
            stmt.setString(2, searchPattern);
            stmt.setString(3, searchPattern);
            stmt.setString(4, searchPattern);
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
        String query = "SELECT * FROM NhanVien JOIN ViTri ON NhanVien.MaViTri = ViTri.MaViTri WHERE NhanVien.MaNhanVien = ?";
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
        String query="DELETE FROM NhanVien WHERE MaNhanVien=?";
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
        String query = "UPDATE NhanVien SET HoVaTen=?, Username=?,Password=?,Email=?, MaViTri=?, TrangThaiNV=? WHERE MaNhanVien=?";
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
    
    public NhanVien loginNhanVien(String username, String matKhau){
        String query = "SELECT * FROM NhanVien WHERE Username=? AND Password=? AND MaViTri=1";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setString(1, username);
            stmt.setString(2, matKhau);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                int maNhanVien = rs.getInt("MaNhanVien");
                NhanVien loginedNhanVien = getNhanVien(maNhanVien);
                return loginedNhanVien;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public void changePassword(String email, String matKhauMoi){
        String query = "UPDATE NhanVien SET Password=? WHERE Email=?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setString(1, matKhauMoi);
            stmt.setString(2, email);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
