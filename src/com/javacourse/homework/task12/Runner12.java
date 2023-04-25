package com.javacourse.homework.task12;

public class Runner12 {
    public static void main(String[] args) {
        for (int i =1; i < 100; i++) {
            int counter = 0;
            for (int j =1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(i);
            }
        }

 //_________________________________________________________
//        for (int sum = 1; sum <= 18; sum++) {
//            System.out.print("Сумма чисел равна " + sum + ":");
//            int counter = 0;
//            int remember = 0;
//            for (int i = 10; i < 100; i++) {
//                if (sum == i/10 + i%10) {
//                    if (counter == 0) {
//                        remember = i;
//                    } else if (counter == 1) {
//                        System.out.print(remember + "," + i + ",");
//                    } else {
//                        System.out.print(i + ",");
//                    }
//                    counter++;
//                }
//            }
//            System.out.println();
//        }


        //________________________________________________
        // for (int i = 0; i < 100; i++) {
//            if (i / 10 == i % 10) {
//                System.out.println(i);
//            }
//
//        }
//-----------------------------------------------------
//        for (int i = 0 ; i < 100; i++) {
//            if (i % 3 == 0 && i % 7 == 0) {
//                System.out.println(i);
//            }
//        }
    }
}
