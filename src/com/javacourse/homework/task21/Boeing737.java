package com.javacourse.homework.task21;

public class Boeing737 extends Aircraft {
    @Override
    public void releaseChassis() {
        System.out.println("Выпустить шасси Boeing737");

    }

    public Boeing737() {
    }

    public Boeing737(String name, String country, String year, Integer wingspan) {
        super(name, country, year, wingspan);
    }

    public Boeing737(String name, String country, String year) {
        super(name, country, year);
    }
}
