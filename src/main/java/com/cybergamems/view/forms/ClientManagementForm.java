package com.cybergamems.view.forms;

import java.awt.Dimension;

public class ClientManagementForm extends javax.swing.JPanel {
    public ClientManagementForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientManagementHeaderPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        tableMenuBar1 = new com.cybergamems.view.components.TableMenuBar();
        clientManagementTablePanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        clientManagementTable1 = new com.cybergamems.view.components.clientManagementTable();

        setBackground(new java.awt.Color(50, 50, 50));

        javax.swing.GroupLayout clientManagementHeaderPanelLayout = new javax.swing.GroupLayout(clientManagementHeaderPanel);
        clientManagementHeaderPanel.setLayout(clientManagementHeaderPanelLayout);
        clientManagementHeaderPanelLayout.setHorizontalGroup(
            clientManagementHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableMenuBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        clientManagementHeaderPanelLayout.setVerticalGroup(
            clientManagementHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableMenuBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout clientManagementTablePanelLayout = new javax.swing.GroupLayout(clientManagementTablePanel);
        clientManagementTablePanel.setLayout(clientManagementTablePanelLayout);
        clientManagementTablePanelLayout.setHorizontalGroup(
            clientManagementTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientManagementTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientManagementTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        clientManagementTablePanelLayout.setVerticalGroup(
            clientManagementTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientManagementTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientManagementTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clientManagementTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientManagementHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientManagementHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientManagementTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel clientManagementHeaderPanel;
    private com.cybergamems.view.components.clientManagementTable clientManagementTable1;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel clientManagementTablePanel;
    private com.cybergamems.view.components.TableMenuBar tableMenuBar1;
    // End of variables declaration//GEN-END:variables
}
