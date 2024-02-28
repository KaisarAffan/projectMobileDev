package com.example.appschool1;

public class Item {
    private String name;
    private String price;
    private int image;

    public Item(String name, String price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public int getImage() { return image; }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
