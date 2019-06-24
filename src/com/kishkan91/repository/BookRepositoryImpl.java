package com.kishkan91.repository;

import com.kishkan91.items.Book;
import com.kishkan91.items.BookImpl;

import java.util.Arrays;


public class BookRepositoryImpl implements BookRepository {

    private int libraryLength;

    private Book[] books;  //Item link's holder
    private String[] bookKeys;  //Item Key's holder
    private boolean[] isEmpty;  //Tag holder

    public BookRepositoryImpl(int libraryLength) {
        this.libraryLength = libraryLength;
        books = new Book[libraryLength];
        bookKeys = new String[libraryLength];
        isEmpty = new boolean[libraryLength];
        Arrays.fill(isEmpty, Boolean.TRUE);
    }


    public void addBook (String bookName, String authorName, String bookKey) { //TODO (?)Проверка на уникальность ключа
        for (int i=0; i<libraryLength; i++) {
            if (isEmpty[i]==true) {
                books[i] = new BookImpl(bookName, authorName,bookKey);
                bookKeys[i] = bookKey;
                isEmpty[i] = false;
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


    public void deleteBookByKey(String bookKey) {
        for (int i=0; i<libraryLength; i++) {
            if (bookKeys[i]==bookKey){
                books[i] = null;
                bookKeys[i] = null;
                isEmpty[i] = true;
            }
        }
    }


    public boolean areSlotsFree() {
        boolean isTrue=false;
        for (int i=0; i<libraryLength; i++) {
            if (isEmpty[i]==true){
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }

}
