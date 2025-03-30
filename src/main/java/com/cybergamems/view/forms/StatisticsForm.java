package com.cybergamems.view.forms;

import com.cybergamems.view.components.chart.ModelChart;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;

public class StatisticsForm extends javax.swing.JPanel {
    public StatisticsForm() {
        initComponents();
        initChartData();
    }
    
    public void initChartData(){
        chart.addLegend("Doanh thu", new Color(40, 199, 122));
        chart.addLegend("Chi phí", new Color(145, 54, 209));
        chart.addLegend("Lợi nhuận", new Color(255, 140, 0));
        chart.addData(new ModelChart("Tháng 1", new double[]{50000000, 20000000, 8000000}));
        chart.addData(new ModelChart("Tháng 2", new double[]{60000000, 75000000, 9000000}));
        chart.addData(new ModelChart("Tháng 3", new double[]{20000000, 35000000, 46000000}));
        chart.addData(new ModelChart("Tháng 4", new double[]{48000000, 15000000, 75000000}));
        chart.addData(new ModelChart("Tháng 5", new double[]{35000000, 54000000, 30000000}));
        chart.addData(new ModelChart("Tháng 6", new double[]{19000000, 28000000, 8100000}));
        chart.addData(new ModelChart("Tháng 7", new double[]{50000000, 20000000, 8000000}));
        chart.addData(new ModelChart("Tháng 8", new double[]{60000000, 75000000, 9000000}));
        chart.addData(new ModelChart("Tháng 9", new double[]{20000000, 35000000, 46000000}));
        chart.addData(new ModelChart("Tháng 10", new double[]{48000000, 15000000, 75000000}));
        chart.addData(new ModelChart("Tháng 11", new double[]{35000000, 54000000, 30000000}));
        chart.addData(new ModelChart("Tháng 12", new double[]{19000000, 28000000, 8100000}));
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        quantitySection = new javax.swing.JPanel();
        quantityOfNormalComputerPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        normalComputerIcon = new javax.swing.JLabel();
        displayQuantityPanel = new javax.swing.JPanel();
        quantityHeaderLabel = new javax.swing.JLabel();
        quantityInfoLabel = new javax.swing.JLabel();
        quantityOfVIPComputerPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        VIPComputerIcon = new javax.swing.JLabel();
        displayQuantityPanel1 = new javax.swing.JPanel();
        quantityHeaderLabel1 = new javax.swing.JLabel();
        quantityInfoLabel1 = new javax.swing.JLabel();
        quantityOfLivestreamComputerPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        LivestreamComputerIcon = new javax.swing.JLabel();
        displayQuantityPanel2 = new javax.swing.JPanel();
        quantityHeaderLabel2 = new javax.swing.JLabel();
        quantityInfoLabel2 = new javax.swing.JLabel();
        quantityOfClientPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        staffIcon = new javax.swing.JLabel();
        displayQuantityPanel3 = new javax.swing.JPanel();
        quantityHeaderLabel3 = new javax.swing.JLabel();
        quantityInfoLabel3 = new javax.swing.JLabel();
        quantityOfStaffPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        clientIcon = new javax.swing.JLabel();
        displayQuantityPanel4 = new javax.swing.JPanel();
        quantityHeaderLabel4 = new javax.swing.JLabel();
        quantityInfoLabel4 = new javax.swing.JLabel();
        chartSection = new javax.swing.JPanel();
        chartSectionScrollPane = new javax.swing.JScrollPane();
        mainChartPanel = new javax.swing.JPanel();
        charFunctionButtonsBar = new javax.swing.JPanel();
        addExpensesButton = new javax.swing.JButton();
        displayStatisticButton = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        chart = new com.cybergamems.view.components.chart.Chart();

        setBackground(new java.awt.Color(50, 50, 50));

        quantitySection.setBackground(new java.awt.Color(50, 50, 50));
        quantitySection.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        quantityOfNormalComputerPanel.setLayout(new java.awt.GridBagLayout());

        normalComputerIcon.setIcon(new FlatSVGIcon("svg/normal-computer-icon.svg"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        quantityOfNormalComputerPanel.add(normalComputerIcon, gridBagConstraints);

        quantityHeaderLabel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        quantityHeaderLabel.setText("Số máy phòng thường");

        quantityInfoLabel.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        quantityInfoLabel.setText("0");

        javax.swing.GroupLayout displayQuantityPanelLayout = new javax.swing.GroupLayout(displayQuantityPanel);
        displayQuantityPanel.setLayout(displayQuantityPanelLayout);
        displayQuantityPanelLayout.setHorizontalGroup(
            displayQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quantityHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(quantityInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        displayQuantityPanelLayout.setVerticalGroup(
            displayQuantityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayQuantityPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(quantityHeaderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantityInfoLabel)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        quantityOfNormalComputerPanel.add(displayQuantityPanel, gridBagConstraints);

        quantitySection.add(quantityOfNormalComputerPanel);

        quantityOfVIPComputerPanel.setLayout(new java.awt.GridBagLayout());

        VIPComputerIcon.setIcon(new FlatSVGIcon("svg/vip-computer-icon.svg"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        quantityOfVIPComputerPanel.add(VIPComputerIcon, gridBagConstraints);

        quantityHeaderLabel1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        quantityHeaderLabel1.setText("Số máy phòng VIP");

        quantityInfoLabel1.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        quantityInfoLabel1.setText("0");

        javax.swing.GroupLayout displayQuantityPanel1Layout = new javax.swing.GroupLayout(displayQuantityPanel1);
        displayQuantityPanel1.setLayout(displayQuantityPanel1Layout);
        displayQuantityPanel1Layout.setHorizontalGroup(
            displayQuantityPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quantityHeaderLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(quantityInfoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        displayQuantityPanel1Layout.setVerticalGroup(
            displayQuantityPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayQuantityPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(quantityHeaderLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantityInfoLabel1)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        quantityOfVIPComputerPanel.add(displayQuantityPanel1, gridBagConstraints);

        quantitySection.add(quantityOfVIPComputerPanel);

        quantityOfLivestreamComputerPanel.setLayout(new java.awt.GridBagLayout());

        LivestreamComputerIcon.setIcon(new FlatSVGIcon("svg/livestream-computer-icon.svg"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        quantityOfLivestreamComputerPanel.add(LivestreamComputerIcon, gridBagConstraints);

        quantityHeaderLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        quantityHeaderLabel2.setText("Số máy phòng Livestream");

        quantityInfoLabel2.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        quantityInfoLabel2.setText("0");

        javax.swing.GroupLayout displayQuantityPanel2Layout = new javax.swing.GroupLayout(displayQuantityPanel2);
        displayQuantityPanel2.setLayout(displayQuantityPanel2Layout);
        displayQuantityPanel2Layout.setHorizontalGroup(
            displayQuantityPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quantityHeaderLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(quantityInfoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        displayQuantityPanel2Layout.setVerticalGroup(
            displayQuantityPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayQuantityPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(quantityHeaderLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantityInfoLabel2)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        quantityOfLivestreamComputerPanel.add(displayQuantityPanel2, gridBagConstraints);

        quantitySection.add(quantityOfLivestreamComputerPanel);

        quantityOfClientPanel.setLayout(new java.awt.GridBagLayout());

        staffIcon.setIcon(new FlatSVGIcon("svg/staff-icon.svg"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        quantityOfClientPanel.add(staffIcon, gridBagConstraints);

        quantityHeaderLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        quantityHeaderLabel3.setText("Số nhân viên");

        quantityInfoLabel3.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        quantityInfoLabel3.setText("0");

        javax.swing.GroupLayout displayQuantityPanel3Layout = new javax.swing.GroupLayout(displayQuantityPanel3);
        displayQuantityPanel3.setLayout(displayQuantityPanel3Layout);
        displayQuantityPanel3Layout.setHorizontalGroup(
            displayQuantityPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quantityHeaderLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(quantityInfoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        displayQuantityPanel3Layout.setVerticalGroup(
            displayQuantityPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayQuantityPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(quantityHeaderLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantityInfoLabel3)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        quantityOfClientPanel.add(displayQuantityPanel3, gridBagConstraints);

        quantitySection.add(quantityOfClientPanel);

        quantityOfStaffPanel.setLayout(new java.awt.GridBagLayout());

        clientIcon.setIcon(new FlatSVGIcon("svg/client-icon.svg"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        quantityOfStaffPanel.add(clientIcon, gridBagConstraints);

        quantityHeaderLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        quantityHeaderLabel4.setText("Số khách hàng");

        quantityInfoLabel4.setFont(new java.awt.Font("Roboto Bk", 1, 24)); // NOI18N
        quantityInfoLabel4.setText("0");

        javax.swing.GroupLayout displayQuantityPanel4Layout = new javax.swing.GroupLayout(displayQuantityPanel4);
        displayQuantityPanel4.setLayout(displayQuantityPanel4Layout);
        displayQuantityPanel4Layout.setHorizontalGroup(
            displayQuantityPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(quantityHeaderLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(quantityInfoLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        displayQuantityPanel4Layout.setVerticalGroup(
            displayQuantityPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayQuantityPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(quantityHeaderLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quantityInfoLabel4)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        quantityOfStaffPanel.add(displayQuantityPanel4, gridBagConstraints);

        quantitySection.add(quantityOfStaffPanel);

        chartSection.setBackground(new java.awt.Color(50, 50, 50));

        addExpensesButton.setText("Thêm chi phí");
        addExpensesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExpensesButtonActionPerformed(evt);
            }
        });

        displayStatisticButton.setText("Xem thống kê");
        displayStatisticButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayStatisticButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Thống kê năm:");

        javax.swing.GroupLayout charFunctionButtonsBarLayout = new javax.swing.GroupLayout(charFunctionButtonsBar);
        charFunctionButtonsBar.setLayout(charFunctionButtonsBarLayout);
        charFunctionButtonsBarLayout.setHorizontalGroup(
            charFunctionButtonsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(charFunctionButtonsBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addExpensesButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayStatisticButton)
                .addContainerGap())
        );
        charFunctionButtonsBarLayout.setVerticalGroup(
            charFunctionButtonsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(charFunctionButtonsBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(charFunctionButtonsBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addExpensesButton)
                    .addComponent(displayStatisticButton)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainChartPanelLayout = new javax.swing.GroupLayout(mainChartPanel);
        mainChartPanel.setLayout(mainChartPanelLayout);
        mainChartPanelLayout.setHorizontalGroup(
            mainChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(charFunctionButtonsBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainChartPanelLayout.createSequentialGroup()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainChartPanelLayout.setVerticalGroup(
            mainChartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainChartPanelLayout.createSequentialGroup()
                .addComponent(charFunctionButtonsBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );

        chartSectionScrollPane.setViewportView(mainChartPanel);

        javax.swing.GroupLayout chartSectionLayout = new javax.swing.GroupLayout(chartSection);
        chartSection.setLayout(chartSectionLayout);
        chartSectionLayout.setHorizontalGroup(
            chartSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chartSectionScrollPane)
        );
        chartSectionLayout.setVerticalGroup(
            chartSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chartSectionScrollPane)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chartSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantitySection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quantitySection, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chartSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addExpensesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExpensesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addExpensesButtonActionPerformed

    private void displayStatisticButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayStatisticButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayStatisticButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LivestreamComputerIcon;
    private javax.swing.JLabel VIPComputerIcon;
    private javax.swing.JButton addExpensesButton;
    private javax.swing.JPanel charFunctionButtonsBar;
    private com.cybergamems.view.components.chart.Chart chart;
    private javax.swing.JPanel chartSection;
    private javax.swing.JScrollPane chartSectionScrollPane;
    private javax.swing.JLabel clientIcon;
    private javax.swing.JPanel displayQuantityPanel;
    private javax.swing.JPanel displayQuantityPanel1;
    private javax.swing.JPanel displayQuantityPanel2;
    private javax.swing.JPanel displayQuantityPanel3;
    private javax.swing.JPanel displayQuantityPanel4;
    private javax.swing.JButton displayStatisticButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel mainChartPanel;
    private javax.swing.JLabel normalComputerIcon;
    private javax.swing.JLabel quantityHeaderLabel;
    private javax.swing.JLabel quantityHeaderLabel1;
    private javax.swing.JLabel quantityHeaderLabel2;
    private javax.swing.JLabel quantityHeaderLabel3;
    private javax.swing.JLabel quantityHeaderLabel4;
    private javax.swing.JLabel quantityInfoLabel;
    private javax.swing.JLabel quantityInfoLabel1;
    private javax.swing.JLabel quantityInfoLabel2;
    private javax.swing.JLabel quantityInfoLabel3;
    private javax.swing.JLabel quantityInfoLabel4;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel quantityOfClientPanel;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel quantityOfLivestreamComputerPanel;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel quantityOfNormalComputerPanel;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel quantityOfStaffPanel;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel quantityOfVIPComputerPanel;
    private javax.swing.JPanel quantitySection;
    private javax.swing.JLabel staffIcon;
    // End of variables declaration//GEN-END:variables
}
