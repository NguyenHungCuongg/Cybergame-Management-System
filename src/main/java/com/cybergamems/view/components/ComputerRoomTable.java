package com.cybergamems.view.components;

import com.cybergamems.controller.MayTinhController;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class ComputerRoomTable extends javax.swing.JPanel {
    private String roomName;

    public ComputerRoomTable() {
    }
    
    public ComputerRoomTable(String roomName) {
        this.roomName = roomName;
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
        String[] columnNames = {"Mã máy","Trạng thái máy","Mã người chơi","Tên đăng nhập","Thời gian bắt đầu"};
        if(roomName=="Thường"){
            MayTinhController mayTinhController = new MayTinhController();
            Object[][] tableData = mayTinhController.getAllMayTinhFromModel(1);
            DefaultTableModel tableModel = new DefaultTableModel(tableData,columnNames);      
            return tableModel;
        }
        else if(roomName=="VIP"){
            MayTinhController mayTinhController = new MayTinhController();
            Object[][] tableData = mayTinhController.getAllMayTinhFromModel(2);
            DefaultTableModel tableModel = new DefaultTableModel(tableData,columnNames);      
            return tableModel;
        }
        else{
            MayTinhController mayTinhController = new MayTinhController();
            Object[][] tableData = mayTinhController.getAllMayTinhFromModel(3);
            DefaultTableModel tableModel = new DefaultTableModel(tableData,columnNames);      
            return tableModel;
        }
    }
    
    public JTable getComputerTable(){
        return computerRoomTable;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        roomNameLabel = new javax.swing.JLabel();
        tableScrollPane = new javax.swing.JScrollPane();
        computerRoomTable = new javax.swing.JTable();

        setLayout(new java.awt.GridBagLayout());

        roomNameLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        roomNameLabel.setText(this.roomName);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        add(roomNameLabel, gridBagConstraints);

        computerRoomTable.setBackground(new java.awt.Color(49, 49, 49));
        computerRoomTable.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        computerRoomTable.setModel(this.getTableModel());
        computerRoomTable.setFocusable(false);
        computerRoomTable.setOpaque(false);
        computerRoomTable.setRowHeight(30);
        computerRoomTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        computerRoomTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        computerRoomTable.setShowGrid(true);
        computerRoomTable.setShowHorizontalLines(true);
        computerRoomTable.setShowVerticalLines(true);
        tableScrollPane.setViewportView(computerRoomTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 878;
        gridBagConstraints.ipady = 514;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 0);
        add(tableScrollPane, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable computerRoomTable;
    private javax.swing.JLabel roomNameLabel;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
