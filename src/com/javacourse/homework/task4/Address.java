package com.javacourse.homework.task4;

public class Address {
    String country;
    String city;
    String addressLine;

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", addressLine='" + addressLine + '\'' +
                '}';
    }
}
