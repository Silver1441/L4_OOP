package com.kishkan91.students.repository;

import com.kishkan91.students.entities.Student;

public interface GroupRepository {
    String getName();
    double getGroupGradePointAverage();
    Student[] getStudentsList();
}
