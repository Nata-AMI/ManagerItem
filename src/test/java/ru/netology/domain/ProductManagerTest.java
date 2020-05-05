package ru.netology.domain;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.netology.productmanager.ProductManager;
import ru.netology.repository.ProductRepository;



class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);

    private Book book1 = new Book(1, "Book1", 1, "Author1");
    private Book book2 = new Book(2, "Book2", 2, "Author2");
    private Book book3 = new Book(3, "Book3", 3, "Author3");

    @Test
    public void shouldSearchIfExist() {
        repository.save(book1);
        repository.save(book2);
        repository.save(book3);

        Product[] products = manager.searchBy("Book1");
        Assert.assertArrayEquals(new Product[]{book1}, products);
    }
    @Test
    public void shouldSearchByAuthor() {
        repository.save(book1);
        repository.save(book2);
        repository.save(book3);

        Product[] products = manager.matches(Book, "Author3");
        Assert.assertArrayEquals(new Product[]{book3}, products);
    }
}