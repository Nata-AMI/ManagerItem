package ru.netology.domain;

import ru.netology.productmanager.ProductManager;

public class Smartphone extends Product {
    private String producer;


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Smartphone(int id, String name, int price, String producer) {
        super(id, name, price);
        this.producer = producer;
    }
    public boolean matches(String search) {
        return super.matches(search) || ProductManager.searchBy("Producer");
    }

}
