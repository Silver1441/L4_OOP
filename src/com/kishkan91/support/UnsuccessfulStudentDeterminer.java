package com.kishkan91.support;

import com.kishkan91.items.StudentProgress;

public class UnsuccessfulStudentDeterminer {

    public static boolean isUnsuccessful (StudentProgress progress) {

        if (progress.getChemistry() == 2) {
            return true;
        } else if (progress.getLsf() == 2) {
            return true;
        } else if (progress.getMaths() == 2) {
            return true;
        } else if (progress.getPhilosophy() == 2) {
            return true;
        } else if (progress.getPhysics() == 2) {
            return true;
        } else {
            return false;
        }

    }


}
