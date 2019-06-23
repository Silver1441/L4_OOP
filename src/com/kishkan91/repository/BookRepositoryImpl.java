package com.kishkan91.repository;

import com.kishkan91.items.Book;

import java.util.HashMap;
import java.util.Map;

public class BookRepositoryImpl implements BookRepository {

    Map<String, Book> books = new HashMap<String, Book>(20);

    public void addBook (Book book, String bookKey) {
        if (books.size() <= 20){
            books.put(bookKey, book);
        }
    }

    public Map<String, Book> getBookList() {
        return this.books;
    }

    public Book getBook(String bookKey) {
        return books.get(bookKey);
    }

    public void removeBook(String bookKey) {
        books.remove(bookKey);
    }


}
