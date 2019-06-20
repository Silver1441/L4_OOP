package com.kishkan91.Repository;

import com.kishkan91.Items.Book;

import java.util.HashMap;
import java.util.Map;

public interface BookRepo {
    Map<String, Book> books = new HashMap<String, Book>();

    public void addBook (Book book, String bookKey);
    public Map<String, Book> getBookList();
    public Book getBook(String bookKey);
    public void removeBook(String bookKey);

}
