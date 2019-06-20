package com.kishkan91.Handlers;

import com.kishkan91.Repository.BookRepo;
import com.kishkan91.Repository.BookRepoImpl;

public class LibraryHandlerImpl implements LibraryHandler {
    BookRepo bookRepo;

    public LibraryHandlerImpl(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }


}
