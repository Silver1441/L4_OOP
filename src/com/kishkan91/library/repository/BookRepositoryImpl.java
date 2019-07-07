package com.kishkan91.library.repository;

import com.kishkan91.library.entities.Book;

public class BookRepositoryImpl implements Repository {
    private Book[] books;

    public BookRepositoryImpl(int libraryLength) {
        books = new Book[libraryLength];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public Book getBookByKey(String bookKey) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookKey().equals(bookKey)) {
                return books[i];
            }
        }
        return null;
    }

    public void deleteBookByKey(String bookKey) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookKey().equals(bookKey)) {
                books[i] = null;
            }
        }
    }

    public boolean areSlotsFree() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                return true;
            }
        }
        return false;
    }

}
