package com.objectcasting;

public class MainRBIBank {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.setAccType("Saving");

        RBI rBI = new RBI();
        rBI.setAccNo(123456);
        rBI.setAccType("Current");
        rBI.setPrintEquipment("500");

        bank.printAccountDetails();
        rBI.printAccountDetails();

        // Down Cast
        RBI rBI1 = (RBI) bank;
        rBI.setAccNo(123);
        rBI.setAccType("Saving");
        rBI.setPrintEquipment("100");
        
        SBI sBI = new SBI();
        sBI.setAccNo(654321);
        rBI.setAccType("Current");
        rBI.setPrintEquipment("999");
        
    }
    
       //Up Cast
       Bank bank = new RBI();
}

