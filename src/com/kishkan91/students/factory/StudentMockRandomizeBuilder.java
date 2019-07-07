package com.kishkan91.students.factory;

import com.kishkan91.students.entities.Student;
import com.kishkan91.students.entities.StudentProgress;

import static com.kishkan91.support.Randomizer.makeRandom;
import static com.kishkan91.students.staticholder.NamesHolder.*;

public class StudentMockRandomizeBuilder implements EntitiesBuilder {
    private EntitiesBuilder<StudentProgress> progressBuilder;

    public StudentMockRandomizeBuilder(EntitiesBuilder<StudentProgress> progressBuilder) {
        this.progressBuilder = progressBuilder;
    }

    public Student buildEntities() {
        int genderDeterminer = makeRandom(0, 2);
        String name;
        String surName;

        if (genderDeterminer == 0) {   //male student 50%
            name = maleNames[makeRandom(0, maleNames.length)];
            surName = maleSurnames[makeRandom(0, maleSurnames.length)];
        } else {   //female student 50%
            name = femaleNames[makeRandom(0, femaleNames.length)];
            surName = femaleSurnames[makeRandom(0, femaleSurnames.length)];
        }
        return (new Student(progressBuilder.buildEntities(), name, surName));
    }
}
