package com.javacourse.homework.task29_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Ivan", 2000, 2, "F1");
        Student stud2 = new Student("Petr", 2001, 1, "F2");
        Student stud3 = new Student("Maria", 2000, 2, "F2");
        Student stud4 = new Student("Misha", 1999, 3, "F2");

        List<Student> students = new ArrayList<>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);

        University university = new University("BNTY", students);

        System.out.println("Название университета: " + university.getNameUniv());
        System.out.println("Количество студентов: " + university.getStudents().size());
        //students.forEach(System.out::println);
        university.lisFaculty();
        university.listBirthdayDay();
        university.countStudentOfCouse();
    }

}
