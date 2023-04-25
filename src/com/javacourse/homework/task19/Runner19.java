package com.javacourse.homework.task19;


public class Runner19 {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.WEDNESDAY;
        switch (dayOfWeek) {
            case SUNDAY:
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
                System.out.println(dayOfWeek.getInfo());
//                print(dayOfWeek.isDayOff());
                break;
            }
    }
    public static void print(boolean isDayOff) {
        if (isDayOff) {
            System.out.println("выходной");
        } else {
            System.out.println("рабочий день");
        }
    }

}