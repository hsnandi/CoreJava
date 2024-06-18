package com.exception_handling;

import java.util.Arrays;
import java.util.stream.IntStream;


public class TryCatch {
	public static void main(String[] args) {

		// 'Try and Catch' method is one way to handle exception.
		try {
			int number = 10 / 0; // Error: Arithmetic exception, since no number cannot be divided by 0.
			System.out.println(number);
		} catch (ArithmeticException e) {    //Arithmetic Exceptions are RUNTIME EXCEPTION.
			System.out.println(e);
		}

		System.out.println("Hello World"); // This would be printed in console without any error tab, because of  exception handling.
											

		//Example 2
		
		try {
			division(10, 0);
		} catch (ArithmeticException ex) {
			System.out.println(ex);
			System.out.println("Error: Division by zero");

		}
	}

	public static void division(int number1, int number2) {
		System.out.println(number1 / number2); 
	}
	
	
	//Example 3
	int[] intArray = {1, 2};
    IntStream intStream = null; 
    {
    
    try {
        intStream = Arrays.stream(intArray); 
        intStream.sorted().forEach(System.out::println);
    } catch (Exception e) {
        System.out.println(e);
    } finally {
        if (intStream != null) {
            intStream.close();
        }
    }
}
}
	
	
	
	
	
	
