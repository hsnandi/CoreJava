package com.abstraction4;

public class SavingAcc extends Bank {
    private int deposits;

    public SavingAcc(String accType) {
        super(accType);
        deposits = 0;
    }

    public void deposit(int amount) {
        deposits += amount;
    }

    public void withdraw(int amount) {
        if (amount <= deposits) {
            deposits -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void displayBalance() {
        System.out.println("Savings Account Balance: " + deposits);
    }

    @Override
    public int accountDetails() {
        return deposits;
    }

    @Override
    public String toString() {
        return "SavingAcc [accType=" + getAccType() + ", deposits=" + deposits + "]";
    }
}
