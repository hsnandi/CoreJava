package com.objectcasting;

public class SBI extends Bank {

    @Override
    public void printAccountDetails() {
        System.out.println("Account number: " + getAccNo());
        System.out.println("Account type: " + getAccType());
    }
    
  
}
