package com.kishkan91.repository;

import com.kishkan91.items.Book;

import java.util.HashMap;
import java.util.Map;

public class BookRepositoryImpl implements BookRepository {

    int libraryLength;
    Book[] books = new Book[libraryLength];
    boolean[] isFree = new boolean[libraryLength];

    public BookRepositoryImpl(int libraryLength) {
        this.libraryLength = libraryLength;
    }

    public void addBook (Book book, String bookKey) {

    }

}
