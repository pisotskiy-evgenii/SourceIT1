package lect0.shopflower.flowers;


import java.util.Objects;

public class Calla extends Flower {

    public Calla(double price) {
        super(price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice());
    }

    @Override
    public String toString() {
        return "Calla costs " + getPrice() + " dollar(s)";
    }
}
