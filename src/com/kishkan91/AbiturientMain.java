package com.kishkan91;

import com.kishkan91.factory.ItemBuilder;
import com.kishkan91.factory.StudentBuilderImpl;
import com.kishkan91.factory.StudentProgressBuilderImpl;
import com.kishkan91.items.Abiturients;
import com.kishkan91.items.Student;
import com.kishkan91.items.StudentProgress;

import java.util.Arrays;

public class AbiturientMain {

    public static void main(String[] args) {
        ItemBuilder<StudentProgress> progressBuilder = new StudentProgressBuilderImpl();
        ItemBuilder<Student> studentBuilder = new StudentBuilderImpl(progressBuilder);
        Abiturients abiturients = new Abiturients(6, 4, studentBuilder);

        System.out.println("Check");

    }
}
