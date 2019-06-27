package com.kishkan91.factory;

import com.kishkan91.repository.NamesHolder;
import com.kishkan91.items.Student;
import com.kishkan91.items.StudentProgress;
import com.kishkan91.support.Randomizer;

public class StudentBuilderImpl implements ItemBuilder {

    private ItemBuilder<StudentProgress>  progressBuilder;

    public StudentBuilderImpl(ItemBuilder<StudentProgress>  progressBuilder){
        this. progressBuilder =  progressBuilder;
    }

    public Student makeItem(){

        int genderDeterminer = Randomizer.makeRandom(0, 2);
        String name;
        String surName;

        if (genderDeterminer==0) {   //male student
            name = NamesHolder.maleNames[Randomizer.makeRandom(0, NamesHolder.maleNames.length)];
            surName = NamesHolder.maleSurnames[Randomizer.makeRandom(0, NamesHolder.maleSurnames.length)];

        } else {   //female student
            name = NamesHolder.femaleNames[Randomizer.makeRandom(0, NamesHolder.femaleNames.length)];
            surName = NamesHolder.femaleSurnames[Randomizer.makeRandom(0, NamesHolder.femaleSurnames.length)];

        }
        return (new Student(progressBuilder.makeItem(), name, surName));
    }


}
