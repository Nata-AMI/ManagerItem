package ru.netology.managerItem;

public class ProductManager {
    private ProductRepository repository;

    public void add(Product item) {
        //этим методом менеджер умеет добавлять
        repository.save(item);
    }

    public Product[] searchBy(String text) {
        //этим ищет по тексту
        Product[] result = new Product[0];
        for (Product product : repository.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                System.arraycopy(product, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Product product, String text) {
        for (Product.Book item: product) {
            if (product instanceof Book) {
                Book book = (Book) product;
                if (product.getName().equalsIgnoreCase(text)) return true;
                if (product.getAuthor().equalsIgnoreCase(text)) {
                    return true;
                }
                return false;
            }
        }

    }
}

















