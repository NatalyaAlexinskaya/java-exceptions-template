package com.epam.izh.rd.online.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
    }

    public UserNotFoundException(String s) {
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(Throwable cause) {
        super(cause);
    }
}
