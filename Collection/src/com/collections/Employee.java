package com.collections;

public class Employee {

    private int ID;
    private String Name;

    public Employee(int iD, String name) {
        this.ID = iD;
        this.Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        this.ID = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + ID + ", Name=" + Name + "]";
    }
}
