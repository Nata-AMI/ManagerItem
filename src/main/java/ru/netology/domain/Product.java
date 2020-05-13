package ru.netology.domain;

import ru.netology.repository.ProductRepository;

import java.util.Objects;

public class Product {
    private int id;
    private String name;
    private int price;

          public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean matches(String search) {
        Product[] result = new Product[0];
        for (Product product : ProductRepository.findAll()) {
              if (matches(name)){
                  Product[] tmp = new Product[result.length + 1];
                  System.arraycopy(result, 0, tmp, 0, result.length);
                  tmp[tmp.length - 1] = product;
                   result = tmp;
        }
    }
            return result;
}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                price == product.price &&
                name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
}
