package com.javacourse.homework.task33_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main_33_1 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Anna", "TT", 2);
        Student student2 = new Student("Denis", "TO", 3);
        Student student3 = new Student("Victoria", "TT", 1);
        Student student4 = new Student("Denis", "RT", 2);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        University university = new University(students);
//        students.forEach(System.out::println);

        Collections.sort(students);
        students.forEach(System.out::println);
    }
}
