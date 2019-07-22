package com.kishkan91.students.services;

import com.kishkan91.students.entities.Student;

import java.util.Arrays;

public class AbiturientsTakenCalculator {
    public static Student[] calculateAbiturientsTaken(Student[] abiturients, int availableSlots) {

        if (abiturients.length <= availableSlots) {
            availableSlots = abiturients.length;
        }

        Student[] abiturientsTaken = new Student[availableSlots];

        Arrays.sort(abiturients, new AbiturientsGradesDescendingComparator());

        for (int i = 0; i < abiturientsTaken.length; i++) {
            abiturientsTaken[i] = abiturients[i];
        }

        return abiturientsTaken;
    }
}
