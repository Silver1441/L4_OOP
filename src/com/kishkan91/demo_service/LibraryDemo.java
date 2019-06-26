package com.kishkan91.demo_service;

import com.kishkan91.items.Book;
import com.kishkan91.repository.Repository;

//              book items constructor: (String bookName, String authorName, String bookKey)
public class LibraryDemo implements DemoService {


    Repository bookRepository;

    public LibraryDemo(Repository bookRepository) {
        this.bookRepository=bookRepository;
    }

    public void makeTest() {

        bookRepository.addBook(new Book("Дюна", "Ф.Герберт", "АА001"));
        bookRepository.addBook(new Book("8r14", "Отд.001", "АА002"));
        bookRepository.addBook(new Book("Стража Стража", "Т.Пратчетт", "АА003"));
        bookRepository.addBook(new Book("This will not be added", "This will not be added", "This will not be added"));
        System.out.println("Check-addBook");

        Book book = bookRepository.getBookByKey("АА002");
        System.out.println("Check-getBook");

        bookRepository.deleteBookByKey("АА002");
        System.out.println("Check-deleteBook");

        bookRepository.addBook(new Book("Гарри Поттер", "Женщина", "АБ001"));
        System.out.println("Check-newBook");

        boolean areThereFreeSlots = bookRepository.areSlotsFree();
        System.out.println("Check-areFree");

    }


}
