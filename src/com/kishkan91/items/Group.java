package com.kishkan91.items;

import com.kishkan91.factory.ItemBuilder;
import com.kishkan91.support.ArithmeticalMean;

public class Group {

    private String name;
    private Student[] students;
    private ItemBuilder<Student> studentBuilder;
    private double groupsGradePointAverage;

    public Group (int numberOfStudents, String name, ItemBuilder<Student> studentBuilder) {
        students = new Student[numberOfStudents];
        this.name = name;
        this.studentBuilder = studentBuilder;

        this.makeGroup();
        this.calculateGroupsGradePointAverage();
    }

    private void makeGroup() {
        for (int i=0; i<students.length; i++) {
            students[i] = studentBuilder.makeItem();
        }
    }

    private void calculateGroupsGradePointAverage(){
        double[] averageGrades = new double[students.length];
        for (int i=0; i<students.length; i++) {
            averageGrades[i] = students[i].getGradePointAverage();
        }
        groupsGradePointAverage = ArithmeticalMean.getMean(averageGrades);
    }

    public String getName() {
        return name;
    }

    public double getGroupsGradePointAverage() {
        return groupsGradePointAverage;
    }
}
