package com.cybergamems.view.components;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class clientManagementTable extends javax.swing.JPanel {
    public clientManagementTable() {
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
        String[] clientStatuses = {"Hoạt động","Vắng mặt"};
        JComboBox clientStatusComboBox = new JComboBox<>(clientStatuses);
        clientTable.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(clientStatusComboBox));
    }

    public DefaultTableModel  getTableModel(){
        String[] columnNames = {"Mã khách hàng","Họ và tên","Tên đăng nhập","Email","Trạng thái"};
        Object[][] tableData = {
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
            {1, "Nguyễn Hùng Cường","Cuongg","cuonghungnguyentop@gmail.com","Hoạt động"},
            {2, "Nguyễn Quang Tèo","Teongu","teo@gmail.com","Vắng mặt"},
            {3, "MaiThành Triệu Phú","Phuu","maithanhtrieuphu@gmail.com","Hoạt động"},
       
    
        };
        DefaultTableModel tableModel = new DefaultTableModel(tableData,columnNames);      
        return tableModel;
  
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
        clientTable.setShowHorizontalLines(true);
        clientTable.setShowVerticalLines(true);
        tableScrollPane.setViewportView(clientTable);

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
    private javax.swing.JTable clientTable;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
