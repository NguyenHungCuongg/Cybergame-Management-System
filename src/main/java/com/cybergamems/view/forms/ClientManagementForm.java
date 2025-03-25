package com.cybergamems.view.forms;

import com.cybergamems.controller.KhachHangController;
import com.cybergamems.model.entities.NhanVien;
import com.cybergamems.view.components.ClientManagementTable;
import com.cybergamems.view.dialogs.AddClientDialog;
import com.cybergamems.view.dialogs.DetailClientDialog;
import com.cybergamems.view.dialogs.EditClientDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class ClientManagementForm extends javax.swing.JPanel {
    private int selectedClientIndex;
    private NhanVien loginedNhanVien;

    public ClientManagementForm(NhanVien loginedNhanVien) {
        selectedClientIndex = -1;
        this.loginedNhanVien = loginedNhanVien;
        initComponents();
        initTableEvent();
        initButtonEvent();
    }
    
    public void initTableEvent(){
        clientManagementTable1.getClientTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()){ // Đảm bảo sự kiện chỉ kích hoạt một lần
                    //truy xuất index của hàng được người dùng chọn trong table
                    int selectedRow = clientManagementTable1.getClientTable().getSelectedRow();
                    //Nếu truy xuất được hàng
                    if(selectedRow != -1){
                        selectedClientIndex = selectedRow;
                    }
                }
            }
        });
    }
    
    private void refreshTable(){
        ClientManagementTable newTable = new ClientManagementTable();
        DefaultTableModel newTableModel = (DefaultTableModel) newTable.getTableModel();

        clientManagementTable1.setTableModel(newTableModel);
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
        
        //Xử lý sự kiện cho nút thêm khách hàng
        JButton addButton = tableMenuBar1.getAddTableDataButton();
        addButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                AddClientDialog addClientDialog = new AddClientDialog((JFrame) SwingUtilities.getWindowAncestor(ClientManagementForm.this),true);
                addClientDialog.setVisible(true);
                refreshTable();
            }  
        });
        
        //Xử lý sự kiện cho nút xóa khách hàng
        JButton deleteButton = tableMenuBar1.getDeleteTableDataButton();
        deleteButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int selectedClientID = Integer.parseInt(clientManagementTable1.getClientTable().getValueAt(selectedClientIndex,0).toString());
                KhachHangController khachHangController = new KhachHangController();
                boolean result = khachHangController.deleteKhachHangFromModel(selectedClientID);
                if(result){
                    JOptionPane.showMessageDialog(null, "Xóa khách hàng thành công!");
                    refreshTable();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Xóa khách hàng thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        //Xử lý sự kiện cho nút chỉnh sửa khách hàng
        JButton editButton = tableMenuBar1.getEditTableDataButton();
        editButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int selectedClientID = Integer.parseInt(clientManagementTable1.getClientTable().getValueAt(selectedClientIndex,0).toString());
                EditClientDialog editClientDialog = new EditClientDialog((JFrame) SwingUtilities.getWindowAncestor(ClientManagementForm.this),true,selectedClientID); 
                editClientDialog.setVisible(true);
                refreshTable();
            }
        });
        
        //Xử lý sự kiện cho nút chi tiết 
        JButton detailButton = tableMenuBar1.getDetailTableDataButton();
        detailButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int selectedClientID = Integer.parseInt(clientManagementTable1.getClientTable().getValueAt(selectedClientIndex,0).toString());
                DetailClientDialog detailClientDialog =new DetailClientDialog((JFrame) SwingUtilities.getWindowAncestor(ClientManagementForm.this),true,selectedClientID);
                detailClientDialog.setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientManagementHeaderPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        tableMenuBar1 = new com.cybergamems.view.components.TableMenuBar();
        clientManagementTablePanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        clientManagementTable1 = new com.cybergamems.view.components.ClientManagementTable();

        setBackground(new java.awt.Color(50, 50, 50));

        javax.swing.GroupLayout clientManagementHeaderPanelLayout = new javax.swing.GroupLayout(clientManagementHeaderPanel);
        clientManagementHeaderPanel.setLayout(clientManagementHeaderPanelLayout);
        clientManagementHeaderPanelLayout.setHorizontalGroup(
            clientManagementHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableMenuBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        clientManagementHeaderPanelLayout.setVerticalGroup(
            clientManagementHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableMenuBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        clientManagementTablePanel.setPreferredSize(new java.awt.Dimension(464, 431));

        javax.swing.GroupLayout clientManagementTablePanelLayout = new javax.swing.GroupLayout(clientManagementTablePanel);
        clientManagementTablePanel.setLayout(clientManagementTablePanelLayout);
        clientManagementTablePanelLayout.setHorizontalGroup(
            clientManagementTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientManagementTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        clientManagementTablePanelLayout.setVerticalGroup(
            clientManagementTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientManagementTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientManagementHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientManagementTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientManagementHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clientManagementTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel clientManagementHeaderPanel;
    private com.cybergamems.view.components.ClientManagementTable clientManagementTable1;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel clientManagementTablePanel;
    private com.cybergamems.view.components.TableMenuBar tableMenuBar1;
    // End of variables declaration//GEN-END:variables
}
