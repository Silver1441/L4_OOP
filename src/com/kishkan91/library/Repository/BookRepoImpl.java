package com.kishkan91.library.Repository;

public class BookRepoImpl implements BookRepo {
    private BookRepoImpl(){
        //lazy
    }

    private static  class SingletonHolder {
        private final static BookRepoImpl instance = new BookRepoImpl();
    }

    public static BookRepoImpl getInstance() {
        return SingletonHolder.instance;
    }
}
