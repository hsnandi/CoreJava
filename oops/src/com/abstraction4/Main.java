package com.abstraction4;

public class Main {
    public static void main(String[] args) {
        SavingAcc savingAcc = new SavingAcc("Savings");
        savingAcc.deposit(5000);
        savingAcc.displayBalance();

        CurrentAcc currentAcc = new CurrentAcc("Current");
        currentAcc.deposit(10000);
        currentAcc.displayBalance();

        Bank bank1 = new SavingAcc("Savings"); 
        Bank bank2 = new CurrentAcc("Current");

        System.out.println(bank1);
        System.out.println(bank2);
    }
}
