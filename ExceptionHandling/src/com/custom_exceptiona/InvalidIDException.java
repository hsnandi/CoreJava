package com.custom_exceptiona;

public class InvalidIDException extends RuntimeException {

    public InvalidIDException(String message) {
        super(message);
    }
}
