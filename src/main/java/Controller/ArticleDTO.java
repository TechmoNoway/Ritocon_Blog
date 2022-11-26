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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Model.*;

/**
 *
 * @author mphuc
 */
public class ArticleDTO {
    private final DatabaseDTO db = new DatabaseDTO();
    private Frame SignUpPage;
    private ResultSet rs;
    private ArrayList<Article> arr = new ArrayList<>();
    public ArrayList<Article> temp;

    public ArticleDTO() {
        getAllArticle();
    }
    
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
    
    public void getAllArticle() {
        String sql = "select * from Articles";
        rs = db.queryHaveParameter(sql, new String[]{});
        try {
            if(rs.next()){
                while(rs.next()){
                    Article at = new Article(rs.getInt("id_article"),  
                                             rs.getString("title_article"),
                                             rs.getString("description_article"),
                                             rs.getString("date_article"),
                                             rs.getString("image_article"),
                                             rs.getString("state_article"),
                                             rs.getString("author_article"));
                    arr.add(at);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Article> getSingle(int page) {
        try {
            if(page > arr.size()/4 && page < arr.size()/4+2 || page < 0){
                temp = new ArrayList<Article>(arr.subList((arr.size()/4)*4-1, arr.size()));
            }
            else if(page==1 || page > arr.size()/4+1) {
                temp = new ArrayList<Article>(arr.subList(0,4));
            }
            else {
                temp = new ArrayList<Article>(arr.subList(3*page,3*page+4));
            }
            return temp;
        } catch (Exception e) {
            System.out.println("This is not error. This is feature");
        }
        return temp;
    }
    
    public void delete_article(int id){
        String sql = "delete Articles where id_article = ?";
        db.queryHaveParameter(sql, new String[]{String.valueOf(temp.get(id).getId())});
    }
    
    public void fillEachArticle(JLabel jb1, JLabel jb2, JLabel jb3, JLabel jb4, int index) {
        try {
            setImagePage(temp.get(index).getImage(), jb1);
            jb2.setText(temp.get(index).getTitle());
            jb3.setText(temp.get(index).getDate());
            jb4.setText(temp.get(index).getState());
        } catch (Exception e) {
            System.out.println("This is not error. This is feature");
        }
        
    }
    
    public boolean checkState(int id){
        return temp.get(id).getState().equals("done");
    }
    
    public int getLenDash(){
        return temp.size()/4+1;
    }
    
    public void nextDashBoard(int page){
        page += 1;
        if(page > getLenDash()){
            page = 1;
        }
        getSingle(page);
    }
    
    public void prevDashBoard(int page){
        page -= 1;
        if(page<1){
            page = getLenDash();
        }
        getSingle(page);
    }
}
