package com.javacourse.homework.task16;

public class Transmission {
    String gear = "P";
    public void turnOnGear(String gear) {
        switch (gear) {
            case ("D"):
                System.out.println("Включаю драйв");
                gear = "D";
                break;
            case ("P"):
                System.out.println("Включаю ручник");
                gear = "P";
                break;
        }
    }
}
