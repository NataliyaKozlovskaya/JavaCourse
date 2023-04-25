package com.javacourse.homework.task4;

public class User {
    String username;
    String email;
    String password;
    Address address;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}
