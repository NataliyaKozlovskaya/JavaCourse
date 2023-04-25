package com.javacourse.homework.task21;

public class Airbus330 extends Aircraft {



    public Airbus330(String name, String country, String year, Integer wingspan) {
        super(name, country, year, wingspan);
    }

    public Airbus330(String name, String country, String year) {
        super(name, country, year);
    }

    public Airbus330() {
    }
    @Override
    public void releaseChassis() {
        System.out.println("Выпустить шасси Airbus330");
    }

}
