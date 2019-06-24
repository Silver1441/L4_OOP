package com.kishkan91.repository;

import com.kishkan91.items.Book;


public interface BookRepository {

    public void addBook (String bookName, String authorName, String bookKey);
    public Book getBookByKey(String bookKey);
    public void deleteBookByKey(String bookKey);
    public boolean areSlotsFree();

}
