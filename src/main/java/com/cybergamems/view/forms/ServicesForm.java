package com.cybergamems.view.forms;
import com.cybergamems.controller.HoaDonController;
import com.cybergamems.model.entities.NhanVien;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import com.cybergamems.utils.viewUtils;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class ServicesForm extends javax.swing.JPanel {    
    private NhanVien loginedNhanVien;
    
    public ServicesForm(NhanVien loginedNhanVien) {
        this.loginedNhanVien = loginedNhanVien;
        initComponents();
    }
    
    public void updateTotalBill() {
        double tongTien = foodAndDrinkBillTable1.calculateTotalBill();
        totalBillLabel.setText("Tổng tiền: " + viewUtils.formatDoubleWithoutDecimal(tongTien) + " VND");
        totalBillLabel.revalidate();
        totalBillLabel.repaint();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        try {
            UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Orange: " + e.getMessage());
        }
        billSectionPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        detailBillTablePanel = new javax.swing.JPanel();
        foodAndDrinkBillTable1 = new com.cybergamems.view.components.FoodAndDrinkBillTable(this);
        totalBillLabel = new javax.swing.JLabel();
        addToBillButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        clientUsernameLabel = new javax.swing.JLabel();
        clientUsernameTextField = new javax.swing.JTextField();
        foodSectionPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodAndDrinkBar2 = new com.cybergamems.view.components.FoodAndDrinkBar("Food",foodAndDrinkBillTable1);
        drinkSectionPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        foodAndDrinkBar3 = new com.cybergamems.view.components.FoodAndDrinkBar("Drink",foodAndDrinkBillTable1);
        jLabel4 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        billSectionPanel.setBackground(new java.awt.Color(57, 56, 56));
        billSectionPanel.setLayout(new java.awt.GridBagLayout());

        detailBillTablePanel.setPreferredSize(new java.awt.Dimension(100, 160));

        javax.swing.GroupLayout detailBillTablePanelLayout = new javax.swing.GroupLayout(detailBillTablePanel);
        detailBillTablePanel.setLayout(detailBillTablePanelLayout);
        detailBillTablePanelLayout.setHorizontalGroup(
            detailBillTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foodAndDrinkBillTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        detailBillTablePanelLayout.setVerticalGroup(
            detailBillTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foodAndDrinkBillTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 460;
        billSectionPanel.add(detailBillTablePanel, gridBagConstraints);

        totalBillLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        totalBillLabel.setText("Tổng tiền: 0 VND ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        billSectionPanel.add(totalBillLabel, gridBagConstraints);

        addToBillButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        addToBillButton.setText("Thêm vào hóa đơn");
        addToBillButton.setPreferredSize(new java.awt.Dimension(150, 40));
        addToBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToBillButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        billSectionPanel.add(addToBillButton, gridBagConstraints);

        cancelButton.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        cancelButton.setText("Hủy");
        cancelButton.setPreferredSize(new java.awt.Dimension(150, 40));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        billSectionPanel.add(cancelButton, gridBagConstraints);

        clientUsernameLabel.setText("Tên đăng nhập:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        billSectionPanel.add(clientUsernameLabel, gridBagConstraints);

        clientUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientUsernameTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        billSectionPanel.add(clientUsernameTextField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        add(billSectionPanel, gridBagConstraints);
        try {
            UIManager.setLookAndFeel(new FlatDarkFlatIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Flat: " + e.getMessage());
        }

        foodSectionPanel.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 140, 0));
        jLabel1.setText("Food");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(foodAndDrinkBar2);

        javax.swing.GroupLayout foodSectionPanelLayout = new javax.swing.GroupLayout(foodSectionPanel);
        foodSectionPanel.setLayout(foodSectionPanelLayout);
        foodSectionPanelLayout.setHorizontalGroup(
            foodSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodSectionPanelLayout.createSequentialGroup()
                .addGroup(foodSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodSectionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        foodSectionPanelLayout.setVerticalGroup(
            foodSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodSectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(foodSectionPanel, gridBagConstraints);

        drinkSectionPanel.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 140, 0));
        jLabel2.setText("Drink");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setViewportView(foodAndDrinkBar3);

        javax.swing.GroupLayout drinkSectionPanelLayout = new javax.swing.GroupLayout(drinkSectionPanel);
        drinkSectionPanel.setLayout(drinkSectionPanelLayout);
        drinkSectionPanelLayout.setHorizontalGroup(
            drinkSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinkSectionPanelLayout.createSequentialGroup()
                .addGroup(drinkSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drinkSectionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        drinkSectionPanelLayout.setVerticalGroup(
            drinkSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinkSectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(drinkSectionPanel, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Roboto Bk", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 140, 0));
        jLabel4.setText("Food & Drink Menu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        add(jLabel4, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void addToBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToBillButtonActionPerformed
        String tenDangNhap = clientUsernameTextField.getText();
        if(tenDangNhap.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Cần phải nhập tên đăng nhập của khách hàng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        HoaDonController hoaDonController = new HoaDonController();
        DefaultTableModel tableData = foodAndDrinkBillTable1.getCurrentTableData();
            
        int result = hoaDonController.addFoodAndDrinkBill(tenDangNhap,loginedNhanVien,tableData);
        if(result==0){
            JOptionPane.showMessageDialog(null, "Không tìm được tên đăng nhập của khách hàng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(result==1){
            JOptionPane.showMessageDialog(null, "Đã thêm vào hóa đơn của khách hàng!");
            return;
        }
        else if(result==2){
            JOptionPane.showMessageDialog(null, "Người dùng không hoạt động", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi khi thêm vào hóa đơn của khách hàng!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
    }//GEN-LAST:event_addToBillButtonActionPerformed

    private void clientUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientUsernameTextFieldActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        foodAndDrinkBillTable1.clearTableModel();
        totalBillLabel.setText("Tổng tiền: 0 VND");
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToBillButton;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel billSectionPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel clientUsernameLabel;
    private javax.swing.JTextField clientUsernameTextField;
    private javax.swing.JPanel detailBillTablePanel;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel drinkSectionPanel;
    private com.cybergamems.view.components.FoodAndDrinkBar foodAndDrinkBar2;
    private com.cybergamems.view.components.FoodAndDrinkBar foodAndDrinkBar3;
    private com.cybergamems.view.components.FoodAndDrinkBillTable foodAndDrinkBillTable1;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel foodSectionPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel totalBillLabel;
    // End of variables declaration//GEN-END:variables
}
