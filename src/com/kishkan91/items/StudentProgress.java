package com.kishkan91.items;

import com.kishkan91.support.ArithmeticalMean;

public class StudentProgress {

    private int chemistry;
    private int lsf;
    private int maths;
    private int physics;
    private int philosophy;
    private double gradePointAverage;

    public StudentProgress (int chemistry, int lsf, int maths, int physics, int philosophy) {
        this.chemistry = chemistry;
        this.lsf = lsf;
        this.maths = maths;
        this.physics = physics;
        this.philosophy = philosophy;
        this.gradePointAverage= ArithmeticalMean.getMean(chemistry, lsf, maths, physics, philosophy);
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }

}
