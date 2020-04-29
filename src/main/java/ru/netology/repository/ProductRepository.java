package ru.netology.repository;

import ru.netology.domain.Product;
import ru.netology.productManager.ProductManager;

public class ProductRepository {
    private ProductRepository repository;
    private Product[] products = new Product[0];

    public void add(Product item) {
        //этим методом менеджер умеет добавлять
        ProductManager.save(item);
    }

    public Product[] findAll() {
        return products;
    }


}


