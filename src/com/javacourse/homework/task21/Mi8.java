package com.javacourse.homework.task21;

public class Mi8 extends Helicopter {
    @Override
    public void verticalTakeOff() {
        System.out.println("вертикальный взлет Mi8");
    }

    public Mi8() {
    }

    public Mi8(String name, String country, String year) {
        super(name, country, year);
    }
}
