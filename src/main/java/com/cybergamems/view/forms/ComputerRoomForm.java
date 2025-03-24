package com.cybergamems.view.forms;

import com.cybergamems.controller.MayTinhController;
import com.cybergamems.view.components.ClientManagementTable;
import com.cybergamems.view.components.ComputerRoomTable;
import com.cybergamems.view.dialogs.AddSessionDialog;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class ComputerRoomForm extends javax.swing.JPanel {
    int selectedNormalComputerIndex=-1;
    int selectedVIPComputerIndex=-1;
    int selectedLivestreamComputerIndex=-1;
    
    public ComputerRoomForm() {
        initComponents();
        initTableEvent();
        initButtonEvent();
    }
    
    private void refreshTable(){
        ComputerRoomTable newNormalComputerTable = new ComputerRoomTable();
        ComputerRoomTable newVIPComputerTable = new ComputerRoomTable();
        ComputerRoomTable newLivestreamComputerTable = new ComputerRoomTable();
        
        DefaultTableModel newNormalComputerTableModel = (DefaultTableModel) normalComputerRoomTable.getTableModel();
        DefaultTableModel newVIPComputerTableModel = (DefaultTableModel) vipComputerRoomTable.getTableModel();
        DefaultTableModel newLivestreamComputerTableModel = (DefaultTableModel) livestreamComputerRoomTable.getTableModel();

        normalComputerRoomTable.setTableModel(newNormalComputerTableModel);
        vipComputerRoomTable.setTableModel(newVIPComputerTableModel);
        livestreamComputerRoomTable.setTableModel(newLivestreamComputerTableModel);
        
        repaint();
        revalidate();
    }
    
    public void initTableEvent(){
        //Thiết lập index cho các máy trong phòng thường 
        normalComputerRoomTable.getComputerTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()){ // Đảm bảo sự kiện chỉ kích hoạt một lần
                    //truy xuất index của hàng được người dùng chọn trong table
                    int selectedRow = normalComputerRoomTable.getComputerTable().getSelectedRow();
                    //Nếu truy xuất được hàng
                    if(selectedRow != -1){
                        selectedNormalComputerIndex = selectedRow;
                        
                        //Nếu 1 hàng của 1 bảng đang được chọn thì các bảng còn lại không được chọn nữa
                        vipComputerRoomTable.getComputerTable().clearSelection();
                        livestreamComputerRoomTable.getComputerTable().clearSelection();
                        selectedVIPComputerIndex=-1;
                        selectedLivestreamComputerIndex=-1;
                    }
                }
            }
        });
        
        //Thiết lập index cho các máy trong phòng VIP
        vipComputerRoomTable.getComputerTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()){ // Đảm bảo sự kiện chỉ kích hoạt một lần
                    //truy xuất index của hàng được người dùng chọn trong table
                    int selectedRow = vipComputerRoomTable.getComputerTable().getSelectedRow();
                    //Nếu truy xuất được hàng
                    if(selectedRow != -1){
                        selectedVIPComputerIndex = selectedRow;
                        
                        //Nếu 1 hàng của 1 bảng đang được chọn thì các bảng còn lại không được chọn nữa
                        normalComputerRoomTable.getComputerTable().clearSelection();
                        livestreamComputerRoomTable.getComputerTable().clearSelection();
                        selectedNormalComputerIndex=-1;
                        selectedLivestreamComputerIndex=-1;
                    }
                }
            }
        });
        
        //Thiết lập index cho các máy trong phòng Livestream
        livestreamComputerRoomTable.getComputerTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()){ // Đảm bảo sự kiện chỉ kích hoạt một lần
                    //truy xuất index của hàng được người dùng chọn trong table
                    int selectedRow = livestreamComputerRoomTable.getComputerTable().getSelectedRow();
                    //Nếu truy xuất được hàng
                    if(selectedRow != -1){
                        selectedLivestreamComputerIndex = selectedRow;
                        
                        //Nếu 1 hàng của 1 bảng đang được chọn thì các bảng còn lại không được chọn nữa
                        normalComputerRoomTable.getComputerTable().clearSelection();
                        vipComputerRoomTable.getComputerTable().clearSelection();
                        selectedNormalComputerIndex=-1;
                        selectedVIPComputerIndex=-1;
                    }
                }
            }
        });
    }
    
    public void initButtonEvent(){
        //Xử lý sự kiện cho nút bắt đầu phiên chơi
        JButton addSessionButton = computerTableMenuBar.getAddTableDataButton();
        addSessionButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AddSessionDialog addSessionDialog = new AddSessionDialog((JFrame) SwingUtilities.getWindowAncestor(ComputerRoomForm.this),true);
                addSessionDialog.setVisible(true);
                refreshTable();
            }
        });
        
        JButton deleteSessionButton = computerTableMenuBar.getEndTableDataButton();
        deleteSessionButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                boolean result = false;
       
                if(selectedVIPComputerIndex==-1 && selectedLivestreamComputerIndex==-1){
                    int selectedNormalComputerID = Integer.parseInt(normalComputerRoomTable.getComputerTable().getValueAt(selectedNormalComputerIndex, 0).toString());
                    MayTinhController mayTinhController = new MayTinhController();
                    result = mayTinhController.deletePhienChoiFromModel(selectedNormalComputerID);
                }
                else if(selectedNormalComputerIndex==-1 && selectedLivestreamComputerIndex==-1){
                    int selectedVIPComputerID = Integer.parseInt(vipComputerRoomTable.getComputerTable().getValueAt(selectedVIPComputerIndex, 0).toString());
                    MayTinhController mayTinhController = new MayTinhController();
                    result = mayTinhController.deletePhienChoiFromModel(selectedVIPComputerID);
                }
                else if(selectedVIPComputerIndex==-1 && selectedNormalComputerIndex==-1){
                    int selectedLivestreamComputerID = Integer.parseInt(livestreamComputerRoomTable.getComputerTable().getValueAt(selectedLivestreamComputerIndex, 0).toString());
                    MayTinhController mayTinhController = new MayTinhController();
                    result = mayTinhController.deletePhienChoiFromModel(selectedLivestreamComputerID);
                }
                else{
                    result = false;
                }
                
                if(result){ 
                    JOptionPane.showMessageDialog(null, "Kết thúc phiên chơi thành công!");
                    refreshTable();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Kết thúc phiên chơi thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public Dimension dimesonOfComputerRoomPanel(){
        int width = computerRoomTablePanel.getPreferredSize().width;
        int height = 1000;
        return new Dimension(width, height);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        computerRoomHeaderPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        computerTableMenuBar = new com.cybergamems.view.components.ComputerTableMenuBar();
        computerRoomTablePanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customizedBorderRadiusPanel1 = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        normalComputerRoomTable = new com.cybergamems.view.components.ComputerRoomTable("Thường");
        vipComputerRoomTable = new com.cybergamems.view.components.ComputerRoomTable("VIP");
        livestreamComputerRoomTable = new com.cybergamems.view.components.ComputerRoomTable("Livestream");

        setBackground(new java.awt.Color(50, 50, 50));
        setPreferredSize(new java.awt.Dimension(1015, 682));

        javax.swing.GroupLayout computerRoomHeaderPanelLayout = new javax.swing.GroupLayout(computerRoomHeaderPanel);
        computerRoomHeaderPanel.setLayout(computerRoomHeaderPanelLayout);
        computerRoomHeaderPanelLayout.setHorizontalGroup(
            computerRoomHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(computerRoomHeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(computerTableMenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                .addContainerGap())
        );
        computerRoomHeaderPanelLayout.setVerticalGroup(
            computerRoomHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, computerRoomHeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(computerTableMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        customizedBorderRadiusPanel1.setPreferredSize(this.dimesonOfComputerRoomPanel());
        customizedBorderRadiusPanel1.setLayout(new javax.swing.BoxLayout(customizedBorderRadiusPanel1, javax.swing.BoxLayout.Y_AXIS));

        normalComputerRoomTable.setMinimumSize(new java.awt.Dimension(896, 100));
        customizedBorderRadiusPanel1.add(normalComputerRoomTable);

        vipComputerRoomTable.setMinimumSize(new java.awt.Dimension(898, 100));
        customizedBorderRadiusPanel1.add(vipComputerRoomTable);

        livestreamComputerRoomTable.setMinimumSize(new java.awt.Dimension(896, 100));
        customizedBorderRadiusPanel1.add(livestreamComputerRoomTable);

        jScrollPane1.setViewportView(customizedBorderRadiusPanel1);

        javax.swing.GroupLayout computerRoomTablePanelLayout = new javax.swing.GroupLayout(computerRoomTablePanel);
        computerRoomTablePanel.setLayout(computerRoomTablePanelLayout);
        computerRoomTablePanelLayout.setHorizontalGroup(
            computerRoomTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        computerRoomTablePanelLayout.setVerticalGroup(
            computerRoomTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(computerRoomHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(computerRoomTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(computerRoomHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(computerRoomTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel computerRoomHeaderPanel;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel computerRoomTablePanel;
    private com.cybergamems.view.components.ComputerTableMenuBar computerTableMenuBar;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel customizedBorderRadiusPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.cybergamems.view.components.ComputerRoomTable livestreamComputerRoomTable;
    private com.cybergamems.view.components.ComputerRoomTable normalComputerRoomTable;
    private com.cybergamems.view.components.ComputerRoomTable vipComputerRoomTable;
    // End of variables declaration//GEN-END:variables
}
