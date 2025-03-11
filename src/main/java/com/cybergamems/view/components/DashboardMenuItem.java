/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.cybergamems.view.components;
import java.awt.*;
/**
 *
 * @author admin88
 */
public class DashboardMenuItem extends javax.swing.JPanel {
    
    private boolean selected;

    //Truyền model của menu này vào constructor
    public DashboardMenuItem(DashboardMenuModel data) {
        initComponents();
        setOpaque(false);
        if(data.getType()==DashboardMenuModel.menuType.MENU){
            menuItemIcon.setIcon(data.pathToIcon());
            menuItemName.setText(data.getName());
        }
        else if (data.getType()== DashboardMenuModel.menuType.TITLE){
            menuItemIcon.setText(data.getName());
            menuItemName.setVisible(false);
        }
        else {
            menuItemName.setText("");
        }
    }
    
    public void setSelected(boolean selected){
        this.selected = selected;
        //Khi một Menu Item được chọn hoặc ngắt chọn thì Menu Item đấy sẽ được style lại trạng thái (đang chọn, không đang chọn)
        //-> gọi hàm paintComponent(); ở dưới
        repaint();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuItemIcon = new javax.swing.JLabel();
        menuItemName = new javax.swing.JLabel();

        menuItemName.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        menuItemName.setText("menuItemName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(menuItemIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuItemName)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuItemName)
                    .addComponent(menuItemIcon))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (selected) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(255, 140, 0));
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
            menuItemName.setForeground(new Color(30,30,30));
        }
        super.paintComponent(grphcs);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel menuItemIcon;
    private javax.swing.JLabel menuItemName;
    // End of variables declaration//GEN-END:variables
}
