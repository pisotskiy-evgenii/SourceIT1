package lect0.shopflower.shop;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Admin on 13.09.2016.
 */
public class Sale implements Iterator<Integer> {
    private int cursor;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int current = cursor;
        cursor++;
        return current;
    }

    @Override
    public void remove() {

    }
}
