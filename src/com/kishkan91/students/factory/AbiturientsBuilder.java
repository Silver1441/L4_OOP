package com.kishkan91.students.factory;

import com.kishkan91.students.entities.Student;
import com.kishkan91.students.repository.AbiturientsRepository;

public interface AbiturientsBuilder {
    AbiturientsRepository buildAbiturients(int numberOfAbiturients,
                                           int availableSlots, EntitiesBuilder<Student> studentBuilder);
}
