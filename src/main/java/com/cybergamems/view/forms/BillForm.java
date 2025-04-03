package com.cybergamems.view.forms;

import com.cybergamems.controller.HoaDonController;
import com.cybergamems.model.entities.NhanVien;
import com.cybergamems.utils.ExcelExporter;
import com.cybergamems.view.components.BillTable;
import com.cybergamems.view.dialogs.DetailBillDialog;
import com.cybergamems.view.dialogs.PaymentDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class BillForm extends javax.swing.JPanel {
    private int selectedBillIndex;
    private NhanVien loginedNhanVien;

    public BillForm(NhanVien loginedNhanVien) {
        this.loginedNhanVien = loginedNhanVien;
        initComponents();
        initTableEvent();
        initButtonEvent();
    }
    
    
    public void initTableEvent(){
        billTable1.getBillTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()){ // Đảm bảo sự kiện chỉ kích hoạt một lần
                    //truy xuất index của hàng được người dùng chọn trong table
                    int selectedRow = billTable1.getBillTable().getSelectedRow();
                    //Nếu truy xuất được hàng
                    if(selectedRow != -1){
                        selectedBillIndex = selectedRow;
                    }
                }
            }
        });
    }
    
    private void refreshTable(){
        BillTable newTable = new BillTable();
        DefaultTableModel newTableModel = (DefaultTableModel) newTable.getTableModel();

        billTable1.setTableModel(newTableModel);
        repaint();
        revalidate();
    } 
    
    public void initButtonEvent(){
        
        //Xử lý sự kiện của nút xem chi tiết hóa đơn
        JButton detailButton = billTableMenuBar1.getDetailTableDataButton();
        detailButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int selectedBillID = Integer.parseInt(billTable1.getBillTable().getValueAt(selectedBillIndex,0).toString());
                DetailBillDialog detailBillDialog =new DetailBillDialog((JFrame) SwingUtilities.getWindowAncestor(BillForm.this),true,selectedBillID);
                detailBillDialog.setVisible(true);
            }
        });
        
        //Xử lý sự kiện của nút thanh toán
        JButton payButton = billTableMenuBar1.getPayTableDataButton();
        payButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int selectedBillID = Integer.parseInt(billTable1.getBillTable().getValueAt(selectedBillIndex,0).toString());
                PaymentDialog paymentDialog = new PaymentDialog((JFrame) SwingUtilities.getWindowAncestor(BillForm.this),true,selectedBillID);
                paymentDialog.setVisible(true);
            }
        });
        
        //Xử lý sự kiện của nút làm mới
        JButton refreshButton = billTableMenuBar1.getRefreshTableDataButton();
        refreshButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                refreshTable();
            }
        });
        
        //Xử lý sự kiện cho nút tìm kiếm 
        JButton searchButton = billTableMenuBar1.getSearchTableDataButton();
        searchButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String searchInput = billTableMenuBar1.getSearchTableDataTextField().getText().trim();
                HoaDonController hoaDonController = new HoaDonController();
                String[] columnNames = {"Mã hóa đơn","Tên khách hàng","Tên nhân viên","Ngày lập hóa đơn","Tổng tiền","Trạng thái hóa đơn"};
                Object[][] tableData = hoaDonController.getSearchedHoaDonFromModel(searchInput);
                DefaultTableModel newTableModel = new DefaultTableModel(tableData,columnNames);
                billTable1.setTableModel(newTableModel);
                repaint();
                revalidate();
            }
        });
        
        //Xử lý sự kiện cho nút xuất
        JButton exportButton = billTableMenuBar1.getExportTableDataButton();
        exportButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (billTable1.getBillTable().getRowCount() > 0) {
                    // Gọi phương thức xuất Excel
                    ExcelExporter.exportToExcel(billTable1.getBillTable(), "Danh sách hóa đơn");
                } else {
                    JOptionPane.showMessageDialog(null, "Không có dữ liệu để xuất!", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillHeaderPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        billTableMenuBar1 = new com.cybergamems.view.components.BillTableMenuBar();
        billTablePanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        billTable1 = new com.cybergamems.view.components.BillTable();

        setBackground(new java.awt.Color(50, 50, 50));

        javax.swing.GroupLayout BillHeaderPanelLayout = new javax.swing.GroupLayout(BillHeaderPanel);
        BillHeaderPanel.setLayout(BillHeaderPanelLayout);
        BillHeaderPanelLayout.setHorizontalGroup(
            BillHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billTableMenuBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );
        BillHeaderPanelLayout.setVerticalGroup(
            BillHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillHeaderPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(billTableMenuBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        billTablePanel.setPreferredSize(new java.awt.Dimension(464, 431));

        javax.swing.GroupLayout billTablePanelLayout = new javax.swing.GroupLayout(billTablePanel);
        billTablePanel.setLayout(billTablePanelLayout);
        billTablePanelLayout.setHorizontalGroup(
            billTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        billTablePanelLayout.setVerticalGroup(
            billTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BillHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BillHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(billTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel BillHeaderPanel;
    private com.cybergamems.view.components.BillTable billTable1;
    private com.cybergamems.view.components.BillTableMenuBar billTableMenuBar1;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel billTablePanel;
    // End of variables declaration//GEN-END:variables
}
