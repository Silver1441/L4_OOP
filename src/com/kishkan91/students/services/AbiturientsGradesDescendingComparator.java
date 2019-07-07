package com.kishkan91.students.services;

import com.kishkan91.students.entities.Student;

import java.util.Comparator;

public class AbiturientsGradesDescendingComparator implements Comparator<Student> {
    public int compare(Student firstStudent, Student secondStudent) {
        double gradeDifference = firstStudent.getGradePointAverage() - secondStudent.getGradePointAverage();
        if (gradeDifference == 0) {
            return 0;
        } else if (gradeDifference > 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
