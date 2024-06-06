package com.abstraction;

import java.util.ArrayList;
import java.util.List;

public class StartersMenu extends HotelMenu {
    private List<String> dishes;

    StartersMenu() {
        dishes = new ArrayList<>();
        dishes.add("Vada Pav");
        dishes.add("Pani Puri");
        dishes.add("Bhel Puri");
        dishes.add("Sev Puri");
        dishes.add("Misal Pav");
    }

    @Override
 public   void showMenu() {
        System.out.println("Starters Menu:");
        for (String dish : dishes) {
            System.out.println(dish);
        }
    }
}
