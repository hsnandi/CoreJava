package com.exception_handling;

//Throws error are used in main method. THrows allow us to throw multiple exceptions
public class Throws {
	public static void main(String[] args) {
		division(10, 0);
	}

	public static void division(int number1, int number2) throws RuntimeException {
//There are various type of exception such as 'RuntimeException' , 'ArithmeticException', 'Exception'.. and each of them would give different exception/errors.
		System.out.println(number1 / number2);
	}
}
