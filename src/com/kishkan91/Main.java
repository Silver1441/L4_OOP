package com.kishkan91;

import com.kishkan91.repository.BookRepository;
import com.kishkan91.repository.BookRepositoryImpl;

public class Main {

    public static void main(String[] args) {
        //     ------1) Библиотека
        BookRepository bookRepository = new BookRepositoryImpl(20);



    }
}
