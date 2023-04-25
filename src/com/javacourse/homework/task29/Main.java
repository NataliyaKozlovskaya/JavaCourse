package com.javacourse.homework.task29;

import java.util.ArrayList;
import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        MyArrayList<String> list = new MyArrayList<>();
//        list.add("rr0");
//        list.add("rr1");
//        list.add("rr2");
//        list.add("rr3");
//        list.add("rr4");
//        list.add("rr5");
//        list.add("rr6");
//        list.add("rr7");
////        System.out.println(list.get(0));
////        System.out.println(list.size());
//        list.remove(4);
//        for (int i = 0; i< list.size(); i++){
//            System.out.println(list.get(i));
//        }
//    }
//}

public class Main{
    public static <T> void main(String[] args) {
        List<String> collection = new ArrayList<>();

        collection.add("el1");
        collection.add("el2");
        collection.add("el3");
        collection.add("el4");
        collection.add("el5");
        collection.remove(2);
        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
        System.out.println(collection.get(2));
        System.out.println(collection.get(3));
        System.out.println(collection.get(4));
        System.out.println(collection.get(6));
        System.out.println(collection.size());
    }
}