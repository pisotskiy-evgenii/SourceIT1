package lect0.shopflower.flowers;


public class Calla extends Flower {

    public Calla(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Calla costs " + getPrice() + " dollar(s)";
    }
}
