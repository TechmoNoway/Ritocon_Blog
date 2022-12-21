/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Model.Comment;

/**
 *
 * @author mphuc
 */
public class CommentDTO {
    private final DatabaseDTO db = new DatabaseDTO();
    private ResultSet rs;
    
    
    public void fillTable(DefaultTableModel jt, String id){
        rs = db.queryHaveParameter("select * from [CommentView] where id_article = ?", new String[]{id});
        jt.setRowCount(0);

        try {
            while(rs.next()){
                jt.addRow(new Object[]{
                    rs.getString("name_user"),
                    rs.getString("content")
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(CommentDTO.class.getName()).log(Level.SEVERE, null, ex);
        }

        jt.fireTableDataChanged();
    }
    
    public void doComment(Comment comm){
        String sql = "insert into Comments values (?,?,?)";
        db.queryHaveParameter(sql, new String[]{String.valueOf(comm.getId_user()), String.valueOf(comm.getId_article()), comm.getContent()});
    }
}
