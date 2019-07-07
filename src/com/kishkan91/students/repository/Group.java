package com.kishkan91.students.repository;

import com.kishkan91.students.entities.Student;
import com.kishkan91.students.factory.EntitiesBuilder;

import static com.kishkan91.services.ArithmeticalMean.getMean;

public class Group {
    private String name;
    private Student[] students;
    private EntitiesBuilder<Student> studentBuilder;
    private double groupsGradePointAverage;

    public Group(int numberOfStudents, String name, EntitiesBuilder<Student> studentBuilder) {
        students = new Student[numberOfStudents];
        this.name = name;
        this.studentBuilder = studentBuilder;

        this.makeGroup();
        this.calculateGroupsGradePointAverage();
    }

    private void makeGroup() {
        for (int i = 0; i < students.length; i++) {
            students[i] = studentBuilder.buildEntities();
        }
    }

    private void calculateGroupsGradePointAverage() {
        double[] averageGrades = new double[students.length];
        for (int i = 0; i < students.length; i++) {
            averageGrades[i] = students[i].getGradePointAverage();
        }
        groupsGradePointAverage = getMean(averageGrades);
    }

    public String getName() {
        return name;
    }

    public double getGroupsGradePointAverage() {
        return groupsGradePointAverage;
    }

    public Student[] getStudentsList() {
        return students;
    }
}
