package ru.netology.managerItem;

public class ProductRepository {
    private Product[] products = new Product[0];


    public Product[] findAll() {
        return products;
    }

    public void removeById(int id) {
        this.id = id;
    }
}


