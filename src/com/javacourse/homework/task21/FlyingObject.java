package com.javacourse.homework.task21;

public abstract class FlyingObject {
    private String name;
    private String country;
    private String year;

    public FlyingObject() {
    }

    public FlyingObject(String name, String country, String year) {
        this.name = name;
        this.country = country;
        this.year = year;
    }

    public void info() {
        System.out.println(name + " " + country + " " + year);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
