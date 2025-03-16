package com.cybergamems.view.components;

import java.awt.FlowLayout;

public class FoodAndDrinkBar extends javax.swing.JPanel {
    private String type;
    
    public FoodAndDrinkBar() {
    };
    

    public FoodAndDrinkBar(String type) {
        this.type = type;
        initComponents();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setOpaque(false);
        initData(this.type);
    }
    
    private void initData(String type){
        if(type.equals("Food")){
            this.addCard(new FoodAndDrinkCardModel("Mì xào bò",FoodAndDrinkCardModel.productCategories.FOOD,"",25000));
            this.addCard(new FoodAndDrinkCardModel("Mì xào trứng",FoodAndDrinkCardModel.productCategories.FOOD,"",18000));
            this.addCard(new FoodAndDrinkCardModel("Mì xào thập cẩm",FoodAndDrinkCardModel.productCategories.FOOD,"",30000));
            this.addCard(new FoodAndDrinkCardModel("Mì nước bò",FoodAndDrinkCardModel.productCategories.FOOD,"",25000));
            this.addCard(new FoodAndDrinkCardModel("Mì nước trứng",FoodAndDrinkCardModel.productCategories.FOOD,"",18000));
            this.addCard(new FoodAndDrinkCardModel("Mì nước thập cẩm",FoodAndDrinkCardModel.productCategories.FOOD,"",20000));
            this.addCard(new FoodAndDrinkCardModel("Burger bò phô mai",FoodAndDrinkCardModel.productCategories.FOOD,"",30000));
            this.addCard(new FoodAndDrinkCardModel("Burger gà phô mai",FoodAndDrinkCardModel.productCategories.FOOD,"",30000));
        }
        else{
            this.addCard(new FoodAndDrinkCardModel("Pepsi",FoodAndDrinkCardModel.productCategories.DRINK,"",10000));
            this.addCard(new FoodAndDrinkCardModel("Coca Cola",FoodAndDrinkCardModel.productCategories.DRINK,"",10000));
            this.addCard(new FoodAndDrinkCardModel("Fanta",FoodAndDrinkCardModel.productCategories.DRINK,"",10000));
            this.addCard(new FoodAndDrinkCardModel("Sting dâu",FoodAndDrinkCardModel.productCategories.DRINK,"",10000));
            this.addCard(new FoodAndDrinkCardModel("Xá xị",FoodAndDrinkCardModel.productCategories.DRINK,"",10000));
            this.addCard(new FoodAndDrinkCardModel("Cà phê đen",FoodAndDrinkCardModel.productCategories.DRINK,"",15000));
            this.addCard(new FoodAndDrinkCardModel("Cà phê sữa",FoodAndDrinkCardModel.productCategories.DRINK,"",18000));
            this.addCard(new FoodAndDrinkCardModel("Cà phê muối",FoodAndDrinkCardModel.productCategories.DRINK,"",20000));
        }
    }
    
    private void addCard(FoodAndDrinkCardModel data){
        add(new FoodAndDrinkCard(data));
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
