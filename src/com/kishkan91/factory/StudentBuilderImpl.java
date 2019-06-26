package com.kishkan91.factory;

import com.kishkan91.items.Student;

public class StudentBuilderImpl /*implements ItemBuilder*/ {
    //Create items via randomisation

    String[] maleNames = {"Александр", "Андрей", "Василий","Виталий", "Борис", "Григорий",
            "Евгений", "Николай", "Люций", "Максим", "Сергей", "Тимур", "Федор"};
    String[] maleSurnames = {"Афанасьев", "Белов", "Гордеев", "Захаров", "Игнатьев", "Карпов", "Князев", "Кузнецов",
            "Лукин", "Морозов", "Попов", "Рябов", "Сидоров", "Федоров", "Яковлев"};

    String[] femaleNames = {"Августина", "Аделаида", "Анастасия", "Анна", "Айгуль",  "Бажена", "Берта",
            "Василиса", "Вероника", "Венера", "Зульфия", "Любава", "Номина", "Руслана", "Тора", "Юлия"};
    String[] femaleSurnames = {"Афанасьева", "Белова", "Богданова", "Громова", "Зайцева", "Калинина",
            "Колесникова", "Кузнецйова", "Назарова", "Новикова", "Орлова", "Хансен", "Яковлева"};

/*
    private Student makeItem (){

        int genderDeterminer = (int) (Math.random()*2);
        if (genderDeterminer==0) {   //male student
            String name =
        }
    }
*/

}
