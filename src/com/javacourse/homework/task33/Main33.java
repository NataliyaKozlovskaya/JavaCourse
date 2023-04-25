package com.javacourse.homework.task33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main33 {
    public static void main(String[] args) {

        List<User33> users = new ArrayList<>();

        User33 user1 = new User33("Vanya", "qqq@", 1999);
        User33 user2 = new User33("Kolya", "fffq@", 1987);
        User33 user3 = new User33("Oleg", "qskd@", 1989);
        User33 user4 = new User33("Slava", "knfj@", 19996);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

       // users.forEach(System.out::println);

//        Collections.sort(users);
//        users.forEach(System.out::println);

//        Collections.sort(users);
//        users.forEach(System.out::println);

        Collections.sort(users, new MyComparator());
        users.forEach(System.out::println);
    }

}
