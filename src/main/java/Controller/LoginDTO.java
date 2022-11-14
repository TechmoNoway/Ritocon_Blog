/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mphuc
 */
public class LoginDTO {
    private final DatabaseDTO db = new DatabaseDTO();
    private Frame SignUpPage;
    private ResultSet rs;
    
    public boolean register(User user){
        String sql_insert = "insert into Users values (?, ?, ? , ?, ?)";
        String sql_check = "select * from Users where name_user = ?";
        String[] parameter = new String[]{user.getName(), 
                                            user.getFullname(), 
                                            user.getPhoneNumber(), 
                                            user.getPassword(), 
                                            user.getRole()
        };
        
        try {
            if(db.queryHaveParameter(sql_check, new String[]{user.getName()}).next()){
                JOptionPane.showMessageDialog(SignUpPage, "This user is exist!",
                        "Enter again", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            else {
                db.queryHaveParameter(sql_insert, parameter);
                JOptionPane.showMessageDialog(null,
                        "Register is successfully",
                        "SUCCESS",
                        JOptionPane.DEFAULT_OPTION);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDTO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean login(String username, String password){
        String sql = "select * from Users where name_user = ? and password_user = ?";
        String sql1 = "insert into Currents values (?, ?, ? , ?, ?, ?)";
        try {
            rs = db.queryHaveParameter(sql, new String[]{username, password});
            if(rs.next()){
                db.queryHaveParameter(sql1, new String[]{
                    String.valueOf(rs.getInt("id_user")), 
                    rs.getString("name_user"),
                    rs.getString("fullname_user"),
                    rs.getString("phoneNumber_user"),
                    rs.getString("password_user"),
                    rs.getString("role_user")
                });
                JOptionPane.showMessageDialog(null,
                        "Login is sucessfully",
                        "SUCCESS",
                        JOptionPane.DEFAULT_OPTION);
                return true;
            }
            else {
                JOptionPane.showMessageDialog(null,
                        "Username or Password is wrong!!!",
                        "TITLE",
                        JOptionPane.WARNING_MESSAGE);
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDTO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public void logout() {
        String sql = "delete Currents where id_user = ?";
        String sql1 = "select * from Currents";
        
        rs = db.queryHaveParameter(sql1, new String[]{});
        
        try {
            if(rs.next()){   
                db.queryHaveParameter(sql, new String[]{rs.getString("id_user")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isLogin(){
        String sql = "select * from Currents";
        rs = db.queryHaveParameter(sql, new String[]{});
        try {
            if(rs.next()){
                return true;
            }
            else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDTO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public String[] printAccount(){
        String[] arr = null;
        String sql = "select * from Currents";
        
        rs = db.queryHaveParameter(sql, new String[]{});
        
        try {
            if(rs.next()){
                arr = new String[]{rs.getString("fullname_user"),
                                    rs.getString("phoneNumber_user"),
                                    rs.getString("name_user"),
                                    rs.getString("password_user")};
            }
        } catch (Exception e) {
            System.out.println("");
        }
        
        return arr;
    }
    
    
    public void changeInformation(String[] arr){
        String sql = "update Currents set "
                + "fullname_user = ?, "
                + "phoneNumber_user = ?, "
                + "name_user = ?, "
                + "password_user = ? "
                + "where id_user = ? ";
        
        rs = db.queryHaveParameter("select * from Currents", new String[]{});
        try {
            if(rs.next()){
                System.out.println("Dit me may");
                db.queryHaveParameter(sql, new String[]{arr[0], arr[1], arr[2], arr[3], rs.getString("id_user")});
                JOptionPane.showMessageDialog(null,
                        "Update profile is sucessfully",
                        "SUCCESS",
                        JOptionPane.DEFAULT_OPTION);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public String changeUsername(){
        String sql = "select * from Currents";
        rs = db.queryHaveParameter(sql, new String[]{});
        
        try {
            if(rs.next()){
                return rs.getString("name_user");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDTO.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
        return "";
    }
}
