package com.kishkan91.students;

import com.kishkan91.students.factory.EntitiesBuilder;
import com.kishkan91.students.factory.StudentMockRandomizeBuilder;
import com.kishkan91.students.factory.StudentProgressRandomizeBuilder;
import com.kishkan91.students.repository.Abiturients;
import com.kishkan91.students.entities.Student;
import com.kishkan91.students.entities.StudentProgress;
import com.kishkan91.services.demo.AbiturientDemo;
import com.kishkan91.services.demo.DemoService;

public class AbiturientMain {
    public static void main(String[] args) {
        EntitiesBuilder<StudentProgress> progressBuilder = new StudentProgressRandomizeBuilder();
        EntitiesBuilder<Student> studentBuilder = new StudentMockRandomizeBuilder(progressBuilder);
        Abiturients abiturients = new Abiturients(6, 4, studentBuilder);
        DemoService demo = new AbiturientDemo(abiturients);

        demo.makeTest();
    }
}
