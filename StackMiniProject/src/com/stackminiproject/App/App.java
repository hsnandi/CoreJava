package com.stackminiproject.App;

import com.stackminiproject.mobileutility.MobileUtility;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MobileUtility utility = new MobileUtility();
		utility.setSize(scanner);
		utility.printAllMobiles();
		int choice=0;
		
		do {
			choice = utility.printMenu(scanner);
			switch (choice) {
			case 1:
				System.out.println("Add Entry : ");
				break;
			case 2:
				System.out.println("Update Entry : ");
				break;
			case 3:
				System.out.println("Delete Entry : ");
				break;
			case 4:
				System.out.println("Print Entry : ");
				break;
			case 5:
				System.out.println("Print All Entry : ");
				break;
			case 0:
				System.out.println("Bye ");
				break;
			default:
				System.out.println("Invalid Entry ");
				break;
			}
		} while (choice != 0);
	}
}

// presentation layer,business layer & out layer for Database