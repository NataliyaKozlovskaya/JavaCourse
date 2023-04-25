package com.javacourse.homework.task29_1;

public class Student {
    private String name;
    private Integer birthday;
    private Integer yearStudy;
    private String faculty;

    public Student(String name, Integer birthday, Integer yearStudy, String faculty) {
        this.name = name;
        this.birthday = birthday;
        this.yearStudy = yearStudy;
        this.faculty = faculty;
    }

    public Student(String name, Integer yearStudy, String faculty) {
        this.name = name;
        this.yearStudy = yearStudy;
        this.faculty = faculty;
    }

    public Student(Integer birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public Integer getYearStudy() {
        return yearStudy;
    }

    public void setYearStudy(Integer yearStudy) {
        this.yearStudy = yearStudy;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}