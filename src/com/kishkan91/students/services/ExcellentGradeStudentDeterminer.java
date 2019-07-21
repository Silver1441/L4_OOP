package com.kishkan91.students.services;

import com.kishkan91.students.entities.StudentProgress;

public class ExcellentGradeStudentDeterminer {

    public static boolean isExcellent(StudentProgress progress) {
        return progress.getChemistry() == 5
                && progress.getLsf() == 5
                && progress.getMaths() == 5
                && progress.getPhilosophy() == 5
                && progress.getPhysics() == 5;
    }
}
