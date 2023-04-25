package com.javacourse.homework.task27_1;

import com.javacourse.homework.task27.NotValidPasswordException;

public class Main27_1 {
    public static void main(String[] args) throws NotValidpasswordException, NotValidLoginException{
        ValidationUtils_1 validationUtils_1 = new ValidationUtils_1();
        boolean valid = false;

        try{
            valid = validationUtils_1.isValid("jkjkh8980", "jkjk7878");
        }catch (NotValidLoginException e){
            System.out.println("логин не валидный");
        }catch (NotValidpasswordException e1){
            System.out.println("пароль не валидный");
        }
        if (valid){
            System.out.println("форма валидна");
        }else {
            System.out.println("форма не валидна");
        }
    }
}
