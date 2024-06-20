package com.arithmetic_operation;

import java.util.Scanner;

public interface ArithmeticUtilityInterface {

    int printMenu(Scanner scanner) throws Exception;

    void addition(Scanner scanner); 
    void subtraction(Scanner scanner);
    void multiplication(Scanner scanner);
    void division(Scanner scanner);
}
