package com.kishkan91.Items;

public class BookImpl implements  Book {
    String bookName;
    String authorName;
    String decimalNumber;

    public BookImpl (String bookName, String authorName, String decimalNumber){
        this.bookName = bookName;
        this.authorName = authorName;
        this.decimalNumber = decimalNumber;
    }

    public Book createBook(String bookName, String authorName, String decimalNumber) {
        Book book = new BookImpl(bookName, authorName, decimalNumber);
        return book;
    }

}
