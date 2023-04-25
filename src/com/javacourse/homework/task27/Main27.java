package com.javacourse.homework.task27;

public class Main27 {
    public static void main(String[] args) throws NotValidPasswordException, NotValidLoginException {
        ValidationUtils validationUtils = new ValidationUtils();
        boolean valid = false;
        //valid = validationUtils.isValid("hjhjhhb", "jjhjhgh");

        try {
            valid = validationUtils.isValid("hjhj124hhb", "jj794hjhgh");
        }catch(NotValidLoginException e) {
            //log.error(e);
            System.out.println("пароль не валидный");
        }catch(NotValidPasswordException e1) {
            System.out.println("логин не валидный");
        }
        if (valid) {
            System.out.println("Форма валидна");
        }else {
            System.out.println("Форма не валидна");
        }
    }
}
