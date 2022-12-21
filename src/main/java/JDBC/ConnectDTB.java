/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mphuc
 */
public class ConnectDTB {
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://localhost; database = t1con";
    private static String user = "sa";
    private static String password = "songlong";
    Connection conn;
    
    public Connection GetConnect(){
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connect Thanh Cong");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return conn;
    }
}
