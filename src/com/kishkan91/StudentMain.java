package com.kishkan91;

import com.kishkan91.factory.ItemBuilder;
import com.kishkan91.factory.StudentBuilderImpl;
import com.kishkan91.factory.StudentProgressBuilderImpl;
import com.kishkan91.items.Student;
import com.kishkan91.items.StudentProgress;

public class StudentMain {

    public static void main(String[] args) {

        ItemBuilder<StudentProgress> progressBuilder = new StudentProgressBuilderImpl();
        ItemBuilder<Student> studentBuilder = new StudentBuilderImpl(progressBuilder);

        Student progress1 = studentBuilder.makeItem();
        Student progress2 = studentBuilder.makeItem();
        Student progress3 = studentBuilder.makeItem();
        Student progress4 = studentBuilder.makeItem();
        Student progress5 = studentBuilder.makeItem();

        System.out.println("Check");

    }
}
