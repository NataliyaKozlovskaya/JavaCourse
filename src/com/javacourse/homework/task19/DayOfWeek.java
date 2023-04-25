package com.javacourse.homework.task19;

public enum DayOfWeek {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);
    private boolean isDayOff;

    DayOfWeek(boolean isDayOff) {
        this.isDayOff = isDayOff;
    }

    public String getInfo(){
        return isDayOff ? "Выходной день" : "Рабочий день";
    }

//    public boolean isDayOff() {
//        return isDayOff;
//    }
}






