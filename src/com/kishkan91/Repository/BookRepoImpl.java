package com.kishkan91.Repository;

import com.kishkan91.Items.Book;

import java.util.HashMap;
import java.util.Map;

public class BookRepoImpl implements BookRepo {
    private static BookRepoImpl instance;
    Map<String, Book> books = new HashMap<String, Book>(20);

    private BookRepoImpl(){
    }

    public static BookRepoImpl getInstance() {
        if (instance == null) {
            instance = new BookRepoImpl();
        }
        return instance;
    }

    public void addBook (Book book, String decimalNumber) {
        if (books.size() <= 20){
            books.put(decimalNumber, book);
        }
    }

    public Map<String, Book> getBookList() {
        return this.books;
    }

    public Book getBook(String decimalNumber) {
        return books.get(decimalNumber);
    }

    public void removeBook(String decimalNumber) {
        books.remove(decimalNumber);
    }


}
