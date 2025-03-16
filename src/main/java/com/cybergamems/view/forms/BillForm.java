package com.cybergamems.view.forms;

public class BillForm extends javax.swing.JPanel {

    public BillForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillHeaderPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        tableMenuBar1 = new com.cybergamems.view.components.TableMenuBar();
        billTablePanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        billTable1 = new com.cybergamems.view.components.BillTable();

        setBackground(new java.awt.Color(50, 50, 50));

        javax.swing.GroupLayout BillHeaderPanelLayout = new javax.swing.GroupLayout(BillHeaderPanel);
        BillHeaderPanel.setLayout(BillHeaderPanelLayout);
        BillHeaderPanelLayout.setHorizontalGroup(
            BillHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableMenuBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BillHeaderPanelLayout.setVerticalGroup(
            BillHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableMenuBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        billTablePanel.setPreferredSize(new java.awt.Dimension(464, 431));

        javax.swing.GroupLayout billTablePanelLayout = new javax.swing.GroupLayout(billTablePanel);
        billTablePanel.setLayout(billTablePanelLayout);
        billTablePanelLayout.setHorizontalGroup(
            billTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        billTablePanelLayout.setVerticalGroup(
            billTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BillHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BillHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(billTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel BillHeaderPanel;
    private com.cybergamems.view.components.BillTable billTable1;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel billTablePanel;
    private com.cybergamems.view.components.TableMenuBar tableMenuBar1;
    // End of variables declaration//GEN-END:variables
}
