package com.kishkan91;

import com.kishkan91.factory.ItemBuilder;
import com.kishkan91.factory.StudentProgressBuilderImpl;
import com.kishkan91.items.StudentProgress;

public class StudentMain {

    public static void main(String[] args) {

        ItemBuilder<StudentProgress> builder = new StudentProgressBuilderImpl();
        StudentProgress progress1 = builder.makeItem();
        StudentProgress progress2 = builder.makeItem();
        StudentProgress progress3 = builder.makeItem();
        StudentProgress progress4 = builder.makeItem();
        StudentProgress progress5 = builder.makeItem();
        StudentProgress progress6 = builder.makeItem();
        StudentProgress progress7 = builder.makeItem();
        StudentProgress progress8 = builder.makeItem();
        System.out.println("Check");

    }
}
