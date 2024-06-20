package com.utility;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.arithmetic_operation.ArithmeticUtilityInterface;
import com.enumeration.Menu;

public class ArithmeticUtilityImplementation implements ArithmeticUtilityInterface {

    public int printMenu(Scanner scanner) {
        int choice = 0;

        for (Menu menu : Menu.values()) {
            System.out.println(menu.getSrNo() + ". " + menu.name() + " (" + menu.getInfo() + ")");
        }

        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
            choice = printMenu(scanner);
        }

        return choice;
    }

    public void addition(Scanner scanner) {
        System.out.println("Enter two numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 + number2;
        System.out.println("Result: " + result);
    }

    public void subtraction(Scanner scanner) {
        System.out.println("Enter two numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 - number2;
        System.out.println("Result: " + result);
    }

    public void multiplication(Scanner scanner) {
        System.out.println("Enter two numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 * number2;
        System.out.println("Result: " + result);
    }

    public void division(Scanner scanner) {
        System.out.println("Enter two numbers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number2 != 0) {
            double result = (double) number1 / number2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
