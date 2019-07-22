package com.kishkan91.students.repository;

import com.kishkan91.students.entities.Student;
import static com.kishkan91.students.services.AbiturientsTakenCalculator.calculateAbiturientsTaken;

public class Abiturients implements AbiturientsRepository {
    private Student[] abiturients;
    private Student[] abiturientsTaken;

    public Abiturients(Student[] abiturients, int availableSlots) {
        this.abiturients = abiturients;
        this.abiturientsTaken = calculateAbiturientsTaken(abiturients, availableSlots);
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
