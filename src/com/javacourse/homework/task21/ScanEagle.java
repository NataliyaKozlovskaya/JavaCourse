package com.javacourse.homework.task21;

public class ScanEagle extends Drone {
    public ScanEagle() {
    }

    public ScanEagle(String name, String country, String year) {
        super(name, country, year);
    }

    @Override
    public void reconnaissance(){
            System.out.println("разведка местности ScanEagle");

    }
}
