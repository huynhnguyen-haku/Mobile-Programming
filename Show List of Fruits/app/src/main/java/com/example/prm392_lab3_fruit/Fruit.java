package com.example.prm392_lab3_fruit;

public class Fruit {

    private String Name;
    private String Description;
    private int FruitImg;

    public Fruit(String name, String description, int fruitImg) {
        Name = name;
        Description = description;
        FruitImg = fruitImg;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getFruitImg() {
        return FruitImg;
    }

    public void setFruitImg(int fruitImg) {
        FruitImg = fruitImg;
    }
}
