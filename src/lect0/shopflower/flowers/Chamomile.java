package lect0.shopflower.flowers;

import java.util.Objects;

/**
 * Created by Admin on 13.09.2016.
 */
public class Chamomile extends Flower {

    public Chamomile(double price) {
        super(price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice());
    }

    @Override
    public String toString() {
        return "Chamomile costs " + getPrice() + " dollar(s)";
    }
}
