package com.javacourse.homework.task27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtils {
    private static final Pattern PATTERN = Pattern.compile("(?=.*[0-9])");

    public boolean isValid(String login, String password) throws NotValidLoginException, NotValidPasswordException {
        if (login.length() >= 3 && login.length() <= 20) {
        } else {
            throw new NotValidLoginException("NotValidLoginException");
        }

        Matcher matcher = PATTERN.matcher(password);
        if (password.length() >= 6 && matcher.find()) {
        } else {
            throw new NotValidPasswordException("NotValidPasswordException");
        }
        return false;
    }
}







