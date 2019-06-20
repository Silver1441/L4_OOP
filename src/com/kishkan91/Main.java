package com.kishkan91;

import com.kishkan91.Handlers.LibraryHandler;
import com.kishkan91.Handlers.LibraryHandlerImpl;
import com.kishkan91.Repository.BookRepo;
import com.kishkan91.Repository.BookRepoImpl;

public class Main {

    public static void main(String[] args) {
        BookRepo bookRepo = BookRepoImpl.getInstance();
        LibraryHandler libraryHandler = new LibraryHandlerImpl(bookRepo);

    }
}
