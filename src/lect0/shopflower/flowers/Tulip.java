package lect0.shopflower.flowers;

public class Tulip extends ColorfulFlower {

    public Tulip(double price, Color color) {
        super(price, color);
    }

    @Override
    public String toString() {
        return "Tulip " + super.toString() + " costs " + getPrice() + " dollar(s)";
    }

}
