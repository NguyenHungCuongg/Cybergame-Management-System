package com.cybergamems.view.forms;

import com.cybergamems.model.entities.NhanVien;
import com.formdev.flatlaf.extras.FlatSVGIcon;

public class AccountForm extends javax.swing.JPanel {
    private NhanVien loginedNhanVien;
    
    public AccountForm(NhanVien loginedNhanVien) {
        this.loginedNhanVien = loginedNhanVien;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

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

        customizedBorderRadiusPanel1.setLayout(new java.awt.GridBagLayout());

        profilePictureIcon.setIcon(new FlatSVGIcon("svg/profile-picture-icon.svg"));
        profilePictureIcon.setPreferredSize(new java.awt.Dimension(200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        customizedBorderRadiusPanel1.add(profilePictureIcon, gridBagConstraints);

        accountFormHeader.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        accountFormHeader.setText("THÔNG TIN TÀI KHOẢN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        customizedBorderRadiusPanel1.add(accountFormHeader, gridBagConstraints);

        nameLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        nameLabel.setText("Họ và tên");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        customizedBorderRadiusPanel1.add(nameLabel, gridBagConstraints);

        nameTextField.setEditable(false);
        nameTextField.setText("Họ và tên");
        nameTextField.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 240;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        customizedBorderRadiusPanel1.add(nameTextField, gridBagConstraints);

        usernameLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        usernameLabel.setText("Họ và tên");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        customizedBorderRadiusPanel1.add(usernameLabel, gridBagConstraints);

        usernameTextField.setEditable(false);
        usernameTextField.setText("Tên đăng nhập");
        usernameTextField.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 240;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        customizedBorderRadiusPanel1.add(usernameTextField, gridBagConstraints);

        roleLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        roleLabel.setText("Vị trí");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        customizedBorderRadiusPanel1.add(roleLabel, gridBagConstraints);

        roleTextField.setEditable(false);
        roleTextField.setText("Vị trí");
        roleTextField.setFocusable(false);
        roleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 240;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        customizedBorderRadiusPanel1.add(roleTextField, gridBagConstraints);

        startedDateLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        startedDateLabel.setText("Ngày vào làm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        customizedBorderRadiusPanel1.add(startedDateLabel, gridBagConstraints);

        startedDateTextField.setEditable(false);
        startedDateTextField.setText("Ngày vào làm");
        startedDateTextField.setFocusable(false);
        startedDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startedDateTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 240;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        customizedBorderRadiusPanel1.add(startedDateTextField, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customizedBorderRadiusPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customizedBorderRadiusPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void roleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleTextFieldActionPerformed

    private void startedDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startedDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startedDateTextFieldActionPerformed


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
