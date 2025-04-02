package com.cybergamems.view.dialogs;

import com.cybergamems.controller.ThongKeController;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class AddExpensesDialog extends javax.swing.JDialog {    
    public AddExpensesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initSpinnerValue();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void initSpinnerValue(){
        thangSpinner.setModel(new SpinnerNumberModel(1, 1, 12, 1));
        int currentYear = Calendar.getInstance().get(Calendar.YEAR); // Lấy năm hiện tại
        namSpinner.setModel(new SpinnerNumberModel(currentYear, 2024, currentYear, 1)); //Giá trị của spinner bắt đầu từ năm 2024 đến năm hiện tại
        
        JSpinner.NumberEditor editor = new JSpinner.NumberEditor(namSpinner, "####"); // Không có dấu phẩy
        namSpinner.setEditor(editor);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        dialogHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dialogInputSection = new javax.swing.JPanel();
        thangLabel = new javax.swing.JLabel();
        thangSpinner = new javax.swing.JSpinner();
        namLabel = new javax.swing.JLabel();
        namSpinner = new javax.swing.JSpinner();
        tienTaiNguyenLabel = new javax.swing.JLabel();
        tienTaiNguyenTextField = new javax.swing.JTextField();
        tienDienLabel = new javax.swing.JLabel();
        tienDienTextField = new javax.swing.JTextField();
        tienNuocLabel = new javax.swing.JLabel();
        tienNuocTextField = new javax.swing.JTextField();
        dialogButtonSection = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        dialogHeader.setBackground(new java.awt.Color(255, 140, 0));
        dialogHeader.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÊM CHI PHÍ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        dialogHeader.add(jLabel1, gridBagConstraints);

        dialogInputSection.setLayout(new java.awt.GridBagLayout());

        thangLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        thangLabel.setText("Tháng");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 5, 20);
        dialogInputSection.add(thangLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        dialogInputSection.add(thangSpinner, gridBagConstraints);

        namLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        namLabel.setText("Năm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 5, 20);
        dialogInputSection.add(namLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        dialogInputSection.add(namSpinner, gridBagConstraints);

        tienTaiNguyenLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tienTaiNguyenLabel.setText("Tiền tài nguyên");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 5, 20);
        dialogInputSection.add(tienTaiNguyenLabel, gridBagConstraints);

        tienTaiNguyenTextField.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        dialogInputSection.add(tienTaiNguyenTextField, gridBagConstraints);

        tienDienLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tienDienLabel.setText("Tiền điện");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 5, 20);
        dialogInputSection.add(tienDienLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        dialogInputSection.add(tienDienTextField, gridBagConstraints);

        tienNuocLabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tienNuocLabel.setText("Tiền nước");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 5, 20);
        dialogInputSection.add(tienNuocLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 10, 10);
        dialogInputSection.add(tienNuocTextField, gridBagConstraints);

        dialogButtonSection.setLayout(new java.awt.GridBagLayout());

        addButton.setBackground(new java.awt.Color(255, 140, 0));
        addButton.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("THÊM");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 50, 50, 20);
        dialogButtonSection.add(addButton, gridBagConstraints);

        cancelButton.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cancelButton.setText("HỦY");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 20, 50, 50);
        dialogButtonSection.add(cancelButton, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dialogInputSection, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(dialogButtonSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dialogHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dialogInputSection, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dialogButtonSection, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int thang = (Integer)thangSpinner.getValue();
        int nam = (Integer)namSpinner.getValue();
        double tienDien = Double.parseDouble(tienDienTextField.getText().trim());
        double tienNuoc = Double.parseDouble(tienNuocTextField.getText().trim());
        double tienTaiNguyen = Double.parseDouble(tienTaiNguyenTextField.getText().trim());
        
        ThongKeController thongKeController = new ThongKeController();
        boolean result = thongKeController.addChiPhiIntoModel(thang, nam, tienDien, tienNuoc, tienTaiNguyen);
        if(result){
            JOptionPane.showMessageDialog(this, "Thêm chi phí hoạt động thành công!");
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Thêm chi phí hoạt động thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    public static void main(String args[]) {
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddExpensesDialog dialog = new AddExpensesDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel dialogButtonSection;
    private javax.swing.JPanel dialogHeader;
    private javax.swing.JPanel dialogInputSection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel namLabel;
    private javax.swing.JSpinner namSpinner;
    private javax.swing.JLabel thangLabel;
    private javax.swing.JSpinner thangSpinner;
    private javax.swing.JLabel tienDienLabel;
    private javax.swing.JTextField tienDienTextField;
    private javax.swing.JLabel tienNuocLabel;
    private javax.swing.JTextField tienNuocTextField;
    private javax.swing.JLabel tienTaiNguyenLabel;
    private javax.swing.JTextField tienTaiNguyenTextField;
    // End of variables declaration//GEN-END:variables
}
