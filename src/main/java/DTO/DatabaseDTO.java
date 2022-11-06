/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author mphuc
 */
public class DatabaseDTO {
    String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=t1con";
    Connection conn;
    PreparedStatement prstm;
    ResultSet rs;
    
    public boolean queryHaveParameter(String sql, String[] parameter){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionURL, "sa", "songlong");
            prstm = conn.prepareStatement(sql);
            for (int i = 0; i< parameter.length; i++){
                prstm.setString(i+1, parameter[i]);
            }
            
            rs = prstm.executeQuery();
            
            return rs.next();
        } catch (Exception e) {
            System.out.println("" + e);
            return false;
        }
    }
}
