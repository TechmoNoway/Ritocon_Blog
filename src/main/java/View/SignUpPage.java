/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.LoginDTO;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import Model.*;


/**
 *
 * @author ASUS
 */
public class SignUpPage extends javax.swing.JFrame {

    /**
     * Creates new form SignUpPage2
     */
    public SignUpPage() {
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
        WelcomTitle = new javax.swing.JLabel();
        Welcometitle2 = new javax.swing.JLabel();
        Thumnail = new javax.swing.JLabel();
        SubmitBtn = new com.k33ptoo.components.KButton();
        NamePanel = new javax.swing.JPanel();
        InputName = new javax.swing.JTextField();
        PasswordPanel = new javax.swing.JPanel();
        InputPassword = new javax.swing.JTextField();
        PhoneNumberPanel = new javax.swing.JPanel();
        InputPhoneNumber = new javax.swing.JTextField();
        UsernamePanel = new javax.swing.JPanel();
        InputUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        GoBackLogin = new javax.swing.JLabel();
        FirstLineError = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JLabel();
        FirstLineError1 = new javax.swing.JLabel();
        ExitBtn1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(950, 650));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomTitle.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        WelcomTitle.setForeground(new java.awt.Color(204, 204, 204));
        WelcomTitle.setText("Welcome");
        kGradientPanel1.add(WelcomTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 220, 70));

        Welcometitle2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Welcometitle2.setForeground(new java.awt.Color(204, 204, 204));
        Welcometitle2.setText("Let's sign you up quickly");
        kGradientPanel1.add(Welcometitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 270, -1));

        Thumnail.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Thumnail.setForeground(new java.awt.Color(204, 204, 204));
        Thumnail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Thumnail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back2.png"))); // NOI18N
        Thumnail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(204, 0, 204)));
        Thumnail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Thumnail.setPreferredSize(new java.awt.Dimension(950, 48));
        kGradientPanel1.add(Thumnail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 700));

        SubmitBtn.setBorder(null);
        SubmitBtn.setForeground(new java.awt.Color(0, 0, 0));
        SubmitBtn.setText("SUBMIT");
        SubmitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SubmitBtn.setkBorderRadius(0);
        SubmitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitBtnMouseClicked(evt);
            }
        });
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 170, 50));

        NamePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        InputName.setBackground(new java.awt.Color(0, 0, 0));
        InputName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InputName.setForeground(new java.awt.Color(153, 153, 153));
        InputName.setText("Enter your name");
        InputName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        InputName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InputNameFocusLost(evt);
            }
        });
        InputName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NamePanelLayout = new javax.swing.GroupLayout(NamePanel);
        NamePanel.setLayout(NamePanelLayout);
        NamePanelLayout.setHorizontalGroup(
            NamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NamePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(InputName, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NamePanelLayout.setVerticalGroup(
            NamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NamePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(InputName, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel1.add(NamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 450, 60));

        PasswordPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        InputPassword.setBackground(new java.awt.Color(0, 0, 0));
        InputPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InputPassword.setForeground(new java.awt.Color(153, 153, 153));
        InputPassword.setText("Enter password");
        InputPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        InputPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InputPasswordFocusLost(evt);
            }
        });
        InputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PasswordPanelLayout = new javax.swing.GroupLayout(PasswordPanel);
        PasswordPanel.setLayout(PasswordPanelLayout);
        PasswordPanelLayout.setHorizontalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(InputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PasswordPanelLayout.setVerticalGroup(
            PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(InputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel1.add(PasswordPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 450, 60));

        PhoneNumberPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        InputPhoneNumber.setBackground(new java.awt.Color(0, 0, 0));
        InputPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InputPhoneNumber.setForeground(new java.awt.Color(153, 153, 153));
        InputPhoneNumber.setText("Enter phone number");
        InputPhoneNumber.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        InputPhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputPhoneNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InputPhoneNumberFocusLost(evt);
            }
        });
        InputPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPhoneNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PhoneNumberPanelLayout = new javax.swing.GroupLayout(PhoneNumberPanel);
        PhoneNumberPanel.setLayout(PhoneNumberPanelLayout);
        PhoneNumberPanelLayout.setHorizontalGroup(
            PhoneNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InputPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );
        PhoneNumberPanelLayout.setVerticalGroup(
            PhoneNumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InputPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        kGradientPanel1.add(PhoneNumberPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 450, 60));

        UsernamePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        InputUsername.setBackground(new java.awt.Color(0, 0, 0));
        InputUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InputUsername.setForeground(new java.awt.Color(153, 153, 153));
        InputUsername.setText("Enter username");
        InputUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 25, 1, 1));
        InputUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InputUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                InputUsernameFocusLost(evt);
            }
        });
        InputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UsernamePanelLayout = new javax.swing.GroupLayout(UsernamePanel);
        UsernamePanel.setLayout(UsernamePanelLayout);
        UsernamePanelLayout.setHorizontalGroup(
            UsernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsernamePanelLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(InputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        UsernamePanelLayout.setVerticalGroup(
            UsernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsernamePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(InputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        kGradientPanel1.add(UsernamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 450, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("already have an account?");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, -1, -1));

        GoBackLogin.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        GoBackLogin.setForeground(new java.awt.Color(204, 0, 204));
        GoBackLogin.setText("log-in");
        GoBackLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoBackLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GoBackLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GoBackLoginMouseExited(evt);
            }
        });
        kGradientPanel1.add(GoBackLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, -1, -1));

        FirstLineError.setForeground(new java.awt.Color(255, 0, 0));
        FirstLineError.setText("Please Insert Enough Information !");
        kGradientPanel1.add(FirstLineError, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 200, -1));

        ExitBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        ExitBtn.setForeground(new java.awt.Color(255, 255, 255));
        ExitBtn.setText("X");
        ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBtnMouseClicked(evt);
            }
        });
        kGradientPanel1.add(ExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, 20, 30));

        FirstLineError1.setForeground(new java.awt.Color(255, 0, 0));
        FirstLineError1.setText("Please Insert Enough Information !");
        kGradientPanel1.add(FirstLineError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 200, -1));

        ExitBtn1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        ExitBtn1.setForeground(new java.awt.Color(255, 255, 255));
        ExitBtn1.setText("X");
        ExitBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBtnMouseClicked(evt);
            }
        });
        kGradientPanel1.add(ExitBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 20, 30));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 1040, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        if (InputPhoneNumber.getText().equals("Enter phone number")) {
            FirstLineError.setVisible(true);
        } else {
            FirstLineError.setVisible(false);
        }
        if (InputUsername.getText().equals("Enter username")) {
            FirstLineError.setVisible(true);
        } else {
            FirstLineError.setVisible(false);
        }
        if (InputPassword.getText().equals("Enter password")) {
            FirstLineError.setVisible(true);
        } else {
            FirstLineError.setVisible(false);
        }
        if (InputName.getText().equals("Enter your name")) {
            FirstLineError.setVisible(true);
        } else {
            FirstLineError.setVisible(false);
        }

    }//GEN-LAST:event_SubmitBtnActionPerformed


    private void InputNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputNameFocusGained
        if (InputName.getText().equals("Enter your name")) {
            InputName.setText("");
            InputName.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_InputNameFocusGained

    private void InputNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputNameFocusLost
        if (InputName.getText().equals("")) {
            InputName.setText("Enter your name");
            InputName.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_InputNameFocusLost

    private void InputNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNameActionPerformed

    }//GEN-LAST:event_InputNameActionPerformed

    private void InputPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputPasswordFocusGained
        if (InputPassword.getText().equals("Enter password")) {
            InputPassword.setText("");
            InputPassword.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_InputPasswordFocusGained

    private void InputPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputPasswordFocusLost
        if (InputPassword.getText().equals("")) {
            InputPassword.setText("Enter password");
            InputPassword.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_InputPasswordFocusLost

    private void InputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPasswordActionPerformed

    private void InputPhoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputPhoneNumberFocusGained
        if (InputPhoneNumber.getText().equals("Enter phone number")) {

            InputPhoneNumber.setText("");
            InputPhoneNumber.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_InputPhoneNumberFocusGained

    private void InputPhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputPhoneNumberFocusLost
        if (InputPhoneNumber.getText().equals("")) {
            InputPhoneNumber.setText("Enter phone number");
            InputPhoneNumber.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_InputPhoneNumberFocusLost

    private void InputPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPhoneNumberActionPerformed

    private void InputUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputUsernameFocusGained
        if (InputUsername.getText().equals("Enter username")) {
            InputUsername.setText("");
            InputUsername.setForeground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_InputUsernameFocusGained

    private void InputUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InputUsernameFocusLost
        if (InputUsername.getText().equals("")) {
            InputUsername.setText("Enter username");
            InputUsername.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_InputUsernameFocusLost

    private void InputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputUsernameActionPerformed

    private void GoBackLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackLoginMouseClicked
        close();
        LoginPage form = new LoginPage();
        form.setVisible(true);
    }//GEN-LAST:event_GoBackLoginMouseClicked

    private void GoBackLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackLoginMouseEntered
        GoBackLogin.setForeground(new Color(0, 255, 0));
    }//GEN-LAST:event_GoBackLoginMouseEntered

    private void GoBackLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoBackLoginMouseExited
        GoBackLogin.setForeground(new Color(204, 0, 204));
    }//GEN-LAST:event_GoBackLoginMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        FirstLineError.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitBtnMouseClicked

    private void SubmitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitBtnMouseClicked
        // TODO add your handling code here:
        register(InputUsername.getText(), InputName.getText(), InputPhoneNumber.getText(), InputPassword.getText(), "user");
    }//GEN-LAST:event_SubmitBtnMouseClicked

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
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpPage().setVisible(true);
            }
        });
    }

    private void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExitBtn;
    private javax.swing.JLabel ExitBtn1;
    private javax.swing.JLabel FirstLineError;
    private javax.swing.JLabel FirstLineError1;
    private javax.swing.JLabel GoBackLogin;
    private javax.swing.JTextField InputName;
    private javax.swing.JTextField InputPassword;
    private javax.swing.JTextField InputPhoneNumber;
    private javax.swing.JTextField InputUsername;
    private javax.swing.JPanel NamePanel;
    private javax.swing.JPanel PasswordPanel;
    private javax.swing.JPanel PhoneNumberPanel;
    private com.k33ptoo.components.KButton SubmitBtn;
    private javax.swing.JLabel Thumnail;
    private javax.swing.JPanel UsernamePanel;
    private javax.swing.JLabel WelcomTitle;
    private javax.swing.JLabel Welcometitle2;
    private javax.swing.JLabel jLabel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables

    public void register(String name, String fullname, String phoneNumber, String password, String role){
        User user = new User(name, fullname, phoneNumber, password, role);
        LoginDTO logindto = new LoginDTO();
        if(!name.equals("Enter username") && 
                !fullname.equals("Enter your name")&&
                !phoneNumber.equals("Enter phone number") &&
                !password.equals("Enter password"))
        {
            boolean check = logindto.register(user);
            if(check){
                close();
                LoginPage form = new LoginPage();
                form.setVisible(true);
            }
        }
      
    }
}
