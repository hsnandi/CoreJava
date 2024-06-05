package com.objectcasting;

public class RBI extends Bank {

    private String printEquipment;

    public String getPrintEquipment() {
        return printEquipment;
    }

    public void setPrintEquipment(String printEquipment) {
        this.printEquipment = printEquipment;
    }

    @Override
    public void printAccountDetails() {
        System.out.println("Account number: " + getAccNo());
        System.out.println("Account type: " + getAccType());
        System.out.println("Print Equipment: " + printEquipment);
    }

    @Override
    public String toString() {
        return "RBI";
    }
}
