package com.abstraction;

public class Main {
    public static void main(String[] args) {
        VegMenu vegMenu = new VegMenu();
        NonVegMenu nonVegMenu = new NonVegMenu();
        StartersMenu startersMenu = new StartersMenu();
        DesertMenu desertMenu = new DesertMenu();
        DrinkMenu drinkMenu = new DrinkMenu();

        vegMenu.showMenu();
        nonVegMenu.showMenu();
        startersMenu.showMenu();
        desertMenu.showMenu();
        drinkMenu.showMenu();
    }
}
