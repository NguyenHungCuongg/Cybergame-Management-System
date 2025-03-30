package com.cybergamems.view.components;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class StatisticTable extends javax.swing.JPanel {
    
    public StatisticTable() {
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
        String[] columnNames = {"Tháng","Doanh Thu","Chi phí","Lợi nhuận"};
        Object[][] tableData = {};
        DefaultTableModel tableModel = new DefaultTableModel(tableData,columnNames);      
        return tableModel;
    }
    
    public JTable getDetailBillTable(){
        return statisticTable;
    }
    
    public void setTableModel(DefaultTableModel model){
        statisticTable.setModel(model);
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableScrollPane = new javax.swing.JScrollPane();
        statisticTable = new javax.swing.JTable();

        tableScrollPane.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        statisticTable.setBackground(new java.awt.Color(49, 49, 49));
        statisticTable.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        statisticTable.setModel(this.getTableModel());
        statisticTable.setFocusable(false);
        statisticTable.setOpaque(false);
        statisticTable.setRowHeight(30);
        statisticTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        statisticTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        statisticTable.setShowGrid(true);
        tableScrollPane.setViewportView(statisticTable);

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
    private javax.swing.JTable statisticTable;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
