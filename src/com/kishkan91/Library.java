package com.kishkan91;

import com.kishkan91.items.Book;
import com.kishkan91.repository.BookRepositoryImpl;
import com.kishkan91.repository.Repository;

public class Library {

    public static void main(String[] args) {
        //     ------1) Библиотека
        //              book items constructor: (String bookName, String authorName, String bookKey)
        Repository bookRepository = new BookRepositoryImpl(3);

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
