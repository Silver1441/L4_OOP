package com.kishkan91.students.services;

import com.kishkan91.services.DemoService;
import com.kishkan91.students.repository.Group;
import com.kishkan91.students.entities.Student;

public class StudentsDemo implements DemoService {
    Group group;

    public StudentsDemo(Group group) {
        this.group = group;
    }

    public void makeTest() {
        int numberOfExcellentStudents = 0;
        int numberOfUnsuccessfulStudents = 0;
        Student[] students = group.getStudentsList();

        System.out.println("  Группа: " + group.getName());
        System.out.println("Средний бал учебной группы: " + group.getGroupsGradePointAverage());
        System.out.println();
        System.out.println("  Студенты:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName() + " " + students[i].getSurname() + ", средний бал: "
                    + students[i].getGradePointAverage());
        }
        System.out.println();

        System.out.println("  Отличники:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getIsStudentExcellent() == true) {
                numberOfExcellentStudents++;
                System.out.println(students[i].getName() + " " + students[i].getSurname());
            }
        }
        System.out.println("  Количество отличников: " + numberOfExcellentStudents);
        System.out.println();

        System.out.println("  Не сдавшие:");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getIsStudentUnsuccessful() == true) {
                numberOfUnsuccessfulStudents++;
                System.out.println(students[i].getName() + " " + students[i].getSurname());
            }
        }
        System.out.println("  Количество не сдавших: " + numberOfUnsuccessfulStudents);

    }
}
