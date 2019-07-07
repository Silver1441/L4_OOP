package com.kishkan91;

import com.kishkan91.factory.ItemBuilder;
import com.kishkan91.factory.StudentBuilderImpl;
import com.kishkan91.factory.StudentProgressBuilderImpl;
import com.kishkan91.entities.Group;
import com.kishkan91.entities.Student;
import com.kishkan91.entities.StudentProgress;
import com.kishkan91.services.demo.DemoService;
import com.kishkan91.services.demo.StudentsDemo;


public class StudentMain {

    public static void main(String[] args) {

        ItemBuilder<StudentProgress> progressBuilder = new StudentProgressBuilderImpl();
        ItemBuilder<Student> studentBuilder = new StudentBuilderImpl(progressBuilder);
        Group group = new Group(8, "№1", studentBuilder);
        DemoService demo = new StudentsDemo(group);

        demo.makeTest();
    }
}
