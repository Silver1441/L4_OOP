package com.kishkan91.customArray;

public class LibraryArray<T> {
    private T val;
    private int length;
    private int slotTaken=0;

    public LibraryArray(T val, int length) {
        this.val = val;
        this.length = length;
    }

    private Object[] libraryArray = new Object[length];
    private String[] keyHolder = new String[length];

    public void addItem(T item, String key) {
        libraryArray[slotTaken] = item;
        keyHolder[slotTaken] = key;
        this.slotTaken = slotTaken+1;
    }



}
