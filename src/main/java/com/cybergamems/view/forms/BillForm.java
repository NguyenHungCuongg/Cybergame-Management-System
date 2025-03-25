package com.cybergamems.view.forms;

import com.cybergamems.model.entities.NhanVien;
import com.cybergamems.view.components.BillTable;
import com.cybergamems.view.dialogs.DetailBillDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
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
        JButton detailButton = tableMenuBar1.getDetailTableDataButton();
        detailButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int selectedBillID = Integer.parseInt(billTable1.getBillTable().getValueAt(selectedBillIndex,0).toString());
                DetailBillDialog detailBillDialog =new DetailBillDialog((JFrame) SwingUtilities.getWindowAncestor(BillForm.this),true,selectedBillID);
                detailBillDialog.setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillHeaderPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        tableMenuBar1 = new com.cybergamems.view.components.TableMenuBar();
        billTablePanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        billTable1 = new com.cybergamems.view.components.BillTable();

        setBackground(new java.awt.Color(50, 50, 50));

        javax.swing.GroupLayout BillHeaderPanelLayout = new javax.swing.GroupLayout(BillHeaderPanel);
        BillHeaderPanel.setLayout(BillHeaderPanelLayout);
        BillHeaderPanelLayout.setHorizontalGroup(
            BillHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableMenuBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BillHeaderPanelLayout.setVerticalGroup(
            BillHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableMenuBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(billTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE))
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
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel billTablePanel;
    private com.cybergamems.view.components.TableMenuBar tableMenuBar1;
    // End of variables declaration//GEN-END:variables
}
