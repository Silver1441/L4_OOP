package com.kishkan91.students.services;

import com.kishkan91.services.DemoService;
import com.kishkan91.students.entities.Student;
import com.kishkan91.students.repository.AbiturientsRepository;

public class AbiturientDemo implements DemoService {
    AbiturientsRepository abiturients;

    public AbiturientDemo(AbiturientsRepository abiturients) {
        this.abiturients = abiturients;
    }

    public void makeTest() {
        Student[] abiturientsArray = abiturients.getAbiturientsList();
        Student[] abiturientsTakenArray = abiturients.getAbiturientsTakenList();

        System.out.println("Количество абитуриентов: " + abiturients.getNumberOfAbiturients());
        System.out.println("Количество мест: " + abiturients.getNumberOfAvailableSlots());
        System.out.println();

        System.out.println(" Список абитуриентов:");
        for (int i = 0; i < abiturients.getNumberOfAbiturients(); i++) {
            System.out.println(abiturientsArray[i].getName() + " " + abiturientsArray[i].getSurname()
                    + ", средний бал: " + abiturientsArray[i].getGradePointAverage());
        }
        System.out.println();

        System.out.println(" Список поступивших:");
        for (int i = 0; i < abiturients.getNumberOfAvailableSlots(); i++) {
            System.out.println(abiturientsTakenArray[i].getName() + " " + abiturientsTakenArray[i].getSurname()
                    + ", средний бал: " + abiturientsTakenArray[i].getGradePointAverage());
        }

    }
}
