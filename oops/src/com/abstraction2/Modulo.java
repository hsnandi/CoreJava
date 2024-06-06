package com.abstraction2;

public class Modulo extends ArithmeticOperation {
    @Override
    public void operation(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("Modulo: " + (num1 % num2));
        } else {
            System.out.println("Cannot calculate modulo by zero");
        }
    }
}
