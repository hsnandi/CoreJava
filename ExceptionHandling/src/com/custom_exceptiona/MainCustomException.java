package com.custom_exceptiona;

public class MainCustomException {

    public static void main(String[] args) {
        Student student = new Student();

        try {
            student.setID(0); // This will throw InvalidIDException
        } catch (InvalidIDException e) {
            System.out.println("Invalid ID Exception occurred: " + e.getMessage());
        }

        try {
            student.setName(" "); // This will throw InvalidNameException
        } catch (InvalidNameException e) {
            System.out.println("Invalid Name Exception occurred: " + e.getMessage());
        }

        System.out.println(student);
    }
}
