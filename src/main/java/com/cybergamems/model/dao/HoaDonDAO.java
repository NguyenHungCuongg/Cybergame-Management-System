package com.cybergamems.model.dao;

import com.cybergamems.model.DatabaseConnection;
import com.cybergamems.model.entities.ChiTietHoaDon;
import com.cybergamems.model.entities.HoaDon;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HoaDonDAO {    
    public ArrayList<HoaDon> getAllHoaDon(){
        ArrayList<HoaDon> dsHoaDon = new ArrayList<>();
        String query ="SELECT\n" +
                    "HoaDon.MaHoaDon,\n" +
                    "HoaDon.TrangThaiHD, \n" +
                    "NhanVien.HoVaTen AS HoVaTenNhanVien,\n" +
                    "KhachHang.HoVaTen AS HoVaTenKhachHang,\n" +
                    "HoaDon.TongTien\n ," +
                    "HoaDon.NgayLapHD\n " +
                    "FROM HoaDon \n" +
                    "JOIN NhanVien ON NhanVien.MaNhanVien = HoaDon.MaNhanVien\n" +
                    "JOIN KhachHang ON KhachHang.MaKhachHang = HoaDon.MaKhachHang \n" +
                    "LEFT JOIN ChiTietHoaDon ON ChiTietHoaDon.MaHoaDon = HoaDon.MaHoaDon";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon(
                        rs.getInt("MaHoaDon"),
                        rs.getString("HoVatenNhanVien"),
                        rs.getString("HoVaTenKhachHang"),
                        rs.getBoolean("TrangThaiHD"), 
                        rs.getDouble("TongTien"),
                        rs.getDate("NgayLapHD")
                );
                dsHoaDon.add(hoaDon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsHoaDon;
    }
    
    public void addHoaDon(int maKhachHang,int maNhanVien, boolean trangThaiHD, Date ngayLapHD){
        String query="INSERT INTO HoaDon (MaKhachHang,MaNhanVien,NgayLapHD,TrangThaiHD)\n" +
                "VALUES\n" +
                "(?,?,?,?)";
        try(Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ){
            stmt.setInt(1, maKhachHang);
            stmt.setInt(2, maNhanVien);
            stmt.setDate(3,new java.sql.Date(ngayLapHD.getTime()));
            stmt.setInt(4, trangThaiHD?1:0);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }   
    }
    
    public HoaDon getHoaDon(int maKhachHang, int maNhanVien){
        String query = "SELECT TOP 1 WITH TIES\n" +
                "HoaDon.MaHoaDon,\n" +
                "HoaDon.TrangThaiHD, \n" +
                "NhanVien.HoVaTen AS HoVaTenNhanVien,\n" +
                "KhachHang.HoVaTen AS HoVaTenKhachHang,  \n" +
                "HoaDon.TongTien, \n" +
                "HoaDon.NgayLapHD\n" +
                "FROM HoaDon\n" +
                "JOIN NhanVien ON NhanVien.MaNhanVien = HoaDon.MaNhanVien \n" +
                "JOIN KhachHang ON KhachHang.MaKhachHang = HoaDon.MaKhachHang\n" +
                "WHERE HoaDon.MaKhachHang = ? AND HoaDon.MaNhanVien = ?\n" +
                "ORDER BY MaHoaDon DESC;";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, maKhachHang);
            stmt.setInt(2, maNhanVien);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon(
                        rs.getInt("MaHoaDon"),
                        rs.getString("HoVatenNhanVien"),
                        rs.getString("HoVaTenKhachHang"),
                        rs.getBoolean("TrangThaiHD"), //Ta có thể lấy giá trị Boolean với kiểu BIT trong database
                        rs.getDouble("TongTien"),
                        rs.getDate("NgayLapHD")
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
    
    public ArrayList<ChiTietHoaDon> getAllCTHD(int maHoaDon){
        ArrayList<ChiTietHoaDon> dsCTHD = new ArrayList<>();
        String query ="SELECT *\n" +
                        "FROM ChiTietHoaDon\n" +
                        "JOIN DichVu ON DichVu.MaDichVu = ChiTietHoaDon.MaDichVu\n" +
                        "WHERE MaHoaDon = ?;";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(query);
            ) {
            stmt.setInt(1, maHoaDon);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon(
                        rs.getInt("MaCTHD"),
                        rs.getString("TenDichVu"),
                        rs.getString("LoaiDichVu"),
                        rs.getDouble("SoLuong"),
                        rs.getDouble("DonGia")
                ); 
                dsCTHD.add(cthd);
                System.out.println(rs.getInt("MaCTHD"));
                System.out.println(rs.getInt("TenDichVu"));
                System.out.println(rs.getInt("LoaiDichVu"));
                System.out.println(rs.getInt("SoLuong"));
                System.out.println(rs.getInt("DonGia"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsCTHD;
    }
}
