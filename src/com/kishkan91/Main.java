package com.kishkan91;

import com.kishkan91.Handlers.LibraryHandler;
import com.kishkan91.Handlers.LibraryHandlerImpl;
import com.kishkan91.Items.Book;
import com.kishkan91.Items.BookImpl;
import com.kishkan91.Repository.BookRepo;
import com.kishkan91.Repository.BookRepoImpl;

public class Main {

    public static void main(String[] args) {
        //     ------1) Библиотека
        BookRepo bookRepo = BookRepoImpl.getInstance();
        LibraryHandler libraryHandler = new LibraryHandlerImpl(bookRepo);

        /* //Проверка добавления и удаления книг
        libraryHandler.addBook(new BookImpl("Гарри Поттер и всякие штуки", "Д.К.Роулинг"), "AA001");
        libraryHandler.addBook(new BookImpl("Гарри Поттер и другие штуки", "Д.К.Роулинг"), "AA002");
        libraryHandler.addBook(new BookImpl("Что-то про попаданцев", "Васильев"), "AA003");
        libraryHandler.addBook(new BookImpl("ТТХ ракеты 8к14", "Отдел№01"), "AA004");
        System.out.println(libraryHandler.getBookList());

        libraryHandler.removeBook("AA002");
        System.out.println(libraryHandler.getBookList());
        */


        /* //Проверка поиска книги по ключу
        Book testBook = libraryHandler.getBook("AA001");
        System.out.println(testBook.getBookName());
        */


        /* //Проверка ограничения размера массива в 20 элементов
        for (int i=5; i<25; i++) {
            String  bookName = "book number " + i;
            String  authorName = "author number " + i;
            String  decimal = "AA00" + i;
            libraryHandler.addBook(new BookImpl(bookName, authorName), decimal);
        }
        System.out.println(libraryHandler.getBookList());
        */

    }
}
