package com.cybergamems.view.forms;

import com.cybergamems.controller.NhanVienController;
import com.cybergamems.model.entities.NhanVien;
import com.formdev.flatlaf.extras.FlatSVGIcon;

public class AccountForm extends javax.swing.JPanel {
    private NhanVien loginedNhanVien;
    
    public AccountForm(NhanVien loginedNhanVien) {
        this.loginedNhanVien = loginedNhanVien;
        initComponents();
        displayNhanVienInfo();
    }
    
    private void displayNhanVienInfo(){
        NhanVienController nhanVienController = new NhanVienController();
        NhanVien currentNhanVien = nhanVienController.getNhanVien(loginedNhanVien.getMaNhanVien());
        
        nameTextField.setText(currentNhanVien.getHoVaTen());
        usernameTextField.setText(currentNhanVien.getUsername());
        roleTextField.setText(currentNhanVien.getViTri());
        startedDateTextField.setText(currentNhanVien.getNgayVaoLam().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customizedBorderRadiusPanel1 = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        profilePictureIcon = new javax.swing.JLabel();
        accountFormHeader = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        roleLabel = new javax.swing.JLabel();
        roleTextField = new javax.swing.JTextField();
        startedDateLabel = new javax.swing.JLabel();
        startedDateTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(50, 50, 50));

        profilePictureIcon.setIcon(new FlatSVGIcon("svg/profile-picture-icon.svg"));
        profilePictureIcon.setPreferredSize(new java.awt.Dimension(200, 200));

        accountFormHeader.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        accountFormHeader.setText("THÔNG TIN TÀI KHOẢN");

        nameLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nameLabel.setText("Họ và tên");

        nameTextField.setEditable(false);
        nameTextField.setFocusable(false);
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        usernameLabel.setText("Tên đăng nhập");

        usernameTextField.setEditable(false);
        usernameTextField.setFocusable(false);

        roleLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        roleLabel.setText("Vị trí");

        roleTextField.setEditable(false);
        roleTextField.setFocusable(false);
        roleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleTextFieldActionPerformed(evt);
            }
        });

        startedDateLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        startedDateLabel.setText("Ngày vào làm");

        startedDateTextField.setEditable(false);
        startedDateTextField.setFocusable(false);
        startedDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startedDateTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customizedBorderRadiusPanel1Layout = new javax.swing.GroupLayout(customizedBorderRadiusPanel1);
        customizedBorderRadiusPanel1.setLayout(customizedBorderRadiusPanel1Layout);
        customizedBorderRadiusPanel1Layout.setHorizontalGroup(
            customizedBorderRadiusPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customizedBorderRadiusPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customizedBorderRadiusPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountFormHeader)
                    .addComponent(profilePictureIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(customizedBorderRadiusPanel1Layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(232, 232, 232)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customizedBorderRadiusPanel1Layout.createSequentialGroup()
                        .addComponent(startedDateLabel)
                        .addGap(206, 206, 206)
                        .addComponent(startedDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customizedBorderRadiusPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, customizedBorderRadiusPanel1Layout.createSequentialGroup()
                            .addComponent(usernameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, customizedBorderRadiusPanel1Layout.createSequentialGroup()
                            .addComponent(roleLabel)
                            .addGap(262, 262, 262)
                            .addComponent(roleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        customizedBorderRadiusPanel1Layout.setVerticalGroup(
            customizedBorderRadiusPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customizedBorderRadiusPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accountFormHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(profilePictureIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(customizedBorderRadiusPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customizedBorderRadiusPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(nameLabel))
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(customizedBorderRadiusPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(customizedBorderRadiusPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customizedBorderRadiusPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(roleLabel))
                    .addComponent(roleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customizedBorderRadiusPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customizedBorderRadiusPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(startedDateLabel))
                    .addComponent(startedDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customizedBorderRadiusPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customizedBorderRadiusPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void roleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleTextFieldActionPerformed

    private void startedDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startedDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startedDateTextFieldActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountFormHeader;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel customizedBorderRadiusPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel profilePictureIcon;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JTextField roleTextField;
    private javax.swing.JLabel startedDateLabel;
    private javax.swing.JTextField startedDateTextField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
