package com.javacourse.homework.task29_1;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String nameUniv = "BNTY";
    private List<Student> students;

    public University(String nameUniv, List<Student> students) {
        this.nameUniv = nameUniv;
        this.students = students;
    }

    public String getNameUniv() {
        return nameUniv;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void lisFaculty() {
        List<Student> f1 = new ArrayList<>();
        List<Student> f2 = new ArrayList<>();

        for (Student stud : students) {
            if ("F1".equals(stud.getFaculty())) {
                f1.add(stud);
            } else if ("F2".equals(stud.getFaculty())) {
                f2.add(stud);
            }
        }
        System.out.println("Факультет F1: ");
        for (Student stud : f1) {
            System.out.println("Имя студента: " + stud.getName() + "  " + "Год обучения: " + stud.getYearStudy());
        }
        System.out.println("Факультет F2: ");
        for (Student stud : f2) {
            System.out.println("Имя студента: " + stud.getName() + "  " + "Год обучения: " + stud.getYearStudy());
        }
    }

    public void listBirthdayDay() {
        System.out.print("Ближайшие ДР у студентов: ");
        for (Student stud : students) {
            if (2000 == stud.getBirthday()) {
                System.out.print(stud.getName() + ", ");
            }
        }
        System.out.println();
    }

    public void countStudentOfCouse() {
        int count1 = 0;
        int count2 = 0;
        for (Student stud : students) {
            if ("F1".equals(stud.getFaculty())) {
                count1++;
            } else if ("F2".equals(stud.getFaculty())) {
                count2++;

            }
        }
        System.out.println("Курс 1: " + count1);
        System.out.println("Курс 2: " + count2);
    }
}

