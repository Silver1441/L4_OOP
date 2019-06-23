package com.kishkan91.items;

public class BookImpl implements  Book {
    String bookName;
    String authorName;

    public BookImpl (String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getBookName() {
        return this.bookName;
    }
    public String getAuthorName() {
        return this.authorName;
    }

}
