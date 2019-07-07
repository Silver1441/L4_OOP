package com.kishkan91.library.repository;

import com.kishkan91.library.entities.Book;

public interface Repository {
    void addBook(Book book);

    Book getBookByKey(String bookKey);

    void deleteBookByKey(String bookKey);

    boolean areSlotsFree();

}
