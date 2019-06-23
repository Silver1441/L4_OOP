package com.kishkan91.handlers;

import com.kishkan91.items.Book;
import com.kishkan91.repository.BookRepository;

import java.util.Map;


public class LibraryHandlerImpl implements LibraryHandler {
    BookRepository bookRepository;

    public LibraryHandlerImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book, String bookKey){
        bookRepository.addBook(book, bookKey);
    }

    public Map<String, Book> getBookList() {
        return bookRepository.getBookList();
    }

    public Book getBook(String bookKey) {
        return bookRepository.getBook(bookKey);
    }

    public void removeBook(String bookKey) {
        bookRepository.removeBook(bookKey);
    }

}
