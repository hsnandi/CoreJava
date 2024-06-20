package com.arithmetic_operation;

import java.util.Scanner;
import com.utility.ArithmeticUtilityImplementation;

public class App {

    public static void main(String[] args) {
        ArithmeticUtilityImplementation helper = new ArithmeticUtilityImplementation();
        int choice = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                choice = helper.printMenu(scanner);
                System.out.println(choice);

                switch (choice) {
                    case 1->helper.addition(scanner);
                    case 2->helper.subtraction(scanner);
                    case 3->helper.multiplication(scanner);
                    case 4->helper.division(scanner);
                    case 0 -> System.out.println("Exiting");
                    default->System.out.println("Invalid input");
                        
                }
            } while (choice != 0);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
