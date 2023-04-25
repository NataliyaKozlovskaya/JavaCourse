package com.javacourse.homework.task14;

public class User {

    private String username;
    private String email;
    private String password;
    private Address address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

//    public User(String username, String email, String password, Address address) {
//        this.username = username;
//        this.email = email;
//        this.password = password;
//        this.address = address;
//
//    }

//    public User(String username, String email, String password, String country, String city, String addressLine) {
//        this.username = username;
//        this.email = email;
//        this.password = password;
//        this.address = new Address(country, city, addressLine);
//    }

    @Override // обьект переводим в строку для вывода
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}




