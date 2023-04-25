package com.javacourse.homework.task31;

import java.util.Objects;

public class User31 {
    private String username;
    private String password;
    private Integer phoneNumber;

    public User31(String username, String password, Integer phoneNumber) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User31(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "User31{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
//
//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User31 user31 = (User31) o;
        return Objects.equals(username, user31.username) && Objects.equals(password, user31.password) && Objects.equals(phoneNumber, user31.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, phoneNumber);
    }
}
