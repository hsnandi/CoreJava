package com.abstraction2;

public class Multiplication extends ArithmeticOperation {
    @Override
    public void operation(int num1, int num2) {
        System.out.println("Multiplication: " + (num1 * num2));
    }
}
