package com.exemple.java;

public class Reading {
    private ReadingList readingList;

    public Reading() {
        this.readingList = new ReadingDB();
    }

    public ReadingList getReadingList() {
        return readingList;
    }

    public void setReadingList(ReadingList readingList) {
        this.readingList = readingList;
    }
}
