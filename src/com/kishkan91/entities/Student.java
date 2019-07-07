package com.kishkan91.entities;

import com.kishkan91.support.ExcellentGradeStudentDeterminer;
import com.kishkan91.support.UnsuccessfulStudentDeterminer;

public class Student {

    private String name;
    private String surname;
    private StudentProgress progress;
    private boolean isStudentExcellent;
    private boolean isStudentUnsuccessful;

    public Student (StudentProgress progress, String name, String surname) {
        this.progress = progress;
        this.name = name;
        this.surname = surname;
        this.isStudentExcellent = ExcellentGradeStudentDeterminer.isExcellent(progress);
        this.isStudentUnsuccessful = UnsuccessfulStudentDeterminer.isUnsuccessful(progress);
    }

    public String getName() {
        return name;
    }

    public  String getSurname() {
        return  surname;
    }

    public double getGradePointAverage() {
        return progress.getGradePointAverage();
    }

    public boolean getIsStudentExcellent() {
        return isStudentExcellent;
    }

    public boolean getIsStudentUnsuccessful() {
        return isStudentUnsuccessful;
    }
}
