package com.kishkan91.Repository;

import com.kishkan91.Items.Book;

import java.util.HashMap;
import java.util.Map;

public class BookRepoImpl implements BookRepo {
    private static BookRepoImpl instance;
    Map<String, Book> books = new HashMap<String, Book>();

    private BookRepoImpl(){
    }

    public static BookRepoImpl getInstance() {
        if (instance == null) {
            instance = new BookRepoImpl();
        }
        return instance;
    }

    public void addBook (Book book, String decimalNumber) {
        books.put(decimalNumber, book);
    }


}
