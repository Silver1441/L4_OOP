package com.kishkan91.students.repository;

import com.kishkan91.students.entities.Student;
import com.kishkan91.students.factory.EntitiesBuilder;
import com.kishkan91.support.ArrayReverser;

import java.util.Arrays;
import java.util.Comparator;

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
        double[] abiturientsAverageRates = new double[abiturients.length];
        for (int i = 0; i < abiturients.length; i++) {
            abiturientsAverageRates[i] = abiturients[i].getGradePointAverage();
        }

        Arrays.sort(abiturientsAverageRates);
        ArrayReverser.reverseTheArray(abiturientsAverageRates);

        //filling the abiturientsTaken array;
        for (int i = 0; i < abiturientsTaken.length; i++) {
            if (i == 0) { //hard initializing the [0] element in array to prevent "array[-1]" exception in further comparing;
                for (int j = 0; j < abiturients.length; j++) {
                    if (abiturientsAverageRates[0] == abiturients[j].getGradePointAverage()) {
                        abiturientsTaken[0] = abiturients[j];
                    }
                }
            } else { //initializing every other element in array;
                for (int j = 0; j < abiturients.length; j++) {
                    if (abiturientsAverageRates[i] == abiturients[j].getGradePointAverage()
                            && abiturients[j] != abiturientsTaken[i - 1]) { //this comparing should prevent including the same abiturient two times;
                        abiturientsTaken[i] = abiturients[j];
                    }
                }
            } //initializing's ending.
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
