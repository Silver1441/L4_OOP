package com.kishkan91.Handlers;

import com.kishkan91.Items.Book;
import com.kishkan91.Repository.BookRepo;

import java.util.Map;


public class LibraryHandlerImpl implements LibraryHandler {
    BookRepo bookRepo;

    public LibraryHandlerImpl(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }

    public void addBook(Book book, String bookKey){
        bookRepo.addBook(book, bookKey);
    }

    public Map<String, Book> getBookList() {
        return bookRepo.getBookList();
    }

    public Book getBook(String bookKey) {
        return bookRepo.getBook(bookKey);
    }

    public void removeBook(String bookKey) {
        bookRepo.removeBook(bookKey);
    }

}
