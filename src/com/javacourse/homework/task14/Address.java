package com.javacourse.homework.task14;

public class Address {
    private String country;
    private String city;
    private String addressLine;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

//    public Address(String country, String city, String addressLine) {
//        this.country = country;
//        this.city = city;
//        this.addressLine = addressLine;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", addressLine='" + addressLine + '\'' +
                '}';
    }
}

