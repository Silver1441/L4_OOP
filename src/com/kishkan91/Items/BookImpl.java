package com.kishkan91.Items;

public class BookImpl implements  Book {
    String bookName;
    String authorName;

    public BookImpl (String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

}
