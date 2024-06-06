package com.abstraction2;

public class Addition extends ArithmeticOperation {
    @Override
    public void operation(int num1, int num2) {
        System.out.println("Addition: " + (num1 + num2));
    }
 /* invoke constructor of abstract class. In projecy this can be used only once.
    ArithmeticOperation substraction = new ArithmeticOperation() {
    	@Override
    	public int operation(int number1, number2)
    	return number1-number2;
    }
    
    ArithmeticOperation addition = new ArithmeticOperation() {
    	@Override
    	public int operation(int number1, number2)
    	return number1+number2;
    }
    
    ArithmeticOperation multiplication  = new ArithmeticOperation() {
    	@Override
    	public int operation(int number1, number2)
    	return number1*number2;
    }
    
    ArithmeticOperation division = new ArithmeticOperation() {
    	@Override
    	public int operation(int number1, number2)
    	return number1/number2;
    }
    */
    
}



