package com.kishkan91.students.factory;

import com.kishkan91.students.entities.Student;
import com.kishkan91.students.repository.Group;
import com.kishkan91.students.repository.GroupRepository;

public class GroupMockBuilderImpl implements GroupBuilder {
    public GroupRepository buildGroup(int numberOfStudents, String name, EntitiesBuilder<Student> studentBuilder) {
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < students.length; i++) {
            students[i] = studentBuilder.buildEntities();
        }

        return new Group(name, students);
    }
}
