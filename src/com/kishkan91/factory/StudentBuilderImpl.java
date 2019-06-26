package com.kishkan91.factory;

public class StudentBuilderImpl implements StudentBuilder {

    private int numberOfStudents;

    public StudentBuilderImpl(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


}
