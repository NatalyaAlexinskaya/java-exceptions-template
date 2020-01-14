package com.epam.izh.rd.online.exception;

public class NotCorrectPasswordException extends Exception {
    public NotCorrectPasswordException() {
    }

    public NotCorrectPasswordException(String s) {
    }

    public NotCorrectPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotCorrectPasswordException(Throwable cause) {
        super(cause);
    }
}
