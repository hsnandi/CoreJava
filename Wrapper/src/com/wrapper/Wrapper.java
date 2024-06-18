package com.wrapper;

public class Wrapper {
    public static void main(String[] args) {
        Integer number = Integer.valueOf(10);  // Boxing (To wrap it)
        System.out.println(number);
        
        int tempVal = 20;
        Integer number1 = tempVal;  // Autoboxing
        System.out.println(number1);
        
        
        
        int tempVal1 = number.intValue();  // Unboxing
        System.out.println(tempVal1);
        
        tempVal = number;  // Auto unboxing
        
        Integer number2 = 10;
        Integer number3 = 20;
        
        add(number2, number3);
        
        Integer number4 = Integer.parseInt("123");
        float floatVal = number4.floatValue();
        System.out.println("Parsed Integer to float: " + floatVal);
        
        
        Long longVal = 868436136165l;
        float floatVal2 = longVal.floatValue();
        System.out.println("Long to float: " + floatVal2);
        
        
        //Boxing Example:
        
        int primitiveInt = 10;
        Integer wrapperInteger = primitiveInt; // Boxing
        System.out.println("Boxing - int to Integer: " + wrapperInteger);
        
        double primitiveDouble = 3.14;
        Double wrapperDouble = primitiveDouble; // Boxing
        System.out.println("Boxing - double to Double: " + wrapperDouble);
        
        
        //Unboxing
        Integer wrapperInteger1 = Integer.valueOf(20);
        int primitiveInt1 = wrapperInteger1; // Unboxing
        System.out.println("Unboxing - Integer to int: " + primitiveInt1);
        
        Double wrapperDouble2 = Double.valueOf(5.5);
        double primitiveDouble2 = wrapperDouble2; // Unboxing
        System.out.println("Unboxing - Double to double: " + primitiveDouble2);


        
        
    }
    
    public static void add(int number2, int number3) {
        System.out.println(number2 + number3);
    }
}
