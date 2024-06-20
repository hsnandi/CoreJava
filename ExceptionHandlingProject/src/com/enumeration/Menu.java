package com.enumeration;

public enum Menu {

    ADD(1, "Add two numbers"),
    SUBTRACTION(2, "Subtract two numbers"),
    MULTIPLY(3, "Multiply two numbers"),
    DIVIDE(4, "Divide two numbers");

    private String info;
    private int srNo;

    Menu(int srNo, String info) {
        this.srNo = srNo;
        this.info = info;
    }

    public int getSrNo() {
        return srNo;
    }

    public String getInfo() {
        return info;
    }
}
