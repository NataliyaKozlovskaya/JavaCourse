package com.javacourse.homework.task4;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        User user = new User();
        Address address = new Address();
        user.address = address;

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите username: ");
        user.username = scan.nextLine();

        System.out.println("Введите email: ");
        user.email = scan.nextLine();

        System.out.println("Введите password: ");
        user.password = scan.nextLine();
//---------------------------------------------
        System.out.println("Введите country: ");
        user.address.country = scan.nextLine();

        System.out.println("Введите city: ");
        user.address.city = scan.nextLine();

        System.out.println("Введите addressLine: ");
        user.address.addressLine = scan.nextLine();

        System.out.println(user);

    }
}
