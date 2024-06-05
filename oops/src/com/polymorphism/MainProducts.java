package com.polymorphism;

public class MainProducts {

    public static void main(String[] args) {
        Products products = new Products();
        Electronics charger = new Electronics();
        Foods milk = new Foods();

        charger.setBrand("OnePlus");
        charger.setPrice(1000.4F);
        charger.setBattery(false);
        charger.setWireless(false);

        milk.setBrand("Gokul");
        milk.setPrice(30.15f);
        milk.setExpiryDate("07.05.2024");
        milk.setVeg(true);

        System.out.println(products);
    }
}


//Assignment: 2-3 class..superclass,child class, use up cast for override.