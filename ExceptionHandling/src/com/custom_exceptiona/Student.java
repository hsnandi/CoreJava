package com.custom_exceptiona;

import java.io.Serializable;

public class Student implements Serializable {
    private int ID;
    private String Name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID <= 0) {
            throw new InvalidIDException("ID should be greater than 0");
        }
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) throws InvalidNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException("Name cannot be null or empty");
        }
        this.Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                '}';
    }
}
