package com.cybergamems.view.components;

import com.cybergamems.controller.KhachHangController;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class ClientManagementTable extends javax.swing.JPanel {

    public ClientManagementTable() {
        try {
            UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Orange: " + e.getMessage());
        }
        initComponents();
        try {
            UIManager.setLookAndFeel(new FlatDarkFlatIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Flat: " + e.getMessage());
        }
    }
    
    public DefaultTableModel  getTableModel(){
        String[] columnNames = {"Mã khách hàng","Họ và tên","Tên đăng nhập","Email","Trạng thái"};
        KhachHangController khachHangController = new KhachHangController();
        Object[][] tableData = khachHangController.getKhachHangFromModel();
        DefaultTableModel tableModel = new DefaultTableModel(tableData,columnNames);      
        return tableModel;
  
    }
    
    public void setTableModel(DefaultTableModel model){
        clientTable.setModel(model);
    }
    
    public JTable getClientTable(){
        return clientTable;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableScrollPane = new javax.swing.JScrollPane();
        clientTable = new javax.swing.JTable();

        tableScrollPane.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        clientTable.setBackground(new java.awt.Color(49, 49, 49));
        clientTable.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        clientTable.setModel(this.getTableModel());
        clientTable.setFocusable(false);
        clientTable.setOpaque(false);
        clientTable.setRowHeight(30);
        clientTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        clientTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        clientTable.setShowGrid(true);
        tableScrollPane.setViewportView(clientTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clientTable;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
