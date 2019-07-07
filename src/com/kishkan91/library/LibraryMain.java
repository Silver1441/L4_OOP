package com.kishkan91.library;

import com.kishkan91.services.DemoService;
import com.kishkan91.library.services.LibraryDemo;
import com.kishkan91.library.repository.BookRepositoryImpl;
import com.kishkan91.library.repository.Repository;

public class LibraryMain {

    public static void main(String[] args) {
        Repository bookRepository = new BookRepositoryImpl(3);
        DemoService demo = new LibraryDemo(bookRepository);

        demo.makeTest();
    }
}
