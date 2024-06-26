package com.polymorphism;

public class Products {
    private String brand;
    private float price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products [brand=" + brand + ", price=" + price + "]";
    }
}