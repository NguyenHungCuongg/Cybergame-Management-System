package com.cybergamems.view.dialogs;

public class DetailBillDialog extends javax.swing.JDialog {
    private int maHoaDon;

    public DetailBillDialog(java.awt.Frame parent, boolean modal, int maHoaDon) {
        super(parent, modal);
        this.maHoaDon = maHoaDon;
        System.out.println("Ma hoa don hien tai la1:" + maHoaDon);
        initComponents();
        System.out.println("Ma hoa don hien tai la2:" + maHoaDon);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        dialogHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dialogInputSection2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailBillTable1 = new com.cybergamems.view.components.DetailBillTable(maHoaDon);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        dialogHeader.setBackground(new java.awt.Color(255, 140, 0));
        dialogHeader.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHI TIẾT HÓA ĐƠN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        dialogHeader.add(jLabel1, gridBagConstraints);

        jScrollPane1.setViewportView(detailBillTable1);

        javax.swing.GroupLayout dialogInputSection2Layout = new javax.swing.GroupLayout(dialogInputSection2);
        dialogInputSection2.setLayout(dialogInputSection2Layout);
        dialogInputSection2Layout.setHorizontalGroup(
            dialogInputSection2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
            .addGroup(dialogInputSection2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogInputSection2Layout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );
        dialogInputSection2Layout.setVerticalGroup(
            dialogInputSection2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
            .addGroup(dialogInputSection2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dialogInputSection2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap()))
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
                .addComponent(dialogHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
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
    private com.cybergamems.view.components.DetailBillTable detailBillTable1;
    private javax.swing.JPanel dialogHeader;
    private javax.swing.JPanel dialogInputSection2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
