package com.cybergamems.view.frames;

import com.cybergamems.controller.NhanVienController;
import com.cybergamems.model.entities.NhanVien;
import java.awt.Color;
import javax.swing.*;
import com.formdev.flatlaf.intellijthemes.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        try {
            UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme: " + e.getMessage());
        }
        initComponents();
        initButtonEvent();
        try {
            UIManager.setLookAndFeel(new FlatDarkFlatIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Flat: " + e.getMessage());
        }
    }
    
    public void initButtonEvent(){
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String tenDangNhap = usernameTextField.getText().trim();
                String matKhau = passwordTextField.getText().trim();
                
                System.out.println(tenDangNhap);
                System.out.println(matKhau);
                
                NhanVienController nhanVienController = new NhanVienController();
                NhanVien loginedNhanVien = nhanVienController.loginNhanVienIntoModel(tenDangNhap, matKhau);
                if(loginedNhanVien!=null){
                    dispose();
                    MainDashboardFrame mainDashboardFrame = new MainDashboardFrame(loginedNhanVien);
                    mainDashboardFrame.setLocationRelativeTo(null);
                    mainDashboardFrame.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Đăng nhập thất bại, hãy thử lại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginMainPanel = new javax.swing.JPanel();
        imageLoginSection = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputLoginSection = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        welcomeLoginLabel = new javax.swing.JLabel();
        forgotPasswordLabel = new javax.swing.JLabel();
        hideEyeIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginMainPanel.setBackground(new java.awt.Color(31, 31, 31));

        imageLoginSection.setBackground(new java.awt.Color(204, 204, 204));
        imageLoginSection.setName(""); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\UIT\\JavaLearningProject\\CybergameMS\\src\\main\\resources\\images\\game-stuff-2.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 427));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 427));
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 427));

        javax.swing.GroupLayout imageLoginSectionLayout = new javax.swing.GroupLayout(imageLoginSection);
        imageLoginSection.setLayout(imageLoginSectionLayout);
        imageLoginSectionLayout.setHorizontalGroup(
            imageLoginSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imageLoginSectionLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        imageLoginSectionLayout.setVerticalGroup(
            imageLoginSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        inputLoginSection.setBackground(new java.awt.Color(31, 31, 31));

        usernameTextField.setBackground(new java.awt.Color(41, 41, 41));
        usernameTextField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(153, 153, 153));
        usernameTextField.setText("Tên đăng nhập");
        usernameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFieldFocusLost(evt);
            }
        });
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        passwordTextField.setBackground(new java.awt.Color(41, 41, 41));
        passwordTextField.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(153, 153, 153));
        passwordTextField.setText("Mật khẩu");
        passwordTextField.setEchoChar('\u0000');
        passwordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTextFieldFocusLost(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(255, 140, 0));
        loginButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Đăng nhập");

        welcomeLoginLabel.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        welcomeLoginLabel.setForeground(new java.awt.Color(255, 140, 0));
        welcomeLoginLabel.setText("CHÀO MỪNG ĐẾN VỚI CYBER CORE");

        forgotPasswordLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        forgotPasswordLabel.setText("Quên mật khẩu?");

        javax.swing.GroupLayout inputLoginSectionLayout = new javax.swing.GroupLayout(inputLoginSection);
        inputLoginSection.setLayout(inputLoginSectionLayout);
        inputLoginSectionLayout.setHorizontalGroup(
            inputLoginSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputLoginSectionLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(inputLoginSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(forgotPasswordLabel)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hideEyeIcon)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputLoginSectionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLoginLabel)
                .addGap(17, 17, 17))
        );
        inputLoginSectionLayout.setVerticalGroup(
            inputLoginSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputLoginSectionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLoginLabel)
                .addGap(56, 56, 56)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(inputLoginSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hideEyeIcon))
                .addGap(10, 10, 10)
                .addComponent(forgotPasswordLabel)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout loginMainPanelLayout = new javax.swing.GroupLayout(loginMainPanel);
        loginMainPanel.setLayout(loginMainPanelLayout);
        loginMainPanelLayout.setHorizontalGroup(
            loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginMainPanelLayout.createSequentialGroup()
                .addComponent(imageLoginSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputLoginSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        loginMainPanelLayout.setVerticalGroup(
            loginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputLoginSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imageLoginSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void usernameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusGained
        // TODO add your handling code here:
        if(usernameTextField.getText().equals("Tên đăng nhập")){
            usernameTextField.setText("");
            usernameTextField.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_usernameTextFieldFocusGained

    private void usernameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFieldFocusLost
        // TODO add your handling code here:
        if(usernameTextField.getText().trim().equals("")){
            usernameTextField.setText("Tên đăng nhập");
            usernameTextField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_usernameTextFieldFocusLost

    private void passwordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFieldFocusGained
        // TODO add your handling code here:
        if(passwordTextField.getText().equals("Mật khẩu")){
            passwordTextField.setText("");
            passwordTextField.setForeground(new Color(204,204,204));
            passwordTextField.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_passwordTextFieldFocusGained

    private void passwordTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFieldFocusLost
        // TODO add your handling code here:
        if(passwordTextField.getText().equals("")){
            passwordTextField.setText("Mật khẩu");
            passwordTextField.setForeground(new Color(153,153,153));
            passwordTextField.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_passwordTextFieldFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgotPasswordLabel;
    private javax.swing.JLabel hideEyeIcon;
    private javax.swing.JPanel imageLoginSection;
    private javax.swing.JPanel inputLoginSection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginMainPanel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel welcomeLoginLabel;
    // End of variables declaration//GEN-END:variables
}
