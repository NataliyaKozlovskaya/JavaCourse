package com.javacourse.homework.task27_1;

public class NotValidLoginException extends Exception {

    public NotValidLoginException() {
    }

    public NotValidLoginException(String message) {
        super(message);
    }

    public NotValidLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotValidLoginException(Throwable cause) {
        super(cause);
    }

    public NotValidLoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
