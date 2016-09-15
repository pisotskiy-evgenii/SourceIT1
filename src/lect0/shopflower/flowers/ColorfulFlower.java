package lect0.shopflower.flowers;


/**
 * Created by Admin on 13.09.2016.
 */
public abstract class ColorfulFlower extends Flower {

    private Color color;

    public ColorfulFlower(Color color, double price) {
        super(price);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color.toString();
    }

}
