package com.cybergamems.view.components;

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
        initComboBoxForComputerStatus();
        try {
            UIManager.setLookAndFeel(new FlatDarkFlatIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Flat: " + e.getMessage());
        }
    }
    
    public void initComboBoxForComputerStatus(){
        String[] computerStatuses = {"online","empty","broken"};
        JComboBox computerStatusComboBox = new JComboBox<>(computerStatuses);
        computerRoomTable.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(computerStatusComboBox));
    }
    
    public DefaultTableModel  getTableModel(){
        String[] columnNames = {"Mã máy","Trạng thái máy","Mã người chơi","Tên đăng nhập","Thời gian còn lại"};
        if(roomName=="Thường"){
            Object[][] tableData = {
                {1, "online","23520201","cuong1",6.2},
                {2, "empty","23510101","teo1",3.2},
                {3, "broken","2352892","bo1",2.1},
            };
            DefaultTableModel tableModel = new DefaultTableModel(tableData,columnNames);      
            return tableModel;
        }
        else if(roomName=="VIP"){
            Object[][] tableData = {
                {1, "online","23520201","cuong2",6.2},
                {2, "empty","23510101","teo2",3.2},
                {3, "broken","2352892","bo2",2.1},
            };
            DefaultTableModel tableModel = new DefaultTableModel(tableData,columnNames);      
            return tableModel;
        }
        else{
            Object[][] tableData = {
                {1, "online","23520201","cuong3",6.2},
                {2, "empty","23510101","teo3",3.2},
                {3, "broken","2352892","bo3",2.1},
            };
            DefaultTableModel tableModel = new DefaultTableModel(tableData,columnNames);      
            return tableModel;
        }
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
        computerRoomTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        computerRoomTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
