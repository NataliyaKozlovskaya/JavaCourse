package com.javacourse.homework.task21;

public abstract class Aircraft extends FlyingObject {
    private Integer wingspan;

    public abstract void releaseChassis();
    public Aircraft() {
    }

    public Aircraft(String name, String country, String year, Integer wingspan) {
        super(name, country, year);
        this.wingspan = wingspan;
    }

    public Aircraft(String name, String country, String year) {
        super(name, country, year);
    }

    public Integer getWingspan() {
        return wingspan;
    }

    public void setWingspan(Integer wingspan) {
        this.wingspan = wingspan;
    }

}

