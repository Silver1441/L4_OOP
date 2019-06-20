package com.kishkan91.library.Repository;

import com.kishkan91.library.Items.Book;

import java.util.ArrayList;

public class BookRepoImpl implements BookRepo {
    private static BookRepoImpl instance;
    private ArrayList<Book> bookItems = new ArrayList<>();

    private BookRepoImpl(){
    }

    public static BookRepoImpl getInstance() {
        if (instance == null) {
            instance = new BookRepoImpl();
        }
        return instance;
    }

    public ArrayList<Book> getBooks(){
        return this.bookItems;
    }

    public void addBook (Book book){
        this.bookItems.add(book);
    }
}
