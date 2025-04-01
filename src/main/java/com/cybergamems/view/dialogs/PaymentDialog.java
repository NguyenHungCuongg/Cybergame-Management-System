package com.cybergamems.view.dialogs;

import com.cybergamems.controller.HoaDonController;
import com.cybergamems.controller.KhachHangController;
import com.cybergamems.model.entities.HoaDon;
import com.cybergamems.view.components.DetailBillTable;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;

public class PaymentDialog extends javax.swing.JDialog {    
    private int maHoaDon;
    
    public PaymentDialog(java.awt.Frame parent, boolean modal, int maHoaDon) {
        super(parent, modal);
        initComponents();
        displayDetailBillTable(maHoaDon);
        displayTotalBill(maHoaDon);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void displayTotalBill(int maHoaDon){
        HoaDonController hoaDonController = new HoaDonController();
        HoaDon currentHoaDon = hoaDonController.getHoaDonFromModel(maHoaDon);
        String total = com.cybergamems.utils.ViewUtils.formatDoubleWithoutDecimal(currentHoaDon.getTongTien());
        totalBillLabel.setText("Tổng tiền: "+  total + "VND");
    }
    
    private void displayDetailBillTable(int maHoaDon){
        DetailBillTable detailBillTable = new DetailBillTable(maHoaDon);
        detailBillSection.setLayout(new java.awt.BorderLayout());
        detailBillSection.add(detailBillTable, BorderLayout.CENTER); 
        detailBillSection.revalidate();
        detailBillSection.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        dialogHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dialogInputSection = new javax.swing.JPanel();
        qrCodeImage = new javax.swing.JLabel();
        paymentButtonSection = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        detailBillSection = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        totalBillLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        dialogHeader.setBackground(new java.awt.Color(255, 140, 0));
        dialogHeader.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THANH TOÁN HÓA ĐƠN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        dialogHeader.add(jLabel1, gridBagConstraints);

        qrCodeImage.setIcon(new ImageIcon(getClass().getResource("/images/qr-payment.png")));

        paymentButtonSection.setLayout(new java.awt.GridBagLayout());

        jButton2.setText("Chuyển khoản");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paymentButtonSection.add(jButton2, gridBagConstraints);

        jButton3.setText("Tiền mặt");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paymentButtonSection.add(jButton3, gridBagConstraints);

        jButton1.setText("Hủy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 230;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        paymentButtonSection.add(jButton1, gridBagConstraints);

        javax.swing.GroupLayout detailBillSectionLayout = new javax.swing.GroupLayout(detailBillSection);
        detailBillSection.setLayout(detailBillSectionLayout);
        detailBillSectionLayout.setHorizontalGroup(
            detailBillSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );
        detailBillSectionLayout.setVerticalGroup(
            detailBillSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dialogInputSectionLayout = new javax.swing.GroupLayout(dialogInputSection);
        dialogInputSection.setLayout(dialogInputSectionLayout);
        dialogInputSectionLayout.setHorizontalGroup(
            dialogInputSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogInputSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogInputSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paymentButtonSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qrCodeImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(detailBillSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dialogInputSectionLayout.setVerticalGroup(
            dialogInputSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogInputSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qrCodeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentButtonSection, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
            .addComponent(detailBillSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        totalBillLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        totalBillLabel.setText("Tổng tiền: 00000000000 VND");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalBillLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalBillLabel)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dialogHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dialogInputSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dialogHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dialogInputSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PaymentDialog dialog = new PaymentDialog(new javax.swing.JFrame(), true, -1);
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
    private javax.swing.JPanel detailBillSection;
    private javax.swing.JPanel dialogHeader;
    private javax.swing.JPanel dialogInputSection;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel paymentButtonSection;
    private javax.swing.JLabel qrCodeImage;
    private javax.swing.JLabel totalBillLabel;
    // End of variables declaration//GEN-END:variables
}
