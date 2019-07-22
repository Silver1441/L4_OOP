package com.kishkan91.students.factory;

import com.kishkan91.students.entities.Student;
import com.kishkan91.students.repository.GroupRepository;

public interface GroupBuilder {
    GroupRepository buildGroup(int numberOfStudents, String name, EntitiesBuilder<Student> studentBuilder);
}
