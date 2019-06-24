package com.kishkan91.repository;

import com.kishkan91.items.Book;
import com.kishkan91.items.BookImpl;

import java.util.Arrays;


public class BookRepositoryImpl implements BookRepository {

    private int libraryLength;

    private Book[] books;  //Item link's holder
    private String[] bookKeys;  //Item Key's holder
    private boolean[] isTaken;  //Token holder

    public BookRepositoryImpl(int libraryLength) {
        this.libraryLength = libraryLength;
        books = new Book[libraryLength];
        bookKeys = new String[libraryLength];
        isTaken = new boolean[libraryLength];
        Arrays.fill(isTaken, Boolean.FALSE);
    }

    public void addBook (String bookName, String authorName, String bookKey) {
        for (int i=0; i<libraryLength; i++) {
            if (isTaken[i]==false) {
                books[i] = new BookImpl(bookName, authorName,bookKey);
                bookKeys[i] = bookKey;
                isTaken[i] = true;
                break;
            }
        }
    }

    public Book getBookByKey(String bookKey) {
        Book neededBook=null;
        for (int i=0; i<libraryLength; i++){
            if (bookKeys[i]==bookKey){
                neededBook = books[i];
                break;
            }
        }
        return neededBook;
    }

}
