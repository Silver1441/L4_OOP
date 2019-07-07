package com.kishkan91.students.factory;

import com.kishkan91.students.entities.StudentProgress;

import static com.kishkan91.support.Randomizer.makeRandom;

public class StudentProgressRandomizeBuilder implements EntitiesBuilder {
    //StudentProgress constructor (int chemistry, int lsf, int maths, int physics, int philosophy)
    public StudentProgress buildEntities() {
        int probabilityEmitter = makeRandom(0, 5);
        int chemistry;
        int lsf;
        int maths;
        int physics;
        int philosophy;

        if (probabilityEmitter == 0) {   //20% probability to have a student with "2"
            chemistry = makeRandom(2, 4);
            lsf = makeRandom(2, 4);
            maths = makeRandom(2, 4);
            physics = makeRandom(2, 4);
            philosophy = makeRandom(2, 4);

        } else if (probabilityEmitter == 1) {   //20% probability to have a student with an excellent grade
            chemistry = 5;
            lsf = 5;
            maths = 5;
            physics = 5;
            philosophy = 5;

        } else {    //average student
            chemistry = makeRandom(3, 3);
            lsf = makeRandom(3, 3);
            maths = makeRandom(3, 3);
            physics = makeRandom(3, 3);
            philosophy = makeRandom(3, 3);
        }
        return (new StudentProgress(chemistry, lsf, maths, physics, philosophy));
    }
}
