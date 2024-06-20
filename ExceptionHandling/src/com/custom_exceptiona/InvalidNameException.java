package com.custom_exceptiona;

public class InvalidNameException extends Exception {

    public InvalidNameException() {
        super();
    }

    public InvalidNameException(String message) {
        super(message);
    }
}
