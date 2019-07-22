package com.kishkan91.students.factory;

import com.kishkan91.students.entities.Student;
import com.kishkan91.students.repository.Abiturients;
import com.kishkan91.students.repository.AbiturientsRepository;

public class AbiturientsMockBuilderImpl implements AbiturientsBuilder {
    public AbiturientsRepository buildAbiturients(int numberOfAbiturients,
                                                  int availableSlots, EntitiesBuilder<Student> studentBuilder) {
        Student[] abiturients = new Student[numberOfAbiturients];

        for (int i = 0; i < abiturients.length; i++) {
            abiturients[i] = studentBuilder.buildEntities();
        }

        return new Abiturients(abiturients, availableSlots);
    }
}
