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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mphuc
 */
public class ArticleDTO  {
    private final DatabaseDTO db = new DatabaseDTO();
    private Frame SignUpPage;
    private ResultSet rs;
    private ArrayList<Article> arr = new ArrayList<>();
    public ArrayList<Article> temp;
    int page = 1;
    CommentDTO commentdto = new CommentDTO();
    int id_comment = 0;

    public ArticleDTO() {
        getAllArticle();
    }
    
    public void showDetail(JLabel j1, JLabel j2, JLabel j3, DefaultTableModel tblModel, int i){
        int index = 0;
        if(i > arr.size()){
            index = arr.get(arr.size()-1).getId();
        }
        else {
            index = arr.get(index).getId();
        }
        String sql = "select * from Articles where id_article = " + index;
        rs = db.queryHaveParameter(sql, new String[]{});
        try {
            if(rs.next()){
               j1.setText(rs.getString("title_article"));
               j2.setText(rs.getString("description_article"));
               setImagePage(rs.getString("image_article"), j3);
               commentdto.fillTable(tblModel, String.valueOf(index));
               id_comment = index;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setImagePage(String imagePath, JLabel imageLabel) {
        try {
            
            File file = null;
            if(imagePath.length() > 30){
                file = new File(imagePath);
            }
            else {
                file = new File("E:\\Github\\Ritocon_Blog\\src\\main\\resources\\"+imagePath);
            }
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
    
    public void getSingle(int page) {
        try {
            if(page == getLenDash()){
                temp = new ArrayList<Article>(arr.subList(arr.size()-4, arr.size()));
            }
            else if(page == 1) {
                temp = new ArrayList<Article>(arr.subList(0,4));
            }
            else {
                temp = new ArrayList<Article>(arr.subList(3*page+1,3*page+3));
            }
        } catch (Exception e) {
            System.out.println("This is not error. This is feature");
        }
    }
    
    public void delete_article(int id, int page){
        String sql = "delete Articles where id_article = ?";
        db.queryHaveParameter(sql, new String[]{String.valueOf(temp.get(id).getId())});
        arr.clear();
        getAllArticle();
        getSingle(page);
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
        return arr.size()/4+1;
    }
    
    public void nextDashBoard(JLabel jb){
        page += 1;
        if(page > getLenDash()){
            page = 1;
        }
        jb.setText(page+"/"+getLenDash());
        temp.clear();
        getSingle(page);
    }
    
    public void prevDashBoard(JLabel jb){
        page -= 1;
        if(page<1){
            page = getLenDash();
        }
        jb.setText(page+"/"+getLenDash());
        temp.clear();
        getSingle(page);
    }
    
    public int getIdOfDetal(int i){
        int index = 0;
        if(i > arr.size()){
            index = arr.get(arr.size()-1).getId();
        }
        else {
            index = arr.get(index).getId();
        }
        return index; 
    }
    
    public int getIdComment() {
        return id_comment;
    }
    
    public void comment(JTextField InputComment ,DefaultTableModel tblModel, int id_user){
        Comment comm = new Comment(id_user, id_comment, InputComment.getText());
        commentdto.doComment(comm);
        commentdto.fillTable(tblModel, String.valueOf(id_comment));
        InputComment.setText("");
    }
    
    public void updateArticle(String title, String image, String desc, int id){
        String sql = "update Articles set title_article = ? "
                + ", image_article = ? "
                + ", description_article = ? "
                + "where id_article = ?";
        db.queryHaveParameter(sql, new String[]{title, image, desc, String.valueOf(id)});
    }
    
    public void createNewPost(String title, String image, String desc, String author){
        String sql = "insert into Articles values (?,?, CURRENT_TIMESTAMP,?,'pending',?)";
        db.queryHaveParameter(sql, new String[]{title, desc , image, author});
    }
    
    public void searchArticle(DefaultTableModel jt, String title){
        String sql = "select * from dbo.SearchView where title_article like ?";
        rs = db.queryHaveParameter(sql, new String[]{title+"%"});
        jt.setRowCount(0);

        try {
            while(rs.next()){
                jt.addRow(new Object[]{
                    rs.getString("id_article"),
                    rs.getString("title_article"),
                    rs.getString("comments"),
                    rs.getString("author"),
                    rs.getString("date_article")
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommentDTO.class.getName()).log(Level.SEVERE, null, ex);
        }

        jt.fireTableDataChanged();
    }
}
