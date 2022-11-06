/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Object.User;
import View.SignUpPage;
import java.awt.Component;
import java.awt.Frame;
import javax.management.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author mphuc
 */
public class LoginDTO {
    private final DatabaseDTO db = new DatabaseDTO();
    private Frame SignUpPage;
    
    public boolean register(User user){
        String sql_insert = "insert into Users values (?, ?, ? , ?, ?)";
        String sql_check = "select * from Users where name_user like ?";
        String[] parameter = new String[]{user.getName(), 
                                            user.getFullname(), 
                                            user.getPhoneNumber(), 
                                            user.getPassword(), 
                                            user.getRole()
        };
        
        if(db.queryHaveParameter(sql_check, new String[]{user.getName()})){
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
    }
    
    public boolean login(String username, String password){
        String sql = "select * from Users where name_user like ? and password_user like ?";
        if(db.queryHaveParameter(sql, new String[]{username, password})){
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
    }
}
