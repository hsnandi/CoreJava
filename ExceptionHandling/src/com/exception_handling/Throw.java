
package com.exception_handling;

//Throw are used for manually, throwing errors.
public class Throw {
    public static void main(String[] args) {
        division(10, 0);
    }

    public static void division(int number1, int number2){ 
        if (number2 == 0)
            throw new ArithmeticException("Cannot divide by 0.");  //Handling exception with 'throw', along with a custom message. Arithmetic Exceptions are RUNTIME EXCEPTION.
    }
}

