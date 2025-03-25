package com.cybergamems.view.components;

import com.cybergamems.controller.HoaDonController;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class BillTable extends javax.swing.JPanel {

    public BillTable() {
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
        String[] columnNames = {"Mã hóa đơn","Tên khách hàng","Tên nhân viên","Ngày lập hóa đơn","Tổng tiền","Trạng thái hóa đơn"};
        HoaDonController hoaDonController = new HoaDonController();
        Object[][] tableData = hoaDonController.getHoaDonFromModel();
        DefaultTableModel tableModel = new DefaultTableModel(tableData,columnNames);      
        return tableModel;
  
    }
    
    public JTable getBillTable(){
        return billTable;
    }
    
    public void setTableModel(DefaultTableModel model){
        billTable.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableScrollPane = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();

        tableScrollPane.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        billTable.setBackground(new java.awt.Color(49, 49, 49));
        billTable.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        billTable.setModel(this.getTableModel());
        billTable.setFocusable(false);
        billTable.setOpaque(false);
        billTable.setRowHeight(30);
        billTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        billTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        billTable.setShowGrid(true);
        tableScrollPane.setViewportView(billTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrollPane)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable billTable;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
