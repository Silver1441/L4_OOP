package com.kishkan91.Handlers;

import com.kishkan91.Items.Book;
import com.kishkan91.Repository.BookRepo;


public class LibraryHandlerImpl implements LibraryHandler {
    BookRepo bookRepo;

    public LibraryHandlerImpl(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }

    public void addBook(Book book, String decimalNumber){

        bookRepo.addBook(book, decimalNumber);
    }

}
