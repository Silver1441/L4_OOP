package com.kishkan91.Handlers;

import com.kishkan91.Items.Book;
import com.kishkan91.Repository.BookRepo;

import java.util.Map;


public class LibraryHandlerImpl implements LibraryHandler {
    BookRepo bookRepo;

    public LibraryHandlerImpl(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }

    public void addBook(Book book, String decimalNumber){
        bookRepo.addBook(book, decimalNumber);
    }

    public Map<String, Book> getBookList() {
        return bookRepo.getBookList();
    }

    public Book getBook(String decimalNumber) {
        return bookRepo.getBook(decimalNumber);
    }

    public void removeBook(String decimalNumber) {
        bookRepo.removeBook(decimalNumber);
    }

}
