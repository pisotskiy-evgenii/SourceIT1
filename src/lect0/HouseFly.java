package lect0;

/**
 * Created by Admin on 09.09.2016.
 */
public class HouseFly extends Fly {
    @Override
    public void fly() {
        System.out.println("I live in a House");
    }

    @Override
    public void bite() {
        System.out.println("A can't bite");

    }
}
