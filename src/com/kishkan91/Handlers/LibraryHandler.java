package com.kishkan91.Handlers;

import com.kishkan91.Items.Book;

import java.util.Map;

public interface LibraryHandler {

    public void addBook(Book book, String decimalNumber);
    public Map<String, Book> getBookList();
}
