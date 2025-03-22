package com.cybergamems.view.dialogs;

import com.cybergamems.controller.KhachHangController;
import com.cybergamems.model.entities.KhachHang;
import javax.swing.JOptionPane;

public class DetailClientDialog extends javax.swing.JDialog {
    private int maKhachHang;
    
    public DetailClientDialog(java.awt.Frame parent, boolean modal, int maKhachHang) {
        super(parent, modal);
        this.maKhachHang = maKhachHang;
        initComponents();
        getClientInformation();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        dialogHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dialogInputSection = new javax.swing.JPanel();
        hoVaTenLabel = new javax.swing.JLabel();
        hoVaTenTextField = new javax.swing.JTextField();
        tenDangNhapLabel = new javax.swing.JLabel();
        tenDangNhapTextField = new javax.swing.JTextField();
        matKhauLabel = new javax.swing.JLabel();
        matKhauTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        trangThaiLabel = new javax.swing.JLabel();
        trangThaiComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        dialogHeader.setBackground(new java.awt.Color(255, 140, 0));
        dialogHeader.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHI TIẾT THÔNG TIN KHÁCH HÀNG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        dialogHeader.add(jLabel1, gridBagConstraints);

        dialogInputSection.setLayout(new java.awt.GridBagLayout());

        hoVaTenLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        hoVaTenLabel.setText("Họ và tên");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 5, 20);
        dialogInputSection.add(hoVaTenLabel, gridBagConstraints);

        hoVaTenTextField.setEnabled(false);
        hoVaTenTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoVaTenTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        dialogInputSection.add(hoVaTenTextField, gridBagConstraints);

        tenDangNhapLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tenDangNhapLabel.setText("Tên đăng nhập");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 5, 20);
        dialogInputSection.add(tenDangNhapLabel, gridBagConstraints);

        tenDangNhapTextField.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        dialogInputSection.add(tenDangNhapTextField, gridBagConstraints);

        matKhauLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        matKhauLabel.setText("Mật khẩu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 5, 20);
        dialogInputSection.add(matKhauLabel, gridBagConstraints);

        matKhauTextField.setToolTipText("");
        matKhauTextField.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        dialogInputSection.add(matKhauTextField, gridBagConstraints);

        emailLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        emailLabel.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 5, 20);
        dialogInputSection.add(emailLabel, gridBagConstraints);

        emailTextField.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        dialogInputSection.add(emailTextField, gridBagConstraints);

        trangThaiLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        trangThaiLabel.setText("Trạng thái");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 5, 20);
        dialogInputSection.add(trangThaiLabel, gridBagConstraints);

        trangThaiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoạt động", "Vắng mặt" }));
        trangThaiComboBox.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        dialogInputSection.add(trangThaiComboBox, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dialogInputSection, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dialogHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dialogInputSection, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getClientInformation(){
        KhachHangController khachHangController = new KhachHangController();
        KhachHang currentKhachHang = khachHangController.getKhachHang(maKhachHang);
        
        hoVaTenTextField.setText(currentKhachHang.getHoVaTen());
        tenDangNhapTextField.setText(currentKhachHang.getUsername());
        matKhauTextField.setText(currentKhachHang.getMatKhau());
        emailTextField.setText(currentKhachHang.getEmail());
        trangThaiComboBox.setSelectedItem(currentKhachHang.isTrangThaiKH()?"Hoạt động" : "Vắng mặt");
    }
    
    private void hoVaTenTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoVaTenTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hoVaTenTextFieldActionPerformed

    public static void main(String args[]) {
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetailClientDialog dialog = new DetailClientDialog(new javax.swing.JFrame(), true,-1);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dialogHeader;
    private javax.swing.JPanel dialogInputSection;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel hoVaTenLabel;
    private javax.swing.JTextField hoVaTenTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel matKhauLabel;
    private javax.swing.JTextField matKhauTextField;
    private javax.swing.JLabel tenDangNhapLabel;
    private javax.swing.JTextField tenDangNhapTextField;
    private javax.swing.JComboBox<String> trangThaiComboBox;
    private javax.swing.JLabel trangThaiLabel;
    // End of variables declaration//GEN-END:variables
}
