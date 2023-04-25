package com.javacourse.homework.task27;

public class NotValidPasswordException extends Exception{

    public NotValidPasswordException() {
    }

    public NotValidPasswordException(String message) {
        super(message);
    }

    public NotValidPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotValidPasswordException(Throwable cause) {
        super(cause);
    }

    public NotValidPasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
