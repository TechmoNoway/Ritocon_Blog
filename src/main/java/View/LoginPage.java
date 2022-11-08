
package View;

import Controller.LoginDTO;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;



public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        InputUsername = new javax.swing.JTextField();
        InputPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ToSignUpBtn = new com.k33ptoo.components.KButton();
        SignInBtn = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PasswordError = new javax.swing.JLabel();
        UsernameError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(950, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(204, 0, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InputUsername.setBackground(new Color(0,0,0,0));
        InputUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InputUsername.setForeground(new java.awt.Color(255, 255, 255));
        InputUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        InputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUsernameActionPerformed(evt);
            }
        });
        kGradientPanel1.add(InputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 390, 40));

        InputPassword.setBackground(new Color(0,0,0,0));
        InputPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InputPassword.setForeground(new java.awt.Color(255, 255, 255));
        InputPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        InputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPasswordActionPerformed(evt);
            }
        });
        kGradientPanel1.add(InputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 390, 40));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("username");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("password");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        ToSignUpBtn.setText("Sign Up");
        ToSignUpBtn.setkBorderRadius(50);
        ToSignUpBtn.setkEndColor(new java.awt.Color(0, 204, 204));
        ToSignUpBtn.setkHoverEndColor(new java.awt.Color(204, 0, 204));
        ToSignUpBtn.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        ToSignUpBtn.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        ToSignUpBtn.setkStartColor(new java.awt.Color(204, 0, 204));
        ToSignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToSignUpBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(ToSignUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 150, -1));

        SignInBtn.setText("Sign In");
        SignInBtn.setkBorderRadius(50);
        SignInBtn.setkEndColor(new java.awt.Color(0, 204, 204));
        SignInBtn.setkFillButton(false);
        SignInBtn.setkHoverEndColor(new java.awt.Color(204, 0, 204));
        SignInBtn.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        SignInBtn.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        SignInBtn.setkStartColor(new java.awt.Color(255, 255, 255));
        SignInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(SignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 150, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("or");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        ExitBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExitBtn.setText("X");
        ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBtnMouseClicked(evt);
            }
        });
        kGradientPanel1.add(ExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 20, 30));

        jLabel5.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 204));
        jLabel5.setText("RitoCon");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 220, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_male_user_96px_1.png"))); // NOI18N
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 90, 80));

        PasswordError.setForeground(new java.awt.Color(255, 0, 0));
        PasswordError.setText("Please insert your password!");
        kGradientPanel1.add(PasswordError, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 150, -1));

        UsernameError.setForeground(new java.awt.Color(255, 0, 0));
        UsernameError.setText("Please insert your user name! ");
        kGradientPanel1.add(UsernameError, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 160, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 980, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputUsernameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        UsernameError.setVisible(false);
        PasswordError.setVisible(false);
       
    }//GEN-LAST:event_formWindowOpened

    private void InputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPasswordActionPerformed
        
    }//GEN-LAST:event_InputPasswordActionPerformed

    private void ToSignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToSignUpBtnActionPerformed
        close();
        SignUpPage sup = new SignUpPage();
        sup.setVisible(true);
    }//GEN-LAST:event_ToSignUpBtnActionPerformed

    private void SignInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInBtnActionPerformed
        if(InputUsername.getText().equals("")){
            UsernameError.setVisible(true);
        } else {
            UsernameError.setVisible(false);
        }
        
        if (InputPassword.getText().equals("")) {
            PasswordError.setVisible(true);
        } else {
            PasswordError.setVisible(false);
        }
        this.login(InputUsername.getText(), InputPassword.getText());
        
    }//GEN-LAST:event_SignInBtnActionPerformed

    private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    private void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitBtn;
    private javax.swing.JPasswordField InputPassword;
    private javax.swing.JTextField InputUsername;
    private javax.swing.JLabel PasswordError;
    private com.k33ptoo.components.KButton SignInBtn;
    private com.k33ptoo.components.KButton ToSignUpBtn;
    private javax.swing.JLabel UsernameError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables

    public void login(String username, String password){
        if(!username.equals("")&&!password.equals("")){
            LoginDTO logindto = new LoginDTO();
            logindto.login(username, password);
        }
    }
}
