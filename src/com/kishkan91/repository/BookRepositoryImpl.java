package com.kishkan91.repository;

import com.kishkan91.items.Book;
import com.kishkan91.items.BookImpl;

import java.util.Arrays;


public class BookRepositoryImpl implements BookRepository {

    private int libraryLength;

    private Book[] books;  //Item link's holder
    private String[] bookKeys;  //Item Key's holder

    public BookRepositoryImpl(int libraryLength) {
        this.libraryLength = libraryLength;
        books = new Book[libraryLength];
        bookKeys = new String[libraryLength];
    }


    public void addBook (String bookName, String authorName, String bookKey) { //TODO (?)Проверка на уникальность ключа
        for (int i=0; i<libraryLength; i++) {
            if (books[i]==null) {
                books[i] = new BookImpl(bookName, authorName,bookKey);
                bookKeys[i] = bookKey;
                break;
            }
        }
    }


    public Book getBookByKey(String bookKey) {
        Book neededBook=null;
        for (int i=0; i<libraryLength; i++){
            if (bookKeys[i].equals(bookKey)){
                neededBook = books[i];
                break;
            }
        }
        return neededBook;
    }


    public void deleteBookByKey(String bookKey) {
        for (int i=0; i<libraryLength; i++) {
            if (bookKeys[i].equals(bookKey)){
                books[i] = null;
                bookKeys[i] = null;
            }
        }
    }


    public boolean areSlotsFree() {
        boolean areSlotFree=false;
        for (int i=0; i<libraryLength; i++) {
            if (books[i]==null){
                areSlotFree=true;
                break;
            }
        }
        return areSlotFree;
    }

}
