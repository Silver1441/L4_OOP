package com.kishkan91.students;

import com.kishkan91.students.factory.*;
import com.kishkan91.students.entities.Student;
import com.kishkan91.students.entities.StudentProgress;
import com.kishkan91.students.repository.AbiturientsRepository;
import com.kishkan91.students.services.AbiturientDemo;
import com.kishkan91.services.DemoService;

public class AbiturientMain {
    public static void main(String[] args) {
        EntitiesBuilder<StudentProgress> progressBuilder = new StudentProgressRandomizeBuilder();
        EntitiesBuilder<Student> studentBuilder = new StudentMockRandomizeBuilder(progressBuilder);
        AbiturientsBuilder abiturientsBuilder = new AbiturientsMockBuilderImpl();
        AbiturientsRepository abiturients = abiturientsBuilder.buildAbiturients(6, 4, studentBuilder);
        DemoService demo = new AbiturientDemo(abiturients);

        demo.makeTest();
    }
}
