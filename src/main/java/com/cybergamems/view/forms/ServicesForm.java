package com.cybergamems.view.forms;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import javax.swing.UIManager;

public class ServicesForm extends javax.swing.JPanel {

    public ServicesForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        foodSectionPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodAndDrinkBar2 = new com.cybergamems.view.components.FoodAndDrinkBar("Food");
        drinkSectionPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        foodAndDrinkBar3 = new com.cybergamems.view.components.FoodAndDrinkBar("Drink" );
        try {
            UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Orange: " + e.getMessage());
        }
        billSectionPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        foodSectionPanel.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 140, 0));
        jLabel1.setText("Food");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(foodAndDrinkBar2);

        javax.swing.GroupLayout foodSectionPanelLayout = new javax.swing.GroupLayout(foodSectionPanel);
        foodSectionPanel.setLayout(foodSectionPanelLayout);
        foodSectionPanelLayout.setHorizontalGroup(
            foodSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodSectionPanelLayout.createSequentialGroup()
                .addGroup(foodSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodSectionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        foodSectionPanelLayout.setVerticalGroup(
            foodSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodSectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(foodSectionPanel, gridBagConstraints);

        drinkSectionPanel.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 140, 0));
        jLabel2.setText("Drink");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setViewportView(foodAndDrinkBar3);

        javax.swing.GroupLayout drinkSectionPanelLayout = new javax.swing.GroupLayout(drinkSectionPanel);
        drinkSectionPanel.setLayout(drinkSectionPanelLayout);
        drinkSectionPanelLayout.setHorizontalGroup(
            drinkSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinkSectionPanelLayout.createSequentialGroup()
                .addGroup(drinkSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drinkSectionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        drinkSectionPanelLayout.setVerticalGroup(
            drinkSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinkSectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(drinkSectionPanel, gridBagConstraints);

        billSectionPanel.setBackground(new java.awt.Color(57, 56, 56));
        billSectionPanel.setLayout(new java.awt.GridBagLayout());

        jScrollPane3.setPreferredSize(new java.awt.Dimension(280, 200));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jTextArea1.setOpaque(false);
        jScrollPane3.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 200;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        billSectionPanel.add(jScrollPane3, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("Tổng tiền: 0 VND ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        billSectionPanel.add(jLabel3, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setText("Thanh toán");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        billSectionPanel.add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton2.setText("Hủy");
        jButton2.setPreferredSize(new java.awt.Dimension(150, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        billSectionPanel.add(jButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        add(billSectionPanel, gridBagConstraints);
        try {
            UIManager.setLookAndFeel(new FlatDarkFlatIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Flat: " + e.getMessage());
        }

        jLabel4.setFont(new java.awt.Font("Roboto Bk", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 140, 0));
        jLabel4.setText("Food & Drink Menu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        add(jLabel4, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel billSectionPanel;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel drinkSectionPanel;
    private com.cybergamems.view.components.FoodAndDrinkBar foodAndDrinkBar2;
    private com.cybergamems.view.components.FoodAndDrinkBar foodAndDrinkBar3;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel foodSectionPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
