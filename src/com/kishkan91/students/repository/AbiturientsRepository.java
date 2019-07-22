package com.kishkan91.students.repository;

import com.kishkan91.students.entities.Student;

public interface AbiturientsRepository {
    int getNumberOfAbiturients();
    int getNumberOfAvailableSlots();
    Student[] getAbiturientsList();
    Student[] getAbiturientsTakenList();
}
