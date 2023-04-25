package com.javacourse.homework.task21;

public abstract class Drone extends FlyingObject {
    public Drone() {
    }

    public Drone(String name, String country, String year) {
        super(name, country, year);
    }

    public abstract void reconnaissance();

}
