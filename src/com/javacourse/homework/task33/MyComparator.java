package com.javacourse.homework.task33;
import java.util.Comparator;

public class MyComparator implements Comparator <User33> {

//    @Override
//    public int compare(User33 o1, User33 o2) {
//        return o1.getUserName().compareTo(o2.getUserName());
//    }

    @Override
    public int compare(User33 o1, User33 o2) {
        int i = o1.getBirthday().compareTo(o2.getBirthday());
        if (i == 0){
            return o1.getUserName().compareTo(o2.getUserName());
        }
        return i;
    }
}
