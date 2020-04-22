package ManagerItem;

import org.junit.jupiter.api.Test;

import static java.util.regex.Pattern.matches;


class ProductManagerTest {
    private ProductRepository repository=new ProductRepository();
    private Book Shakespire = new Book();

    @Test
    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product: repository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                // используйте System.arraycopy, чтобы скопировать всё из result в tmp
                tmp[tmp.length - 1] = product;
                result = tmp;

            }
        }
        return result;
    }


}