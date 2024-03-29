/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import JDBC.ConnectDTB;
import java.sql.Array;
import java.util.Arrays;

/**
 *
 * @author mphuc
 */
public class DatabaseDTO {
    ConnectDTB connect = new ConnectDTB();
    Connection conn;
    PreparedStatement prstm;
    ResultSet rs;
    
    public ResultSet queryHaveParameter(String sql, String[] parameter){
        try {
            System.out.println("" + Arrays.toString(parameter));
            conn = connect.GetConnect();
            prstm = conn.prepareStatement(sql);
            for (int i = 0; i< parameter.length; i++){
                prstm.setString(i+1, parameter[i]);
            }
            
            rs = prstm.executeQuery();
            
            return rs;
        } catch (Exception e) {
            System.out.println("" + e);
            return rs;
        }
    }
}
