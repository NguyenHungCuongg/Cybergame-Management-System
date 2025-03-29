package com.cybergamems.view.components;

import java.awt.FlowLayout;

public class FoodAndDrinkBar extends javax.swing.JPanel {
    private String type;
    private FoodAndDrinkBillTable billTable;
    
    public FoodAndDrinkBar() {
    };
    

    public FoodAndDrinkBar(String type,FoodAndDrinkBillTable billTable) {
        this.type = type;
        this.billTable = billTable;
        initComponents();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setOpaque(false);
        initData(this.type);
    }
    
    private void initData(String type){
        if(type.equals("Food")){
            this.addCard(new FoodAndDrinkCardModel("Mì xào bò",FoodAndDrinkCardModel.productCategories.FOOD,"/images/mi-xao-bo.png",25000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Mì xào trứng",FoodAndDrinkCardModel.productCategories.FOOD,"/images/mi-xao-trung.png",18000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Mì xào thập cẩm",FoodAndDrinkCardModel.productCategories.FOOD,"/images/mi-xao-thap-cam.png",30000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Mì nước bò",FoodAndDrinkCardModel.productCategories.FOOD,"/images/mi-nuoc-bo.png",25000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Mì nước trứng",FoodAndDrinkCardModel.productCategories.FOOD,"/images/mi-nuoc-trung.png",18000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Mì nước thập cẩm",FoodAndDrinkCardModel.productCategories.FOOD,"/images/mi-nuoc-thap-cam.png",30000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Burger bò phô mai",FoodAndDrinkCardModel.productCategories.FOOD,"/images/burger-bo-pho-mai.png",30000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Burger gà phô mai",FoodAndDrinkCardModel.productCategories.FOOD,"/images/burger-ga-pho-mai.png",30000),billTable);
        }
        else{
            this.addCard(new FoodAndDrinkCardModel("Pepsi",FoodAndDrinkCardModel.productCategories.DRINK,"/images/pepsi.png",10000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Coca Cola",FoodAndDrinkCardModel.productCategories.DRINK,"/images/coca-cola.png",10000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Fanta",FoodAndDrinkCardModel.productCategories.DRINK,"/images/fanta.png",10000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Sting dâu",FoodAndDrinkCardModel.productCategories.DRINK,"/images/sting-dau.png",10000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Xá xị",FoodAndDrinkCardModel.productCategories.DRINK,"/images/xa-xi.png",10000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Cà phê đen",FoodAndDrinkCardModel.productCategories.DRINK,"/images/ca-phe-den.png",15000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Cà phê sữa",FoodAndDrinkCardModel.productCategories.DRINK,"/images/ca-phe-sua.png",18000),billTable);
            this.addCard(new FoodAndDrinkCardModel("Cà phê muối",FoodAndDrinkCardModel.productCategories.DRINK,"/images/ca-phe-muoi.png",20000),billTable);
        }
    }
    
    private void addCard(FoodAndDrinkCardModel data,FoodAndDrinkBillTable billTable){
        add(new FoodAndDrinkCard(data,billTable));
        revalidate();
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setFocusable(false);
        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
