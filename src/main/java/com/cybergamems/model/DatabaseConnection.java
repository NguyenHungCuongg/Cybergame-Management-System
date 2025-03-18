package com.cybergamems.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Thông tin kết nối
    private static final String databaseConnectionURL = "jdbc:sqlserver://localhost:1433;databaseName=CyberGameMS;encrypt=true;trustServerCertificate=true";
    private static final String databaseUser = "sa"; 
    private static final String databasePassword = "123"; 


    // Phương thức để lấy kết nối
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(databaseConnectionURL, databaseUser, databasePassword);
    }
}
