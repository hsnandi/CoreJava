package com.abstraction2;

public class Subtraction extends ArithmeticOperation {
    @Override
    public void operation(int num1, int num2) {
        System.out.println("Subtraction: " + (num1 - num2));
    }
}
