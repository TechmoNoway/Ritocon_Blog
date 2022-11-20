/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.Frame;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author mphuc
 */
public class ArticleDTO {
    private final DatabaseDTO db = new DatabaseDTO();
    private Frame SignUpPage;
    private ResultSet rs;
    
    public void showDetail(JLabel j1, JLabel j2, JLabel j3, int i){
        String sql = "select * from Articles where id_article = " + i;
        rs = db.queryHaveParameter(sql, new String[]{});
        try {
            if(rs.next()){
               j1.setText(rs.getString("title_article"));
               j2.setText(rs.getString("description_article"));
               setImagePage(rs.getString("image_article"), j3);
               System.out.println(rs.getString("image_article"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setImagePage(String imagePath, JLabel imageLabel) {
        try {
            File file = new File("E:\\FPT Polytechnic\\DuAn1\\Ritocon_Blog\\src\\main\\resources\\"+imagePath);
            Image image = ImageIO.read(file);
            imageLabel.setText("");
            int height = imageLabel.getHeight();
            int width = imageLabel.getWidth();
            imageLabel.setIcon(new ImageIcon(image.getScaledInstance(width, height, 0)));
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
