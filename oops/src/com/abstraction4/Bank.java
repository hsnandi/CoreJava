package com.abstraction4;

public abstract class Bank {
    private String accType;

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public Bank(String accType) {
        this.accType = accType;
    }

    public abstract int accountDetails();

    @Override
    public String toString() {
        return "Bank [accType=" + accType + "]";
    }
}
