package lect0.shopflower.flowers;


public abstract class Flower {

    private double price;

    public Flower(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
