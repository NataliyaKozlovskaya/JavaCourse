package com.javacourse.homework.task33_1;

public class Student implements Comparable<Student> {
    private String name;
    private String faculty;
    private Integer course;

    public Student(String name, String faculty, Integer course) {
        this.name = name;
        this.faculty = faculty;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Override
    public int compareTo(Student o) {
        int i = this.name.compareTo(o.name);
        if (i==0){
            return this.course.compareTo(o.course);
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                '}';
    }
}
