package com.abstraction4;

public class CurrentAcc extends Bank {
    private int deposits;

    public CurrentAcc(String accType) {
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
        System.out.println("Current Account Balance: " + deposits);
    }

    @Override
    public int accountDetails() {
        return deposits;
    }

    @Override
    public String toString() {
        return "CurrentAcc [accType=" + getAccType() + ", deposits=" + deposits + "]";
    }
}
