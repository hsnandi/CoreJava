package com.abstraction;

import java.util.ArrayList;
import java.util.List;

public class VegMenu extends HotelMenu {
    private List<String> dishes;

    VegMenu() {
        dishes = new ArrayList<>();
        dishes.add("Paneer Tikka");
        dishes.add("Vegetable Biryani");
        dishes.add("Aloo Gobi");
        dishes.add("Palak Paneer");
        dishes.add("Masoor Dal");
    }

    @Override
  public  void showMenu() {
        System.out.println("Veg Menu:");
        for (String dish : dishes) {
            System.out.println(dish);
        }
    }
}
