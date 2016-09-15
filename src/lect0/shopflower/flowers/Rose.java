package lect0.shopflower.flowers;

import java.util.Objects;

public class Rose extends ColorfulFlower {

    public Rose(Color color, double price) {
        super(color, price);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (!(o instanceof Rose)) {
            return false;
        }
        Rose rose = (Rose) o;

        return Objects.equals();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getColor());
    }

    @Override
    public String toString() {
        return "Rose " + super.toString() + " costs " + getPrice() + " dollar(s)";
    }
}
