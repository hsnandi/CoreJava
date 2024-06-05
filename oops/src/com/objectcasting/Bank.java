package com.objectcasting;

public class Bank {

    private long accNo;
    private String accType;

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void printAccountDetails() {
        System.out.println("Account number: " + accNo);
        System.out.println("Account type: " + accType);
    }
}
