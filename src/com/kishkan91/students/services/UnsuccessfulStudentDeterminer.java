package com.kishkan91.students.services;

import com.kishkan91.students.entities.StudentProgress;

public class UnsuccessfulStudentDeterminer {

    public static boolean isUnsuccessful(StudentProgress progress) {
        return progress.getChemistry() == 2
                || progress.getLsf() == 2
                || progress.getMaths() == 2
                || progress.getPhilosophy() == 2
                || progress.getPhysics() == 2;
    }
}
