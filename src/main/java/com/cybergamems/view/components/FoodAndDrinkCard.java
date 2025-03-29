package com.cybergamems.view.components;

import com.cybergamems.view.forms.ServicesForm;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;

public class FoodAndDrinkCard extends javax.swing.JPanel {
    private FoodAndDrinkBillTable billTable;
    
    public FoodAndDrinkCard(FoodAndDrinkCardModel data, FoodAndDrinkBillTable billTable) {
        try {
            UIManager.setLookAndFeel(new FlatArcDarkOrangeIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Orange: " + e.getMessage());
        }
        this.billTable = billTable;
        initComponents();
        setOpaque(false);
        displayCardInfo(data);
        initButtonEvent();
        try {
            UIManager.setLookAndFeel(new FlatDarkFlatIJTheme());
        } catch (Exception e) {
            System.err.println("Không thể thiết lập theme Dark Flat: " + e.getMessage());
        }
    }
    
    private void initButtonEvent(){
        addProductButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int soLuong = (Integer) numberOfProductsSpinner.getValue();
                String tenDichVu = productNameLabel.getText();
                String loaiDichVu = productCategoryLabel.getText();
                double donGiaDichVu = Double.parseDouble(productPriceLabel.getText());
                
                System.out.println(soLuong);
                System.out.println(tenDichVu);
                System.out.println(loaiDichVu);
                System.out.println(donGiaDichVu);
                
                billTable.addFoodAndDrinkBill(tenDichVu, loaiDichVu, soLuong, donGiaDichVu);
                numberOfProductsSpinner.setValue(0);
            }
        });
    }
    
    private void displayCardInfo(FoodAndDrinkCardModel data){
        productNameLabel.setText(data.getProductName());
        productCategoryLabel.setText(data.getProductCategory()!=null?data.getProductCategory().toString():"");
        productPriceLabel.setText(data.getProductPrice()+"");
        loadImageIntoPanel(data.getProductImagePath());
    }
    
    private void loadImageIntoPanel(String imagePath) {
    imageCardSection.removeAll(); // Xóa các thành phần cũ
    try {
        ImageIcon originalIcon = new ImageIcon(getClass().getResource(imagePath)); 
        Image originalImage = originalIcon.getImage();

        // Resize ảnh để vừa với panel
        int panelWidth = imageCardSection.getWidth();
        int panelHeight = imageCardSection.getHeight();

        if (panelWidth == 0 || panelHeight == 0) {
            panelWidth = 200; // Giá trị mặc định nếu panel chưa render
            panelHeight = 117;
        }

        Image scaledImage = originalImage.getScaledInstance(panelWidth, panelHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Tạo JLabel chứa ảnh và thêm vào panel
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setVerticalAlignment(JLabel.CENTER);

        imageCardSection.setLayout(new BorderLayout()); // Căn giữa
        imageCardSection.add(imageLabel, BorderLayout.CENTER);

        imageCardSection.revalidate();
        imageCardSection.repaint();
    } catch (Exception e) {
        System.err.println("Lỗi tải ảnh!");
        e.printStackTrace();
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardMainPanel = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        imageCardSection = new com.cybergamems.view.panels.CustomizedBorderRadiusPanel();
        infoCardSection = new javax.swing.JPanel();
        productTitlePanel = new javax.swing.JPanel();
        productNameLabel = new javax.swing.JLabel();
        productCategoryLabel = new javax.swing.JLabel();
        productPriceLabel = new javax.swing.JLabel();
        addProductButton = new javax.swing.JButton();
        numberOfProductsSpinner = new javax.swing.JSpinner();

        setOpaque(false);

        cardMainPanel.setBackground(new java.awt.Color(50, 50, 50));

        imageCardSection.setMaximumSize(new java.awt.Dimension(200, 117));
        imageCardSection.setMinimumSize(new java.awt.Dimension(200, 117));
        imageCardSection.setPreferredSize(new java.awt.Dimension(200, 117));

        javax.swing.GroupLayout imageCardSectionLayout = new javax.swing.GroupLayout(imageCardSection);
        imageCardSection.setLayout(imageCardSectionLayout);
        imageCardSectionLayout.setHorizontalGroup(
            imageCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        imageCardSectionLayout.setVerticalGroup(
            imageCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );

        infoCardSection.setOpaque(false);

        productTitlePanel.setOpaque(false);

        productNameLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        productNameLabel.setText("FoodOrDrink Name");

        productCategoryLabel.setFont(new java.awt.Font("Roboto Lt", 0, 10)); // NOI18N
        productCategoryLabel.setText("category");
        productCategoryLabel.setToolTipText("");

        javax.swing.GroupLayout productTitlePanelLayout = new javax.swing.GroupLayout(productTitlePanel);
        productTitlePanel.setLayout(productTitlePanelLayout);
        productTitlePanelLayout.setHorizontalGroup(
            productTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productTitlePanelLayout.createSequentialGroup()
                .addGroup(productTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productNameLabel)
                    .addComponent(productCategoryLabel))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        productTitlePanelLayout.setVerticalGroup(
            productTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productTitlePanelLayout.createSequentialGroup()
                .addComponent(productNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(productCategoryLabel)
                .addContainerGap())
        );

        productPriceLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        productPriceLabel.setText("Price");

        addProductButton.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        addProductButton.setText("Add");

        numberOfProductsSpinner.setModel(new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1));

        javax.swing.GroupLayout infoCardSectionLayout = new javax.swing.GroupLayout(infoCardSection);
        infoCardSection.setLayout(infoCardSectionLayout);
        infoCardSectionLayout.setHorizontalGroup(
            infoCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoCardSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoCardSectionLayout.createSequentialGroup()
                        .addComponent(productTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(productPriceLabel))
                    .addGroup(infoCardSectionLayout.createSequentialGroup()
                        .addComponent(numberOfProductsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        infoCardSectionLayout.setVerticalGroup(
            infoCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoCardSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productPriceLabel)
                    .addComponent(productTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(infoCardSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfProductsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(imageCardSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JSpinner numberOfProductsSpinner;
    private javax.swing.JLabel productCategoryLabel;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JLabel productPriceLabel;
    private javax.swing.JPanel productTitlePanel;
    // End of variables declaration//GEN-END:variables
}
