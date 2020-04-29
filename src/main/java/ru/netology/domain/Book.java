package ru.netology.domain;

public class Book extends Product {
    private String author;

    public Book() {
        super();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int id, String name, int price, String author) {
        this.author = author;

    }
}
