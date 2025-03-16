package com.cybergamems.view.components;

public class FoodAndDrinkCardModel {
    
    public static enum productCategories{
        DRINK, FOOD
    }
    
    private String productName;
    private productCategories productCategory;
    private String productImagePath;
    private int productPrice;
    
    //Constructor
    public FoodAndDrinkCardModel(){
    }

    public FoodAndDrinkCardModel(String productName, productCategories productCategory, String productImagePath, int productPrice) {
        this.productName = productName;
        this.productCategory = productCategory;
        this.productImagePath = productImagePath;
        this.productPrice = productPrice;
    }
    
    //Getter
    public String getProductName() {
        return productName;
    }

    public productCategories getProductCategory() {    
        return productCategory;
    }

    public String getProductImagePath() {
        return productImagePath;
    }

    public int getProductPrice() {
        return productPrice;
    }

    //Setter
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductCategory(productCategories productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductImagePath(String productImagePath) {
        this.productImagePath = productImagePath;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }   
}
