package com.kishkan91.students.services;

import com.kishkan91.services.DemoService;
import com.kishkan91.students.entities.Student;
import com.kishkan91.students.repository.GroupRepository;

public class StudentsDemo implements DemoService {
    private GroupRepository group;

    public StudentsDemo(GroupRepository group) {
        this.group = group;
    }

    public void makeTest() {
        int numberOfExcellentStudents = 0;
        int numberOfUnsuccessfulStudents = 0;
        Student[] students = group.getStudentsList();

        System.out.println("  Группа: " + group.getName());
        System.out.println("Средний бал учебной группы: " + group.getGroupGradePointAverage());
        System.out.println();
        System.out.println("  Студенты:");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname() + ", средний бал: "
                    + student.getGradePointAverage());
        }
        System.out.println();

        System.out.println("  Отличники:");
        for (Student student : students) {
            if (student.getIsStudentExcellent()) {
                numberOfExcellentStudents++;
                System.out.println(student.getName() + " " + student.getSurname());
            }
        }
        System.out.println("  Количество отличников: " + numberOfExcellentStudents);
        System.out.println();

        System.out.println("  Не сдавшие:");
        for (Student student : students) {
            if (student.getIsStudentUnsuccessful()) {
                numberOfUnsuccessfulStudents++;
                System.out.println(student.getName() + " " + student.getSurname());
            }
        }
        System.out.println("  Количество не сдавших: " + numberOfUnsuccessfulStudents);

    }
}
