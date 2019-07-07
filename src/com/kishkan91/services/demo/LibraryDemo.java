package com.kishkan91.services.demo;

import com.kishkan91.library.entities.Book;
import com.kishkan91.library.repository.Repository;

public class LibraryDemo implements DemoService {
    Repository bookRepository;

    public LibraryDemo(Repository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void makeTest() {
        bookRepository.addBook(new Book("Дюна", "Ф.Герберт", "АА001"));
        bookRepository.addBook(new Book("8k14", "Отд.001", "АА002"));
        bookRepository.addBook(new Book("Стража Стража", "Т.Пратчетт", "АА003"));
        bookRepository.addBook(new Book("This will not be added", "This will not be added", "This will not be added"));
        System.out.println("  Список книг добавленных в репозиторий:");
        System.out.println(bookRepository.getBookByKey("АА001").getAuthorName() + ": " +
                bookRepository.getBookByKey("АА001").getBookName());
        System.out.println(bookRepository.getBookByKey("АА002").getAuthorName() + ": " +
                bookRepository.getBookByKey("АА002").getBookName());
        System.out.println(bookRepository.getBookByKey("АА003").getAuthorName() + ": " +
                bookRepository.getBookByKey("АА003").getBookName());
        System.out.println("Наличие свободого места в репозитории: " + bookRepository.isThereFreeSlot());

        Book book = bookRepository.getBookByKey("АА002");
        bookRepository.deleteBookByKey("АА002");
        System.out.println();
        System.out.println("  Удаление книги:");
        System.out.println(book.getAuthorName() + ": " + book.getBookName());
        System.out.println("Наличие свободого места в репозитории: " + bookRepository.isThereFreeSlot());

        bookRepository.addBook(new Book("Гарри Поттер", "Д.Роулинг", "АБ001"));
        System.out.println();
        System.out.println("  Добавлена книга:");
        System.out.println(bookRepository.getBookByKey("АБ001").getAuthorName() + ": " +
                bookRepository.getBookByKey("АБ001").getBookName());
        System.out.println("Наличие свободого места в репозитории: " + bookRepository.isThereFreeSlot());

    }


}
