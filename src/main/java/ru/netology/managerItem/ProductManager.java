package ru.netology.managerItem;

public class ProductManager {

    private Product[] products;

    public void Product[] getProducts() {
        repository.findAll();
    }


    public Product[] searchBy(String text) {

    }

     public boolean matches(Product product, String search) {

     }



    public boolean searchBy(String text) {
        Product product = new Book();
        if (product instanceof Book) {
            Book book = (Book) product;
            if (book.getName().equalsIgnoreCase(searchBy())) {
                return true;
            }
            return book.getAuthor().equalsIgnoreCase(searchBy());
        }
        if (product instanceof Smartphone) {
            Smartphone smartphone = Smartphone product;
            if (smartphone.getName().equalsIgnoreCase(searchBy())) {
                return true;
            }
            if (smartphone.getProducer().equalsIgnoreCase(searchBy())) {
                return true;
            }
            return false;
        }
    }


}











