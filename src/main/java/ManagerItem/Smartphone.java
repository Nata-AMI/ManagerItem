package ManagerItem;

public class Smartphone extends Product {
    private String producer;

    public Smartphone (){
        super();
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Smartphone(String producer) {
        this.producer = producer;
    }

}

