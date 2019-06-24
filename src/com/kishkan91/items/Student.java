package com.kishkan91.items;

public class Student {

    private String name;
    private String surname;
    private StudentProgress progress;

    public Student (StudentProgress progress, String name, String surname) {
        this.progress = progress;
        this.name = name;
        this.surname = surname;
    }
}
