package com.kishkan91.items;

import com.kishkan91.factory.ItemBuilder;

public class Abiturients {

    private Student[] abiturients;
    private ItemBuilder<Student> studentBuilder;

    public Abiturients (int numberOfAbiturients, int availableSlots, ItemBuilder<Student> studentBuilder) {
        this.studentBuilder = studentBuilder;
        abiturients = new Student[numberOfAbiturients];

        this.makeAbiturients();
    }

    private void makeAbiturients() {
        for (int i=0; i<abiturients.length; i++) {
            abiturients[i] = studentBuilder.makeItem();
        }
    }
}
