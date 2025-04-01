package com.cybergamems.view.components;

import com.cybergamems.view.forms.ServicesForm;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class FoodAndDrinkBillTable extends javax.swing.JPanel {
    private ServicesForm servicesForm;
    
    public FoodAndDrinkBillTable(){
        initComponents();
    }
    
    public FoodAndDrinkBillTable(ServicesForm servicesForm) {
        try {
            UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Orange: " + e.getMessage()); 
        }
        this.servicesForm = servicesForm;
        initComponents();
        try {
            UIManager.setLookAndFeel(new FlatDarkFlatIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Flat: " + e.getMessage());
        }
    }
    
    public DefaultTableModel  getTableModel(){
        String[] columnNames = {"Tên món","loại","Số lượng","Đơn giá"};
        Object[][] tableData = {};
        DefaultTableModel tableModel = new DefaultTableModel(tableData,columnNames);      
        return tableModel;
    }
    
    public DefaultTableModel getCurrentTableData() {
        return (DefaultTableModel) this.billTable.getModel(); 
    }
    
    public void clearTableModel(){
        DefaultTableModel model = (DefaultTableModel) billTable.getModel();
        model.setRowCount(0);
        billTable.setModel(model);
    }
    
    public void addFoodAndDrinkBill(String tenMon, String loai, int soLuong, double donGia){
        DefaultTableModel model = (DefaultTableModel) billTable.getModel();
        
        //Kiểm tra xem món định thêm đã có trong bill chưa
        for (int i = 0; i < model.getRowCount(); i++) {
            String existingProductName = (String) model.getValueAt(i, 0); //Truy cập cột đầu tiên trong table (tức cột tên món)
            if (existingProductName.equals(tenMon)) {
                // Nếu đã có thì cộng thêm số lượng rồi return thay vì thêm hàng
                int currentSoLuong = (Integer) model.getValueAt(i, 2);
                model.setValueAt(currentSoLuong + soLuong, i, 2);
                
                //Sau khi thêm thì cập nhật lại tổng tiền  
                servicesForm.updateTotalBill();
                return;
            }
        }
        
        model.addRow(new Object[]{
            tenMon, 
            loai, 
            soLuong, 
            donGia
        });
        billTable.setModel(model);
        
        System.out.println("updateTotalBill chua duoc goi");
        //Sau khi thêm thì cập nhật lại tổng tiền
        servicesForm.updateTotalBill();
    }
    
    public double calculateTotalBill() {
        double tongTien = 0;
        DefaultTableModel model = (DefaultTableModel) billTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            int soLuong = (Integer) model.getValueAt(i, 2); //Truy cập giá trị cột số lượng trong table
            double donGia = (Double) model.getValueAt(i, 3); //Truy cập giá trị cột đơn giá trong table
            tongTien += soLuong * donGia;
        }
        return tongTien;
    }
    
    public JTable getDetailBillTable(){
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
            .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable billTable;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
