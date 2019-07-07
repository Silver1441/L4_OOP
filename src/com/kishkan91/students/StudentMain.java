package com.kishkan91.students;

import com.kishkan91.students.factory.EntitiesBuilder;
import com.kishkan91.students.factory.StudentMockRandomizeBuilder;
import com.kishkan91.students.factory.StudentProgressRandomizeBuilder;
import com.kishkan91.students.repository.Group;
import com.kishkan91.students.entities.Student;
import com.kishkan91.students.entities.StudentProgress;
import com.kishkan91.services.DemoService;
import com.kishkan91.students.services.StudentsDemo;


public class StudentMain {
    public static void main(String[] args) {
        EntitiesBuilder<StudentProgress> progressBuilder = new StudentProgressRandomizeBuilder();
        EntitiesBuilder<Student> studentBuilder = new StudentMockRandomizeBuilder(progressBuilder);
        Group group = new Group(8, "№1", studentBuilder);
        DemoService demo = new StudentsDemo(group);

        demo.makeTest();
    }
}
