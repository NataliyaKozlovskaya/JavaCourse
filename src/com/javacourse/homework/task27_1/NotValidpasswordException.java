package com.javacourse.homework.task27_1;

public class NotValidpasswordException extends Exception {
    public NotValidpasswordException() {
    }

    public NotValidpasswordException(String message) {
        super(message);
    }

    public NotValidpasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotValidpasswordException(Throwable cause) {
        super(cause);
    }

    public NotValidpasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
