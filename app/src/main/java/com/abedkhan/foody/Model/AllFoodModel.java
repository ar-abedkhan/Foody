package com.abedkhan.foody.Model;

public class AllFoodModel {
    String foodName,resturentName,price;
    int image;


    public AllFoodModel(String foodName, String resturentName, String price, int image) {
        this.foodName = foodName;
        this.resturentName = resturentName;
        this.price = price;
        this.image = image;
    }

    public AllFoodModel(){

    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getResturentName() {
        return resturentName;
    }

    public void setResturentName(String resturentName) {
        this.resturentName = resturentName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
