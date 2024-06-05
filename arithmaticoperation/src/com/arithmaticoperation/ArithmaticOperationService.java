package com.arithmaticoperation;

public class ArithmaticOperationService {
    public void performOperations(double operand1, double operand2) {
        ArithmaticOperation operation = new ArithmaticOperation(operand1, operand2);
        
        System.out.println("Addition: " + operation.add());
        System.out.println("Subtraction: " + operation.subtract());
        System.out.println("Multiplication: " + operation.multiply());
        System.out.println("Division: " + operation.divide());
    }
}
