package com.abstraction;

import java.util.ArrayList;
import java.util.List;

public class NonVegMenu extends HotelMenu {
    private List<String> dishes;

    NonVegMenu() {
        dishes = new ArrayList<>();
        dishes.add("Chicken Tikka");
        dishes.add("Mutton Biryani");
        dishes.add("Fish Curry");
        dishes.add("Butter Chicken");
        dishes.add("Egg Curry");
    }

    @Override
public void showMenu() {
        System.out.println("Non-Veg Menu:");
        for (String dish : dishes) {
            System.out.println(dish);
        }
    }
}
