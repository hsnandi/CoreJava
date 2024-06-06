package com.abstraction;

import java.util.ArrayList;
import java.util.List;

public class DrinkMenu extends HotelMenu {
	private List<String> drinks;

	DrinkMenu() {
		drinks = new ArrayList<>();
		drinks.add("Mango Lassi");
		drinks.add("Masala Chai");
		drinks.add("Sugarcane Juice");
		drinks.add("Coconut Water");
		drinks.add("Thandai");
	}

	@Override
public	void showMenu() {
		System.out.println("Drink Menu:");
		for (String drink : drinks) {
			System.out.println(drink);
		}
	}
}
