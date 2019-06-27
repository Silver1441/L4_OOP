package com.kishkan91;

import com.kishkan91.factory.ItemBuilder;
import com.kishkan91.factory.StudentBuilderImpl;
import com.kishkan91.factory.StudentProgressBuilderImpl;
import com.kishkan91.items.Group;
import com.kishkan91.items.Student;
import com.kishkan91.items.StudentProgress;


public class StudentMain {

    public static void main(String[] args) {

        ItemBuilder<StudentProgress> progressBuilder = new StudentProgressBuilderImpl();
        ItemBuilder<Student> studentBuilder = new StudentBuilderImpl(progressBuilder);
        Group group = new Group(10, "Группа №1", studentBuilder);

        System.out.println("Check");

    }
}
