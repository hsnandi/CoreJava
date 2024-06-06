package com.abstraction2;

public class Main {
    public static void main(String[] args) {
        ArithmeticOperation addition = new Addition();
        addition.operation(5, 3);

        ArithmeticOperation subtraction = new Subtraction();
        subtraction.operation(8, 2);

        ArithmeticOperation multiplication = new Multiplication();
        multiplication.operation(4, 6);

        ArithmeticOperation division = new Division();
        division.operation(9, 3);

        ArithmeticOperation modulo = new Modulo();
        modulo.operation(10, 3);
    }
}
