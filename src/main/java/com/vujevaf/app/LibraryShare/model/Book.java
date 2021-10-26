package com.vujevaf.app.LibraryShare.model;

import java.util.UUID;

public class Book {

    private final UUID id;
    private final String title;
    private final Integer year;
    private Integer counter;
    private final String author;

    private Integer numBooks;

    public Book(UUID id, String title, Integer year, String author) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.counter = 0;
        this.author = author;
    }

    public Book(UUID id, String bookName){
        this.id = id;
        this.title = bookName;
        this.year = 2000;
        this.counter = 0;
        this.author = "Unknown";
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter++;
    }


    public String getAuthor() {
        return author;
    }

    public Integer getNumBooks() {
        return numBooks;
    }

    public void setNumBooks(Integer numBooks) {
        this.numBooks = numBooks;
    }
}
