package com.cybergamems.view.components;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import javax.swing.UIManager;

public class FoodAndDrinkCard extends javax.swing.JPanel {
    public FoodAndDrinkCard(FoodAndDrinkCardModel data) {
        try {
            UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Orange: " + e.getMessage());
        }
        initComponents();
        setOpaque(false);
        productName.setText(data.getProductName());
        productCategory.setText(data.getProductCategory()!=null?data.getProductCategory().toString():"");
        productPrice.setText(data.getProductPrice()+"");
        try {
            UIManager.setLookAndFeel(new FlatDarkFlatIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Flat: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardMainPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        imageCardSection = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        infoCardSection = new javax.swing.JPanel();
        productTitlePanel = new javax.swing.JPanel();
        productName = new javax.swing.JLabel();
        productCategory = new javax.swing.JLabel();
        productPrice = new javax.swing.JLabel();
        addProductButton = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();

        setOpaque(false);

        cardMainPanel.setBackground(new java.awt.Color(50, 50, 50));

        javax.swing.GroupLayout imageCardSectionLayout = new javax.swing.GroupLayout(imageCardSection);
        imageCardSection.setLayout(imageCardSectionLayout);
        imageCardSectionLayout.setHorizontalGroup(
            imageCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imageCardSectionLayout.setVerticalGroup(
            imageCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        infoCardSection.setOpaque(false);

        productTitlePanel.setOpaque(false);

        productName.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        productName.setText("FoodOrDrink Name");

        productCategory.setFont(new java.awt.Font("Roboto Lt", 0, 10)); // NOI18N
        productCategory.setText("category");
        productCategory.setToolTipText("");

        javax.swing.GroupLayout productTitlePanelLayout = new javax.swing.GroupLayout(productTitlePanel);
        productTitlePanel.setLayout(productTitlePanelLayout);
        productTitlePanelLayout.setHorizontalGroup(
            productTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productTitlePanelLayout.createSequentialGroup()
                .addGroup(productTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productName)
                    .addComponent(productCategory))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        productTitlePanelLayout.setVerticalGroup(
            productTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productTitlePanelLayout.createSequentialGroup()
                .addComponent(productName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(productCategory)
                .addContainerGap())
        );

        productPrice.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        productPrice.setText("Price");

        addProductButton.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        addProductButton.setText("Add");

        javax.swing.GroupLayout infoCardSectionLayout = new javax.swing.GroupLayout(infoCardSection);
        infoCardSection.setLayout(infoCardSectionLayout);
        infoCardSectionLayout.setHorizontalGroup(
            infoCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoCardSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoCardSectionLayout.createSequentialGroup()
                        .addComponent(productTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(productPrice))
                    .addGroup(infoCardSectionLayout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        infoCardSectionLayout.setVerticalGroup(
            infoCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoCardSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productPrice)
                    .addComponent(productTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(infoCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProductButton)))
        );

        javax.swing.GroupLayout cardMainPanelLayout = new javax.swing.GroupLayout(cardMainPanel);
        cardMainPanel.setLayout(cardMainPanelLayout);
        cardMainPanelLayout.setHorizontalGroup(
            cardMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(infoCardSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imageCardSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardMainPanelLayout.setVerticalGroup(
            cardMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageCardSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoCardSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductButton;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel cardMainPanel;
    private com.cybergamems.view.panels.CustomizedBorderRadiusPanel imageCardSection;
    private javax.swing.JPanel infoCardSection;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel productCategory;
    private javax.swing.JLabel productName;
    private javax.swing.JLabel productPrice;
    private javax.swing.JPanel productTitlePanel;
    // End of variables declaration//GEN-END:variables
}
