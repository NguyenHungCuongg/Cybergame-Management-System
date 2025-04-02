package com.cybergamems.view.components;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class ComputerTableMenuBar extends javax.swing.JPanel {

    public ComputerTableMenuBar() {
        
        //Sử dụng theme FlatArcDarkOrange trước hàm initComponents() các component của panel được sử dụng theme này
        try {
            UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Orange: " + e.getMessage());
        }
        initComponents();
        //Sau khi render xong các component ở panel này bằng theme FlatArcDarkOrange thì ta quay trở lại theme cũ là 
        //FlatDarkFlat để không ảnh hưởng đến những nơi khác.
        try {
            UIManager.setLookAndFeel(new FlatDarkFlatIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Flat: " + e.getMessage());
        }
    }
    
    //Ta cần thêm các Getter để truy xuất các button ra nếu ta muốn Override các button này ở các form hay frame khác.
    public JButton getAddTableDataButton() {
        return startSessionButton;
    }

    public JButton getEndTableDataButton() {
        return endSessionButton;
    }


    
    public JButton getRefreshTableDataButton(){
        return refreshTableDataButton1;
    }

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        tableFunctionBarPanel = new javax.swing.JPanel();
        startSessionButton = new javax.swing.JButton();
        endSessionButton = new javax.swing.JButton();
        tableSearchBarPanel = new javax.swing.JPanel();
        refreshTableDataButton1 = new javax.swing.JButton();

        tableFunctionBarPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableFunctionBarPanel.setOpaque(false);
        tableFunctionBarPanel.setLayout(new java.awt.GridBagLayout());

        startSessionButton.setBackground(new java.awt.Color(60, 63, 65));
        startSessionButton.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        startSessionButton.setText("Bắt đầu phiên chơi");
        startSessionButton.setMaximumSize(new java.awt.Dimension(80, 40));
        startSessionButton.setMinimumSize(new java.awt.Dimension(80, 40));
        startSessionButton.setPreferredSize(new java.awt.Dimension(80, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        tableFunctionBarPanel.add(startSessionButton, gridBagConstraints);

        endSessionButton.setBackground(new java.awt.Color(60, 63, 65));
        endSessionButton.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        endSessionButton.setText("Kết thúc phiên chơi");
        endSessionButton.setMaximumSize(new java.awt.Dimension(80, 40));
        endSessionButton.setMinimumSize(new java.awt.Dimension(80, 40));
        endSessionButton.setPreferredSize(new java.awt.Dimension(80, 40));
        endSessionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endSessionButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        tableFunctionBarPanel.add(endSessionButton, gridBagConstraints);

        tableSearchBarPanel.setOpaque(false);
        tableSearchBarPanel.setLayout(new java.awt.GridBagLayout());

        refreshTableDataButton1.setBackground(new java.awt.Color(60, 63, 65));
        refreshTableDataButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        refreshTableDataButton1.setText("Làm mới");
        refreshTableDataButton1.setMaximumSize(new java.awt.Dimension(100, 40));
        refreshTableDataButton1.setMinimumSize(new java.awt.Dimension(100, 40));
        refreshTableDataButton1.setPreferredSize(new java.awt.Dimension(100, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        tableSearchBarPanel.add(refreshTableDataButton1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tableFunctionBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tableSearchBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableFunctionBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableSearchBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void endSessionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endSessionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endSessionButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton endSessionButton;
    private javax.swing.JButton refreshTableDataButton1;
    private javax.swing.JButton startSessionButton;
    private javax.swing.JPanel tableFunctionBarPanel;
    private javax.swing.JPanel tableSearchBarPanel;
    // End of variables declaration//GEN-END:variables
}
