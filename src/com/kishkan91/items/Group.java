package com.kishkan91.items;

public class Group {

    private int numberOfStudents;
    private Student[] students;

    public Group (int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
        students = new Student[numberOfStudents];
    }
}
