package com.kishkan91.students.services;

import com.kishkan91.students.entities.Student;

import static com.kishkan91.services.ArithmeticalMean.getMean;

public class GroupGradePointAverageCalculator {
    public static double calculateGroupGradePointAverage(Student[] students){
        double[] averageGrades = new double[students.length];
        for (int i = 0; i < students.length; i++) {
            averageGrades[i] = students[i].getGradePointAverage();
        }

        return getMean(averageGrades);
    }
}
