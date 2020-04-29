package ru.netology.productManager;

import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

public class ProductManager {
    private ProductManager products = new ProductManager();


    public void save(Product item) {
        int length = products.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(products, 0, tmp, 0, products.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        products = tmp;
    }

    public void removeById(int id) {
        int length = products.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product item : products) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        products = tmp;
    }

    public Product[] searchBy(String text) {
        //этим ищет по тексту
        Product[] result = new Product[0];
        for (Product product : ProductRepository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(product[],0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Product product, String text) {
        if (product instanceof Book) {
            Book book = (Book) product;
            if (((Book) product).getAuthor().equalsIgnoreCase(text)) return true;
            if (product.getName().equalsIgnoreCase(text)) {
                return true;
            }
            if (product instanceof Smartphone) {
                Smartphone Smartphone = (Smartphone) product;
                if (((Smartphone) product).getProducer().equalsIgnoreCase(text)) return true;
                if (product.getName().equalsIgnoreCase(text)) {
                    return true;
                }
                return false;
            }


        }
    }
}



















