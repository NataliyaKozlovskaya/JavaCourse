package com.javacourse.homework.task11;

public class Runner11 {
    public static void main(String[] args) {
        double result = 0;
        int power = 1;
        while (result<9876543210l){
            result = Math.pow(2, power);
            System.out.println(result);
            power++;
        }
    }
}
//-------------------------------------------------------
//        int counter = 0;
//        int previous = 0;
//        int current = 0;
//        int next = 0;
//
//        while (counter <= 20) {
//            counter++;
//
//            System.out.println(current);
//            if (current == 0) {
//                next = 1;
//            } else {
//                next = previous + current;
//            }
//
//            previous = current;
//            current = next;
//        }
//    }
//}
////-----------------------------------------------
//
//        int a = 0;
//        int b = 0;
//
//        while (a <= 20) {
//            while (b <= 20){
//              String format = format(a * b);
//              System.out.print(format);
//                b++;
//            }
//            System.out.println();
//            a++;
//            b = 0;
//        }
//    }
//    public static String format(int result) {
//        String s = String.valueOf(result);
//        if (s.length() == 1){
//            s = s + "   ";
//        } else if (s.length() == 2) {
//            s = s + "  ";
//        } else if (s.length() == 3) {
//            s = s + " ";
//        }
//        return s;
//    }
//}
//