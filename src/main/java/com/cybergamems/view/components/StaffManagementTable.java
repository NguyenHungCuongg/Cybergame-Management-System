package com.cybergamems.view.components;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import com.cybergamems.controller.NhanVienController;

public class StaffManagementTable extends javax.swing.JPanel {

    public StaffManagementTable() {
        try {
            UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Orange: " + e.getMessage());
        }
        initComponents();
        initComboBoxForClientStatus();
        try {
            UIManager.setLookAndFeel(new FlatDarkFlatIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Flat: " + e.getMessage());
        }
    }
    
    private void initComboBoxForClientStatus(){
        String[] staffStatuses = {"Hoạt động","Vắng mặt"};
        JComboBox staffStatusComboBox = new JComboBox<>(staffStatuses);
        staffTable.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(staffStatusComboBox));
    }
    
    public DefaultTableModel  getTableModel(){
        String[] columnNames = {"Mã nhân viên","Họ và tên","Tên đăng nhập","Email","Trạng thái","Vị trí","Ngày vào làm"};
        NhanVienController nhanVienController = new NhanVienController();
        Object[][] tableData = nhanVienController.getNhanVienTableData();
        DefaultTableModel tableModel = new DefaultTableModel(tableData,columnNames);      
        return tableModel;
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableScrollPane = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();

        tableScrollPane.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        staffTable.setBackground(new java.awt.Color(49, 49, 49));
        staffTable.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        staffTable.setModel(this.getTableModel());
        staffTable.setFocusable(false);
        staffTable.setOpaque(false);
        staffTable.setRowHeight(30);
        staffTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        staffTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        staffTable.setShowGrid(true);
        tableScrollPane.setViewportView(staffTable);

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
    private javax.swing.JTable staffTable;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
