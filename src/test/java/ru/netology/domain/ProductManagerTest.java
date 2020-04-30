package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.repository.ProductRepository;

import static java.util.regex.Pattern.matches;


class ProductManagerTest {
    private ProductRepository repository=new ProductRepository();
    private Book shakespire = new Book();

    @Test
    public void shouldSearchIfExist() {
        matches(productmanager.searchBy(shakespire), shakespire);

    }


}