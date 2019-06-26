package com.kishkan91.factory;

import com.kishkan91.items.StudentProgress;
import com.kishkan91.support_classes.Randomizer;

public class StudentProgressBuilderImpl implements ItemBuilder {
    //StudentProgress constructor (int chemistry, int lsf, int maths, int physics, int philosophy)

    public StudentProgress makeItem() {

        int probabilityEmitter = Randomizer.makeRandom(0, 5);
        int chemistry;
        int lsf;
        int maths;
        int physics;
        int philosophy;

        if (probabilityEmitter==0){   //20% probability to have a student with "2"
            chemistry =  Randomizer.makeRandom(2, 4);
            lsf =  Randomizer.makeRandom(2, 4);
            maths =  Randomizer.makeRandom(2, 4);
            physics =  Randomizer.makeRandom(2, 4);
            philosophy =  Randomizer.makeRandom(2, 4);

        } else if (probabilityEmitter==1) {   //20% probability to have a student with an excellent grade
            chemistry = 5;
            lsf = 5;
            maths = 5;
            physics = 5;
            philosophy = 5;

        } else {    //average student
            chemistry =  Randomizer.makeRandom(3, 3);
            lsf =  Randomizer.makeRandom(3, 3);
            maths =  Randomizer.makeRandom(3, 3);
            physics =  Randomizer.makeRandom(3, 3);
            philosophy =  Randomizer.makeRandom(3, 3);

        }
        return (new StudentProgress(chemistry, lsf, maths, physics, philosophy));
    }

}
