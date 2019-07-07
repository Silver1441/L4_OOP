package com.kishkan91;

import com.kishkan91.factory.ItemBuilder;
import com.kishkan91.factory.StudentBuilderImpl;
import com.kishkan91.factory.StudentProgressBuilderImpl;
import com.kishkan91.entities.Abiturients;
import com.kishkan91.entities.Student;
import com.kishkan91.entities.StudentProgress;
import com.kishkan91.services.demo.AbiturientDemo;
import com.kishkan91.services.demo.DemoService;

public class AbiturientMain {

    public static void main(String[] args) {
        ItemBuilder<StudentProgress> progressBuilder = new StudentProgressBuilderImpl();
        ItemBuilder<Student> studentBuilder = new StudentBuilderImpl(progressBuilder);
        Abiturients abiturients = new Abiturients(6, 4, studentBuilder);
        DemoService demo = new AbiturientDemo(abiturients);

        demo.makeTest();

    }
}
