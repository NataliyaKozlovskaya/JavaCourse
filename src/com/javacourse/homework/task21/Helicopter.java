package com.javacourse.homework.task21;

public abstract class Helicopter extends FlyingObject {

    public abstract void verticalTakeOff();

    public Helicopter() {
    }

    public Helicopter(String name, String country, String year) {
        super(name, country, year);
    }
}

