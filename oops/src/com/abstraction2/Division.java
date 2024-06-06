package com.abstraction2;

public class Division extends ArithmeticOperation {
    @Override
    public void operation(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}
