package com.kishkan91.students;

import com.kishkan91.students.factory.*;
import com.kishkan91.students.entities.Student;
import com.kishkan91.students.entities.StudentProgress;
import com.kishkan91.services.DemoService;
import com.kishkan91.students.repository.GroupRepository;
import com.kishkan91.students.services.StudentsDemo;


public class StudentMain {
    public static void main(String[] args) {
        EntitiesBuilder<StudentProgress> progressBuilder = new StudentProgressRandomizeBuilder();
        EntitiesBuilder<Student> studentBuilder = new StudentMockRandomizeBuilder(progressBuilder);
        GroupBuilder groupBuilder = new GroupMockBuilderImpl();
        GroupRepository group = groupBuilder.buildGroup(10, "№1", studentBuilder);
        DemoService demo = new StudentsDemo(group);

        demo.makeTest();
    }
}
