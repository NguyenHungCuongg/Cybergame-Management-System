package com.cybergamems.view.forms;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.*;

public class HomeForm extends javax.swing.JPanel {
    public HomeForm() {
        initComponents();
        setupLayout();
        initCards();
    }
    
    private void setupLayout(){
        homeFormCardListPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }
    
    private void initCards(){
        featureCardImage1.setIcon(new FlatSVGIcon("svg/picture-icon.svg"));
        featureCardTitle1.setText("Giao diện thân thiện");
        featureCardDescription1.setText("Giúp khách hàng và nhân viên dễ dàng thao tác mà không cần hướng dẫn phức tạp.");
        featureCardDescription1.setOpaque(false);
        featureCardDescription1.setLineWrap(true);
        featureCardDescription1.setWrapStyleWord(true);
        featureCardDescription1.setEditable(false);
        
        featureCardImage2.setIcon(new FlatSVGIcon("svg/calculator-icon.svg"));
        featureCardTitle2.setText("Thanh Toán Linh Hoạt");
        featureCardDescription2.setText("Hỗ trợ nhiều phương thức thanh toán (tiền mặt, chuyển khoản). Có thể nạp tiền vào tài khoản trước hoặc thanh toán sau khi chơi.");
        featureCardDescription2.setOpaque(false);
        featureCardDescription2.setLineWrap(true);
        featureCardDescription2.setWrapStyleWord(true);
        featureCardDescription2.setEditable(false);
        
        featureCardImage3.setIcon(new FlatSVGIcon("svg/webcam-icon.svg"));
        featureCardTitle3.setText("Quản lí hiệu quả");
        featureCardDescription3.setText("Theo dõi tình trạng máy (đang sử dụng, trống, bảo trì). Hỗ trợ quản lý thời gian chơi và chi phí chính xác.");
        featureCardDescription3.setOpaque(false);
        featureCardDescription3.setLineWrap(true);
        featureCardDescription3.setWrapStyleWord(true);
        featureCardDescription3.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        homeFormHeaderPanel = new com.cybergamems.view.panels.CustomizedBorderPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        homeFormCardsPanel = new com.cybergamems.view.panels.CustomizedBorderPanel();
        homeFormCardListPanel = new com.cybergamems.view.panels.CustomizedBorderPanel();
        featureCardPanel1 = new com.cybergamems.view.panels.CustomizedBorderPanel();
        featureCardImage1 = new javax.swing.JLabel();
        featureCardTitle1 = new javax.swing.JLabel();
        featureCardDescription1 = new javax.swing.JTextArea();
        featureCardPanel2 = new com.cybergamems.view.panels.CustomizedBorderPanel();
        featureCardImage2 = new javax.swing.JLabel();
        featureCardTitle2 = new javax.swing.JLabel();
        featureCardDescription2 = new javax.swing.JTextArea();
        featureCardPanel3 = new com.cybergamems.view.panels.CustomizedBorderPanel();
        featureCardImage3 = new javax.swing.JLabel();
        featureCardTitle3 = new javax.swing.JLabel();
        featureCardDescription3 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(50, 50, 50));

        homeFormHeaderPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHÀO MỪNG BẠN ĐÃ QUAY TRỞ LẠI VỚI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(55, 276, 0, 277);
        homeFormHeaderPanel.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Roboto Bk", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 140, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CYBER CORE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 300, 56, 0);
        homeFormHeaderPanel.add(jLabel2, gridBagConstraints);

        homeFormCardsPanel.setLayout(new java.awt.BorderLayout());

        homeFormCardListPanel.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        featureCardPanel1.setBackground(new java.awt.Color(50, 50, 50));
        featureCardPanel1.setLayout(new java.awt.GridBagLayout());

        featureCardImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        featureCardImage1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(50, 20, 50, 20);
        featureCardPanel1.add(featureCardImage1, gridBagConstraints);

        featureCardTitle1.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        featureCardTitle1.setForeground(new java.awt.Color(255, 140, 0));
        featureCardTitle1.setText("Tiêu đề");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        featureCardPanel1.add(featureCardTitle1, gridBagConstraints);

        featureCardDescription1.setColumns(20);
        featureCardDescription1.setFont(new java.awt.Font("Roboto Lt", 0, 12)); // NOI18N
        featureCardDescription1.setRows(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        featureCardPanel1.add(featureCardDescription1, gridBagConstraints);

        homeFormCardListPanel.add(featureCardPanel1);

        featureCardPanel2.setBackground(new java.awt.Color(50, 50, 50));
        featureCardPanel2.setLayout(new java.awt.GridBagLayout());

        featureCardImage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        featureCardImage2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(50, 20, 50, 20);
        featureCardPanel2.add(featureCardImage2, gridBagConstraints);

        featureCardTitle2.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        featureCardTitle2.setForeground(new java.awt.Color(255, 140, 0));
        featureCardTitle2.setText("Tiêu đề");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        featureCardPanel2.add(featureCardTitle2, gridBagConstraints);

        featureCardDescription2.setColumns(20);
        featureCardDescription2.setFont(new java.awt.Font("Roboto Lt", 0, 12)); // NOI18N
        featureCardDescription2.setRows(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        featureCardPanel2.add(featureCardDescription2, gridBagConstraints);

        homeFormCardListPanel.add(featureCardPanel2);

        featureCardPanel3.setBackground(new java.awt.Color(50, 50, 50));
        featureCardPanel3.setLayout(new java.awt.GridBagLayout());

        featureCardImage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        featureCardImage3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(50, 20, 50, 20);
        featureCardPanel3.add(featureCardImage3, gridBagConstraints);

        featureCardTitle3.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        featureCardTitle3.setForeground(new java.awt.Color(255, 140, 0));
        featureCardTitle3.setText("Tiêu đề");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        featureCardPanel3.add(featureCardTitle3, gridBagConstraints);

        featureCardDescription3.setColumns(20);
        featureCardDescription3.setFont(new java.awt.Font("Roboto Lt", 0, 12)); // NOI18N
        featureCardDescription3.setRows(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        featureCardPanel3.add(featureCardDescription3, gridBagConstraints);

        homeFormCardListPanel.add(featureCardPanel3);

        homeFormCardsPanel.add(homeFormCardListPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeFormCardsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(homeFormHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeFormHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeFormCardsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.cybergamems.view.panels.CustomizedBorderPanel customizedBorderPanel2;
    private com.cybergamems.view.panels.CustomizedBorderPanel customizedBorderPanel3;
    private javax.swing.JTextArea featureCardDescription1;
    private javax.swing.JTextArea featureCardDescription2;
    private javax.swing.JTextArea featureCardDescription3;
    private javax.swing.JLabel featureCardImage1;
    private javax.swing.JLabel featureCardImage2;
    private javax.swing.JLabel featureCardImage3;
    private com.cybergamems.view.panels.CustomizedBorderPanel featureCardPanel1;
    private com.cybergamems.view.panels.CustomizedBorderPanel featureCardPanel2;
    private com.cybergamems.view.panels.CustomizedBorderPanel featureCardPanel3;
    private javax.swing.JLabel featureCardTitle1;
    private javax.swing.JLabel featureCardTitle2;
    private javax.swing.JLabel featureCardTitle3;
    private com.cybergamems.view.panels.CustomizedBorderPanel homeFormCardListPanel;
    private com.cybergamems.view.panels.CustomizedBorderPanel homeFormCardsPanel;
    private com.cybergamems.view.panels.CustomizedBorderPanel homeFormHeaderPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
