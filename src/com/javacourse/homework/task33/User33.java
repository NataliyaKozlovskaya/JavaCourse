package com.javacourse.homework.task33;

import java.util.Comparator;

//public class User33 implements Comparable <User33>{
public class User33 implements Comparator<User33> {
    private String userName;
    private String password;
    private Integer birthday;

    public User33(String userName, String password, Integer birthday) {
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Integer getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "User33{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compare(User33 o1, User33 o2) {
        return o1.getUserName().compareTo(o2.getUserName());
    }

    //    @Override
//    public int compareTo(User33 o) {
//        return this.userName.compareTo(o.userName);
//    }
//
//    @Override
//    public int compareTo(User33 o) {
//        return this.birthday.compareTo(o.birthday);
//    }


}
