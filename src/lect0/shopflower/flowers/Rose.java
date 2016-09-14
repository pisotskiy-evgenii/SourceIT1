package lect0.shopflower.flowers;

public class Rose extends ColorfulFlower {

    public Rose(double price, Color color) {
        super(price, color);
    }

    @Override
    public String toString() {
        return "Rose " + super.toString() + " costs " + getPrice() + " dollar(s)";
    }
}
