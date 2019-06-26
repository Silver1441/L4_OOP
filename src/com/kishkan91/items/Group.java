package com.kishkan91.items;

import com.kishkan91.factory.ItemBuilder;

public class Group {

    private String name;
    private Student[] students;
    private ItemBuilder<Student> studentBuilder;

    public Group (int numberOfStudents, String name, ItemBuilder<Student> studentBuilder) {
        students = new Student[numberOfStudents];
        this.name = name;
        this.studentBuilder = studentBuilder;

        this.makeGroup();
    }

    public void makeGroup() {
        for (int i=0; i<students.length; i++) {
            students[i] = studentBuilder.makeItem();
        }
    }
}
