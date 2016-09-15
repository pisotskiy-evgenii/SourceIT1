package lect0.shopflower.flowers;

import java.util.Objects;

public class Tulip extends ColorfulFlower {

    public Tulip(Color color, double price) {
        super(color, price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getColor());
    }

    @Override
    public String toString() {
        return "Tulip " + super.toString() + " costs " + getPrice() + " dollar(s)";
    }

}
