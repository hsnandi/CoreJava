package com.abstraction2;

public class Addition extends ArithmeticOperation {
    @Override
    public void operation(int num1, int num2) {
        System.out.println("Addition: " + (num1 + num2));
    }
}
