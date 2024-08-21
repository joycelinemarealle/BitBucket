package com.elevate.library;

public class Book {
    private int id;
    private String title;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    private String author;

    protected Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}
