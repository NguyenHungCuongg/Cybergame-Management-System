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
        String query = "SELECT * FROM KhachHang";
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
    
    public ArrayList<KhachHang> getAllSearchedKhachHang(String searchInput){
        ArrayList<KhachHang> dsKhachHang = new ArrayList<>();
        String query = "SELECT * FROM KhachHang WHERE MaKhachHang LIKE ? "
                + "OR HoVaTen LIKE ? OR Username LIKE ? "
                + "OR Email LIKE ?";
        try(Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            ){
            String searchPattern = "%" + searchInput + "%";
            stmt.setString(1, searchPattern);
            stmt.setString(2, searchPattern);
            stmt.setString(3, searchPattern);
            stmt.setString(4, searchPattern);
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
        String query = "SELECT * FROM KhachHang WHERE KhachHang.MaKhachHang = ?";
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
    
    public KhachHang getKhachHangByUsername(String username){
        String query = "SELECT * FROM KhachHang WHERE KhachHang.Username = ?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setString(1, username);
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
    
    public void setTrangThaiKHByUsername(int trangThai, String username){
        String query = "UPDATE KhachHang\n" +
                    "SET TrangThaiKH = ?\n" +
                    "WHERE Username = ?;";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setInt(1, trangThai);
            stmt.setString(2,username);
            stmt.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }      
    }
    
    public KhachHang getKhachHangByMaMay(int maMay){
        String query = "SELECT * FROM KhachHang\n" +
                        "JOIN PhienChoi ON PhienChoi.MaKhachHang = KhachHang.MaKhachHang\n" +
                        "WHERE PhienChoi.MaMay = ?";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);){
            stmt.setInt(1, maMay);
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
        String query="DELETE FROM KhachHang WHERE MaKhachHang=?";
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
        String query = "UPDATE KhachHang SET HoVaTen=?, Username=?,Password=?,Email=?, TrangThaiKH=? WHERE MaKhachHang=?";
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
