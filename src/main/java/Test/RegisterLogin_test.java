/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Controller.LoginDTO;
import Model.User;

/**
 *
 * @author mphuc
 */
public class RegisterLogin_test {
    public static void main(String[] args) {
        User user = new User("phuckhoa33", "nguyen khoa minh phuc", "0972495038", "12345", "user");
        LoginDTO login = new LoginDTO();
//        login.register(user);
        login.login("phuckhoa3333", "12345");
    }
}
