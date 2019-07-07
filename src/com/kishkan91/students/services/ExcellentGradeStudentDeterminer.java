package com.kishkan91.students.services;

import com.kishkan91.students.entities.StudentProgress;

public class ExcellentGradeStudentDeterminer {

    public static boolean isExcellent(StudentProgress progress) {
        if (progress.getChemistry() != 5) {
            return false;
        } else if (progress.getLsf() != 5) {
            return false;
        } else if (progress.getMaths() != 5) {
            return false;
        } else if (progress.getPhilosophy() != 5) {
            return false;
        } else if (progress.getPhysics() != 5) {
            return false;
        } else {
            return true;
        }
    }
}
