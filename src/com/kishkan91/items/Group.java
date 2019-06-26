package com.kishkan91.items;

public class Group {

    private String name;
    private Student[] students;

    public Group (int numberOfStudents) {
        students = new Student[numberOfStudents];
    }
}
