package com.kishkan91.library.Repository;

import com.kishkan91.library.Items.Book;

import java.util.ArrayList;

public interface BookRepo {
    ArrayList<Book> bookItems = new ArrayList<>();
    public ArrayList<Book> getBooks();
    public void addBook (Book book);
    //public void removeBookByName (String bookName);
}
