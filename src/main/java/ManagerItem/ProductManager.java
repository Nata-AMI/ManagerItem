package ManagerItem;

public class ProductManager {
    private Product[] products;

    public Product[] getProducts() {
        return null;

        public Product[] searchBy(String text) {
            // ваш код
        }

        public boolean matches(Product product, String search) {
            // ваш код
        }

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
            Smartphone smartphone = (Smartphone) product;
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











