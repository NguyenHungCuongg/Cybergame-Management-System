package com.cybergamems.view.components;

import java.awt.*;
import javax.swing.*;

public class FoodAndDrinkList extends JPanel {

    //Constructor
    public FoodAndDrinkList() {
       setLayout(new FlowLayout(FlowLayout.LEFT));
       initData();
    }
    
    private void initData(){
        addCard(new FoodAndDrinkCardModel("Mì xào bò",FoodAndDrinkCardModel.productCategories.FOOD,"",25000));
        addCard(new FoodAndDrinkCardModel("Mì xào trứng",FoodAndDrinkCardModel.productCategories.FOOD,"",18000));
        addCard(new FoodAndDrinkCardModel("Mì xào thập cẩm",FoodAndDrinkCardModel.productCategories.FOOD,"",30000));
        addCard(new FoodAndDrinkCardModel("Mì nước bò",FoodAndDrinkCardModel.productCategories.FOOD,"",25000));
        addCard(new FoodAndDrinkCardModel("Mì nước trứng",FoodAndDrinkCardModel.productCategories.FOOD,"",18000));
        addCard(new FoodAndDrinkCardModel("Mì nước thập cẩm",FoodAndDrinkCardModel.productCategories.FOOD,"",20000));
        addCard(new FoodAndDrinkCardModel("Burger bò phô mai",FoodAndDrinkCardModel.productCategories.FOOD,"",30000));
        addCard(new FoodAndDrinkCardModel("Burger gà phô mai",FoodAndDrinkCardModel.productCategories.FOOD,"",30000));
    }
    
    //Methods
    private void addCard(FoodAndDrinkCardModel data){
        add(new FoodAndDrinkCard(data));
        revalidate();
        repaint();
    }
}
