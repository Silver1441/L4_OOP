package com.kishkan91.items;

public class BookImpl implements  Book {
    String bookName;
    String authorName;
    String bookKey;

    public BookImpl (String bookName, String authorName, String bookKey) {
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
