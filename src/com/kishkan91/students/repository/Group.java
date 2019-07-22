package com.kishkan91.students.repository;

import com.kishkan91.students.entities.Student;
import static com.kishkan91.students.services.GroupGradePointAverageCalculator.calculateGroupGradePointAverage;

public class Group implements GroupRepository {
    private String name;
    private Student[] students;
    private double groupGradePointAverage;

    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
        this.groupGradePointAverage = calculateGroupGradePointAverage(students);
    }

    public String getName() {
        return name;
    }

    public double getGroupGradePointAverage() {
        return groupGradePointAverage;
    }

    public Student[] getStudentsList() {
        return students;
    }
}
