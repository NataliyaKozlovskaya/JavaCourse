package com.javacourse.homework.task10;

public class Runner10 {
    public static void main(String[] args) {
        String arg = args[0];
        int i = Integer.parseInt(arg);
        mySwitch(i);
    }
    private static void mySwitch(int i) {
        switch (i){
            case (1):
                System.out.println("Январь");
            case(2):
                System.out.println("Февраль");
                break;
            case (3):
                System.out.println("Март");
            case (4):
                System.out.println("Декабрь");
                mySwitch(1);

        }
    }
}
