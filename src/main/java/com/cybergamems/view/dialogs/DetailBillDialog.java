package com.cybergamems.view.dialogs;

import com.cybergamems.view.components.DetailBillTable;
import java.awt.BorderLayout;

public class DetailBillDialog extends javax.swing.JDialog {
    private int maHoaDon;

    public DetailBillDialog(java.awt.Frame parent, boolean modal, int maHoaDon) {
        super(parent, modal);
        this.maHoaDon = maHoaDon;
        initComponents();
        displayDetailBillTable(maHoaDon);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void displayDetailBillTable(int maHoaDon){
        DetailBillTable detailBillTable = new DetailBillTable(maHoaDon);
        dialogInputSection2.setLayout(new java.awt.BorderLayout());
        dialogInputSection2.add(detailBillTable, BorderLayout.CENTER); 
        dialogInputSection2.revalidate();
        dialogInputSection2.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        dialogHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dialogInputSection2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        dialogHeader.setBackground(new java.awt.Color(255, 140, 0));
        dialogHeader.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHI TIẾT HÓA ĐƠN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        dialogHeader.add(jLabel1, gridBagConstraints);

        javax.swing.GroupLayout dialogInputSection2Layout = new javax.swing.GroupLayout(dialogInputSection2);
        dialogInputSection2.setLayout(dialogInputSection2Layout);
        dialogInputSection2Layout.setHorizontalGroup(
            dialogInputSection2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );
        dialogInputSection2Layout.setVerticalGroup(
            dialogInputSection2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dialogInputSection2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dialogHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 73, Short.MAX_VALUE)
                .addComponent(dialogInputSection2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(dialogHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 360, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DetailBillDialog dialog = new DetailBillDialog(new javax.swing.JFrame(), true,-1);
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
    private javax.swing.JPanel dialogInputSection2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
