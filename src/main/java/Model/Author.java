/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author phule
 */
public class Author extends User {
    private int amount_article;

    public Author(String name, String fullname, String phoneNumber, String password, String role, int amount_article) {
        super(name, fullname, phoneNumber, password, role);
        this.amount_article = amount_article;
    }

    public int getAmount_article() {
        return amount_article;
    }

    public void setAmount_article(int amount_article) {
        this.amount_article = amount_article;
    }
    
    
}
