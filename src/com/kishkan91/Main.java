package com.kishkan91;

import com.kishkan91.repository.BookRepository;
import com.kishkan91.repository.BookRepositoryImpl;

public class Main {

    public static void main(String[] args) {
        //     ------1) Библиотека
        //              book items constructor: (String bookName, String authorName, String bookKey)
        BookRepository bookRepository = new BookRepositoryImpl(5);

        bookRepository.addBook("Дюна", "Ф. Герберт", "АА001");
        bookRepository.addBook("8r14", "Отд.001", "АА002");
        System.out.println("Check");

    }
}
