package com.kishkan91.students.repository;

import com.kishkan91.students.entities.Student;
import com.kishkan91.students.factory.EntitiesBuilder;
import com.kishkan91.students.services.AbiturientsGradesDescendingComparator;

import java.util.Arrays;

public class Abiturients {
    private Student[] abiturients;
    private Student[] abiturientsTaken;
    private EntitiesBuilder<Student> studentBuilder;

    public Abiturients(int numberOfAbiturients, int availableSlots, EntitiesBuilder<Student> studentBuilder) {
        if (numberOfAbiturients <= availableSlots) {
            availableSlots = numberOfAbiturients;
        }

        this.studentBuilder = studentBuilder;
        abiturients = new Student[numberOfAbiturients];
        abiturientsTaken = new Student[availableSlots];

        this.makeAbiturientsList();
        this.makeTakenAbiturientsList();
    }

    private void makeAbiturientsList() {
        for (int i = 0; i < abiturients.length; i++) {
            abiturients[i] = studentBuilder.buildEntities();
        }
    }

    private void makeTakenAbiturientsList() {
        Arrays.sort(abiturients, new AbiturientsGradesDescendingComparator());

        for (int i = 0; i < abiturientsTaken.length; i++) {
            abiturientsTaken[i] = abiturients[i];
        }
    }

    public int getNumberOfAbiturients() {
        return abiturients.length;
    }

    public int getNumberOfAvailableSlots() {
        return abiturientsTaken.length;
    }

    public Student[] getAbiturientsList() {
        return abiturients;
    }

    public Student[] getAbiturientsTakenList() {
        return abiturientsTaken;
    }
}
