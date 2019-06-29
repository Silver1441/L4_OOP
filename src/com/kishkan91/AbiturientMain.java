package com.kishkan91;

import com.kishkan91.factory.ItemBuilder;
import com.kishkan91.factory.StudentBuilderImpl;
import com.kishkan91.factory.StudentProgressBuilderImpl;
import com.kishkan91.items.Abiturients;
import com.kishkan91.items.Student;
import com.kishkan91.items.StudentProgress;
import com.kishkan91.services.AbiturientDemo;
import com.kishkan91.services.DemoService;

import java.util.Arrays;

public class AbiturientMain {

    public static void main(String[] args) {
        ItemBuilder<StudentProgress> progressBuilder = new StudentProgressBuilderImpl();
        ItemBuilder<Student> studentBuilder = new StudentBuilderImpl(progressBuilder);
        Abiturients abiturients = new Abiturients(6, 4, studentBuilder);
        DemoService demo = new AbiturientDemo(abiturients);

        demo.makeTest();

    }
}
