package com.javacourse.homework.task14;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setEmail("em");
        user.setUsername("Un");
        user.setPassword("pw");

        Address address = new Address();
        address.setAddressLine("ad");
        address.setCountry("co");
        address.setCity("ci");

//        user.setAddress(address);
        System.out.println(user.getEmail());

//        System.out.println(user);

//        Address address = new Address("country1", "city1", "addressLine1");
//        address.addressLine = "addressLine1";
//        address.city = "city1";
//        address.country = "country1";

//
//        Address address = new Address("country1", "city1", "addressLine1");
//        User user = new User("Alex", "SomeEmail", "SomePassword", address);
//
//        User user1 = new User("Alex", "SomeEmail", "SomePassword", "country", "city1", "addressLine1");
//
//        System.out.println(user);
//        System.out.println(user1);

    }
}

