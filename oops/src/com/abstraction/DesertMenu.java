package com.abstraction;

import java.util.ArrayList;
import java.util.List;

public class DesertMenu extends HotelMenu {
    private List<String> dishes;

    DesertMenu() {
        dishes = new ArrayList<>();
        dishes.add("Gulab Jamun");
        dishes.add("Rasgulla");
        dishes.add("Kulfi");
        dishes.add("Shrikhand");
        dishes.add("Jalebi");
    }

    @Override
   public void showMenu() {
        System.out.println("Dessert Menu:");
        for (String dish : dishes) {
            System.out.println(dish);
        }
    }
}
