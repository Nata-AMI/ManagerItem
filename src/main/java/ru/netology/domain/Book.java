package ru.netology.domain;

import ru.netology.productmanager.ProductManager;

public class Book extends Product {
    private String author;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;

    }

    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        } else {
            return this.getAuthor().equalsIgnoreCase(search);
        }
    }
}
