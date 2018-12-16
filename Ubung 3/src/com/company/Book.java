package com.company;

import java.util.Date;

public class Book {
    private String isbn;
    private int pages;
    private Date released;
    private String title;

    public  Book(){}

    public Book(String isbn, int pages, Date released, String title){
        this.isbn = isbn;
        this.pages = pages;
        this.released = released;
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setReleased(Date released) {
        this.released = released;
    }

    public Date getReleased() {
        return released;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}
