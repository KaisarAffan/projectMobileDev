package com.example.appschool1;

public class Item {
    private String name;
    private String price;
    private String image;

    public Item(String name, String price, String image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getImage() { return image; }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
