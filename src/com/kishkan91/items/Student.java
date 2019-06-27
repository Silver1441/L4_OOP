package com.kishkan91.items;

import com.kishkan91.support.ExcellentGradeStudentDeterminer;

public class Student {

    private String name;
    private String surname;
    private StudentProgress progress;
    private boolean isStudentExcellent;

    public Student (StudentProgress progress, String name, String surname) {
        this.progress = progress;
        this.name = name;
        this.surname = surname;
        this.isStudentExcellent = ExcellentGradeStudentDeterminer.isExcellent(progress);
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
}
