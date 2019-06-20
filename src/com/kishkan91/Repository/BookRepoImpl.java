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
