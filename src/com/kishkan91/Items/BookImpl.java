package com.kishkan91.Items;

public class BookImpl implements  Book {
    String bookName;
    String authorName;
    int decimalNumber;

    public BookImpl (String bookName, String authorName, int decimalNumber){
        this.bookName = bookName;
        this.authorName = authorName;
        this.decimalNumber = decimalNumber;
    }
}
