package com.kishkan91;

import com.kishkan91.demoService.DemoService;
import com.kishkan91.demoService.LibraryDemo;
import com.kishkan91.repository.BookRepositoryImpl;
import com.kishkan91.repository.Repository;

public class Library {

    public static void main(String[] args) {
        //     ------1) Библиотека
        Repository bookRepository = new BookRepositoryImpl(3);
        DemoService demo = new LibraryDemo(bookRepository);

        demo.makeTest();
    }
}
