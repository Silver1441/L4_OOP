package com.kishkan91.repository;


import com.kishkan91.entities.Book;

public interface Repository {

    public void addBook (Book book);
    public Book getBookByKey(String bookKey);
    public void deleteBookByKey(String bookKey);
    public boolean areSlotsFree();

}
