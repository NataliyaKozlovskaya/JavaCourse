package com.javacourse.homework.task27_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtils_1 {
   private static final Pattern PATTERN = Pattern.compile("(?=.*[0-9])");


    public boolean isValid(String login, String password) throws NotValidLoginException, NotValidpasswordException {
        if (login.length() >= 3 && login.length() < 20){
        } else{
            throw new NotValidLoginException("кидаем исключение по логину");
        }
        Matcher matcher = PATTERN.matcher(password);
        if (password.length() >= 6 && matcher.find()){
        } else{
            throw new NotValidpasswordException("кидаем исключение по паролю");
        }
        return false;
    }
}
