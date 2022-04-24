package com.bilgeadam;

public class Product {
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
