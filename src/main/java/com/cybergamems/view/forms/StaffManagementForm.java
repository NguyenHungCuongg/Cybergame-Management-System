package com.cybergamems.view.forms;

public class StaffManagementForm extends javax.swing.JPanel {

    public StaffManagementForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        staffManagementHeaderPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        tableMenuBar1 = new com.cybergamems.view.components.TableMenuBar();
        staffManagementTablePanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        staffManagementTable1 = new com.cybergamems.view.components.StaffManagementTable();

        setBackground(new java.awt.Color(50, 50, 50));

        javax.swing.GroupLayout staffManagementHeaderPanelLayout = new javax.swing.GroupLayout(staffManagementHeaderPanel);
        staffManagementHeaderPanel.setLayout(staffManagementHeaderPanelLayout);
        staffManagementHeaderPanelLayout.setHorizontalGroup(
            staffManagementHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableMenuBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        staffManagementHeaderPanelLayout.setVerticalGroup(
            staffManagementHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableMenuBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        staffManagementTablePanel.setPreferredSize(new java.awt.Dimension(464, 431));

        staffManagementTable1.setMinimumSize(new java.awt.Dimension(18, 18));
        staffManagementTable1.setPreferredSize(new java.awt.Dimension(464, 404));

        javax.swing.GroupLayout staffManagementTablePanelLayout = new javax.swing.GroupLayout(staffManagementTablePanel);
        staffManagementTablePanel.setLayout(staffManagementTablePanelLayout);
        staffManagementTablePanelLayout.setHorizontalGroup(
            staffManagementTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(staffManagementTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        staffManagementTablePanelLayout.setVerticalGroup(
            staffManagementTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(staffManagementTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffManagementHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffManagementTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(staffManagementHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staffManagementTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel staffManagementHeaderPanel;
    private com.cybergamems.view.components.StaffManagementTable staffManagementTable1;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel staffManagementTablePanel;
    private com.cybergamems.view.components.TableMenuBar tableMenuBar1;
    // End of variables declaration//GEN-END:variables
}
