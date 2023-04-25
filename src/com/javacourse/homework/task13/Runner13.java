package com.javacourse.homework.task13;

public class Runner13 {
    public static void main(String[] args) {
    String  str = "";
        for (String el: args) {
            String[] split = el.split("");
            for (int i = 0; i < split.length; i++) {
                for (int j = i + 1; j < split.length; j++) {
                    if (split[i].equals(split[j])) {
                        el = el.replaceAll(split[i], "");
                    }
                }
            }
            if (str.length() < el.length()) {
                str = el;
            }
        }
            System.out.println(str);
    }



 //____________________________________________
//        int sum = 0;
//        for (int i = 0; i < args.length; i++) {
//            sum = sum + args[i].length();
//        }
//        double avr = sum/ args.length;
//        for (int i = 0; i < args.length; i++) {
//            if (args[i].length() < avr) {
//                System.out.println(args[i]);
//            }
//        }


//______________________________________________________________
//        int numbers [] = new int[args.length];
//
//        for (int i = 0; i < numbers.length; i++) {
//            int num = Integer.parseInt(args[i]);//один элемент, i-ый
//            numbers[i] = num;//                     зачем это обьявляли? если не используем
//        }
//        for (int i= 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers.length-1; j++) { // почему тут -1, а выше нет
//                if (numbers[j] < numbers[j + 1]) {
//                    int temp = numbers[j];
//                    numbers[j] = numbers[j+1];
//                    numbers[j+1] = temp;
//                }
//            }
//        }
//
//        for (int i =0; i <numbers.length; i++){
//            System.out.println(numbers[i]);
       // }


 //______________________________________________________
//        int array [] = {1, 2, 5, 4, 3, 2, 1, 9, 8, 7, 6};
//        int counter = 1;
//        int maxCounter = 0;
//        for (int i = 0; i < array.length-1; i++) {
//            if (array[i] < array[i + 1]) {
//                counter++;
//                if (maxCounter < counter) {
//                    maxCounter = counter;
//                } else {
//                    counter = 0;
//                }
//            }
//        }
//        System.out.println(maxCounter);

 //__________________________________________________
//        int array [] = {5, 4, 3, 2, 1, 9, 8, 7, 6};
//
//        for (int i = 0; i < array.length; i++) { // -1 не надо
//            if (array[i] % 2 == 0) {
//                System.out.print(array[i] + ",");
//            }
//        }
//        System.out.println();
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 1) {
//                System.out.print(array[i] + ";");
//            }
//        }


 //______________________________________________________
//        int array [] = {5, 4, 3, 2, 1, 9, 8, 7, 6};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 3 == 0 || array[i] % 4 == 0) {
//                System.out.println(array[i]);
//            }
//        }
         //_________________________________________________
//        int array [] = {5, 4, 3, 2, 1, 9, 8, 7, 6};
//        int min = array[0];
//        int max = array[0];
//
//        for (int i = 1; i<array.length; i++) {
//            if (min > array[i]) {
//                min = array[i];
//             }
//            if (max < array[i]){
//                max = array[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);


 //______________________________________________________
//        int array [] = new int[101];
//        int sum = 0;
//
//        for (int i = 0; i <= array.length - 1; i++) {
//            array[i] = i;
//            sum = sum +i;
//        }
//        System.out.println(sum/array.length);
//


//________________________________________________________
//        int [] array = new int[101];
//        //заполнили массив
//        for (int i = 0; i <= array.length - 1; i++) {
//            array[i] = i;
//        }

        //        for (int i = 0; i <= array.length - 1; i++) {
//            // if (i % 2 == 0 && i % 5 == 0) { без остатка делятся на 2 и на 5
//            // if (i != 0 && i % 2 == 1) { нечетные числа, иключая 0
//            if (array[i] % 2 == 0) { // индексы четных чисел
//                System.out.println(array[i]);
//            }
//        }


 //_______________________________________________
//        int [] array = new int [101];
//
//        for (int i = 0; i <= array.length-1; i++) {
//            array[i] = i;
//        }
//        for (int i = 0; i <= array.length - 1; i++) {
//            for (int j = 0; j <= array.length - 2; j++) {
//                if (array[j] < array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i <= array.length - 1; i++){
//            System.out.println(array[i]);
//        }
//

//________________________________________________
//        int array [] = new int [101];
//
//        for (int i = 0; i <= array.length - 1; i++) {
//            array[i] = i;
//        }
//        for (int i = 0; i <= array.length - 1; i++){
//            System.out.println(array[i]);
//        }
//        System.out.println(array.length);

 //______________________________________________
//        for (int i = args.length - 1; i >= 0; i--) {
//            System.out.println(args[i]);
//        }
    }

