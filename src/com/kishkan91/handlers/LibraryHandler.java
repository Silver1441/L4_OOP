package com.kishkan91.handlers;

import com.kishkan91.items.Book;

import java.util.Map;

public interface LibraryHandler {

    public void addBook(Book book, String bookKey);
    public Map<String, Book> getBookList();
    public Book getBook(String bookKey);
    public void removeBook(String bookKey);
}
