package com.kishkan91.library.entities;

public class Book {
    private String bookName;
    private String authorName;
    private String bookKey;

    public Book(String bookName, String authorName, String bookKey) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookKey = bookKey;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getBookKey() {
        return this.bookKey;
    }

}
