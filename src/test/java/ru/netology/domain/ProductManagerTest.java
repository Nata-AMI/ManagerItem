package ru.netology.domain;

import ru.netology.exception.NotFoundException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.netology.productmanager.ProductManager;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertThrows;


class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);

    private Book book1 = new Book(1, "Book1", 1, "Author1");
    private Book book2 = new Book(2, "Book2", 2, "Author2");
    private Book book3 = new Book(3, "Book3", 3, "Author3");
    private Smartphone smartphone1 = new Smartphone(4, "Smart1", 1, "Producer1");
    private Smartphone smartphone2 = new Smartphone(5, "Smart2", 2, "Producer2");
    private Smartphone smartphone3 = new Smartphone(6, "Smart3", 3, "Producer3");

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

        Product[] products = manager.searchBy("Author3");
        Assert.assertArrayEquals(new Product[]{book3}, products);
    }

    @Test
    public void shouldRemoveByIdBook() {
        repository.save(book1);
        repository.save(book2);
        repository.save(book3);

        Product[] products = repository.removeById(7);
        Assert.assertArrayEquals(new Product[]{0}, products);

    }

    @Test
    public void shouldSearchByProducer() {
        repository.save(smartphone1);
        repository.save(smartphone2);
        repository.save(smartphone3);

        Product[] products = manager.searchBy("Producer2");
        Assert.assertArrayEquals(new Product[]{smartphone2}, products);
    }

    @Test
    public void shouldRemoveByIdSmartphone() {
        repository.save(smartphone1);
        repository.save(smartphone2);
        repository.save(smartphone3);

        Product[] products = repository.removeById(4);
        Assert.assertArrayEquals(new Product[]{smartphone1}, products);
    }

    @Test
    public void shouldRemoveByIdIfNoExist() {
        repository.save(smartphone1);
        repository.save(smartphone2);
        repository.save(smartphone3);

         assertThrows(NotFoundException.class, () -> repository.removeById(7));

    }
}
