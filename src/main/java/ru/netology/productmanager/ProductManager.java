package ru.netology.productmanager;

import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

public class ProductManager {
    public class ProductManager {
        private ProductRepository repository;

        public ProductManager(ProductRepository repository) {
            this.repository = repository;
        }

        public Product[] searchBy(String text) {
            Product[] result = new Product[0];
            for (Product product : repository.findAll()) {
                if (matches(product, text)) {
                    Product[] tmp = new Product[result.length + 1];
                    Product[] products = new Product[0];
                    System.arraycopy(products, 0, tmp, 0, result.length);
                    tmp[tmp.length - 1] = product;
                    result = tmp;
                }
            }
            return result;
        }

        public boolean matches(Product product, String text) {
            if (product instanceof Book) {
                Book book = (Book) product;
                if (book.getAuthor().equalsIgnoreCase(text)) {
                    return true;
                }
                if (book.getName().equalsIgnoreCase(text)) {
                    return true;
                }
            }
            if (product instanceof Smartphone) {
                Smartphone smartphone = (Smartphone) product;
                if (smartphone.getProducer().equalsIgnoreCase(text)) {
                    return true;
                }

                if (smartphone.getName().equalsIgnoreCase(text)) {
                    return true;
                }
            }
            return false;
        }
    }
}






















