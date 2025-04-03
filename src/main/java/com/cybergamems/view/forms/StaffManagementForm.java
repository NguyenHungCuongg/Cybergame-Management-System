package com.cybergamems.view.forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.cybergamems.view.dialogs.AddStaffDialog;
import com.cybergamems.view.components.StaffManagementTable;
import com.cybergamems.controller.NhanVienController;
import com.cybergamems.model.entities.NhanVien;
import com.cybergamems.utils.ExcelExporter;
import com.cybergamems.view.dialogs.DetailStaffDialog;
import com.cybergamems.view.dialogs.EditStaffDialog;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class StaffManagementForm extends javax.swing.JPanel {
    private int selectedStaffIndex;
    private NhanVien loginedNhanVien;

    public StaffManagementForm(NhanVien loginedNhanVien) {
        this.loginedNhanVien = loginedNhanVien;
        selectedStaffIndex = -1;
        initComponents();
        initTableEvent();
        initButtonEvent();
    }
    
    
    public void initTableEvent(){
        staffManagementTable1.getStaffTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()){ // Đảm bảo sự kiện chỉ kích hoạt một lần
                    //truy xuất index của hàng được người dùng chọn trong table
                    int selectedRow = staffManagementTable1.getStaffTable().getSelectedRow();
                    //Nếu truy xuất được hàng
                    if(selectedRow != -1){
                        selectedStaffIndex = selectedRow;
                    }
                }
            }
        });
    }
    
    private void refreshTable(){
        StaffManagementTable newTable = new StaffManagementTable();
        DefaultTableModel newTableModel = (DefaultTableModel) newTable.getTableModel();

        staffManagementTable1.setTableModel(newTableModel);
        repaint();
        revalidate();
    }
    
    public void initButtonEvent(){
        //Xử lý sự kiện cho nút làm mới
        JButton refreshButton = tableMenuBar1.getRefreshTableDataButton();
        refreshButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshTable();
            }  
        });
        
        //Xử lý sự kiện cho nút thêm nhân viên
        JButton addButton = tableMenuBar1.getAddTableDataButton();
        addButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AddStaffDialog addStaffDialog = new AddStaffDialog((JFrame) SwingUtilities.getWindowAncestor(StaffManagementForm.this),true);
                addStaffDialog.setVisible(true);
                refreshTable();
            }  
        });
        
        //Xử lý sự kiện cho nút xóa nhân viên
        JButton deleteButton = tableMenuBar1.getDeleteTableDataButton();
        deleteButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int selectedStaffID = Integer.parseInt(staffManagementTable1.getStaffTable().getValueAt(selectedStaffIndex,0).toString());
                NhanVienController nhanVienController = new NhanVienController();
                boolean result = nhanVienController.deleteNhanVienFromModel(selectedStaffID);
                if(result){
                    JOptionPane.showMessageDialog(null, "Xóa nhân viên thành công!");
                    refreshTable();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Xóa nhân viên thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        //Xử lý sự kiện cho nút chỉnh sửa nhân viên
        JButton editButton = tableMenuBar1.getEditTableDataButton();
        editButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int selectedStaffID = Integer.parseInt(staffManagementTable1.getStaffTable().getValueAt(selectedStaffIndex,0).toString());
                EditStaffDialog editStaffDialog = new EditStaffDialog((JFrame) SwingUtilities.getWindowAncestor(StaffManagementForm.this),true,selectedStaffID); 
                editStaffDialog.setVisible(true);
                refreshTable();
            }
        });
        
        
        //Xử lý sự kiện cho nút chi tiết của nhân viên
        JButton detailButton = tableMenuBar1.getDetailTableDataButton();
        detailButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int selectedStaffID = Integer.parseInt(staffManagementTable1.getStaffTable().getValueAt(selectedStaffIndex,0).toString());
                DetailStaffDialog detailStaffDialog = new DetailStaffDialog((JFrame) SwingUtilities.getWindowAncestor(StaffManagementForm.this),true,selectedStaffID); 
                detailStaffDialog.setVisible(true);
                refreshTable();
            }
        });
        
        //Xử lý sự kiện cho nút tìm kiếm 
        JButton searchButton = tableMenuBar1.getSearchTableDataButton();
        searchButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String searchInput = tableMenuBar1.getSearchTableDataTextField().getText().trim();
                NhanVienController khachHangController = new NhanVienController();
                String[] columnNames = {"Mã nhân viên","Họ và tên","Tên đăng nhập","Email","Trạng thái","Vị trí","Ngày vào làm"};
                Object[][] tableData = khachHangController.getSearchedNhanVienFromModel(searchInput);
                DefaultTableModel newTableModel = new DefaultTableModel(tableData,columnNames);
                staffManagementTable1.setTableModel(newTableModel);
                repaint();
                revalidate();
            }
        });
        
        //Xử lý sự kiện cho nút xuất
        JButton exportButton = tableMenuBar1.getExportTableDataButton();
        exportButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (staffManagementTable1.getStaffTable().getRowCount() > 0) {
                    // Gọi phương thức xuất Excel
                    ExcelExporter.exportToExcel(staffManagementTable1.getStaffTable(), "Danh sách hóa đơn");
                } else {
                    JOptionPane.showMessageDialog(null, "Không có dữ liệu để xuất!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        staffManagementHeaderPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        tableMenuBar1 = new com.cybergamems.view.components.TableMenuBar();
        staffManagementTablePanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        staffManagementTable1 = new com.cybergamems.view.components.StaffManagementTable();

        setBackground(new java.awt.Color(50, 50, 50));

        javax.swing.GroupLayout staffManagementHeaderPanelLayout = new javax.swing.GroupLayout(staffManagementHeaderPanel);
        staffManagementHeaderPanel.setLayout(staffManagementHeaderPanelLayout);
        staffManagementHeaderPanelLayout.setHorizontalGroup(
            staffManagementHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableMenuBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        staffManagementHeaderPanelLayout.setVerticalGroup(
            staffManagementHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableMenuBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        staffManagementTablePanel.setPreferredSize(new java.awt.Dimension(464, 431));

        staffManagementTable1.setMinimumSize(new java.awt.Dimension(18, 18));
        staffManagementTable1.setPreferredSize(new java.awt.Dimension(464, 404));

        javax.swing.GroupLayout staffManagementTablePanelLayout = new javax.swing.GroupLayout(staffManagementTablePanel);
        staffManagementTablePanel.setLayout(staffManagementTablePanelLayout);
        staffManagementTablePanelLayout.setHorizontalGroup(
            staffManagementTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(staffManagementTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        staffManagementTablePanelLayout.setVerticalGroup(
            staffManagementTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(staffManagementTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffManagementHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staffManagementTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(staffManagementHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staffManagementTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel staffManagementHeaderPanel;
    private com.cybergamems.view.components.StaffManagementTable staffManagementTable1;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel staffManagementTablePanel;
    private com.cybergamems.view.components.TableMenuBar tableMenuBar1;
    // End of variables declaration//GEN-END:variables
}
