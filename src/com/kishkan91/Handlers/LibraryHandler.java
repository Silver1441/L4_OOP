package com.kishkan91.Handlers;

import com.kishkan91.Items.Book;

import java.util.Map;

public interface LibraryHandler {

    public void addBook(Book book, String bookKey);
    public Map<String, Book> getBookList();
    public Book getBook(String bookKey);
    public void removeBook(String bookKey);
}
