package lect0.shopflower.shop;

import lect0.shopflower.flowers.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ShopFlower {

    private static List<Flower> stock = new ArrayList<>();
    Cursor cursor;
    private Order order;

    public ShopFlower() {
        cursor = new Cursor();
    }

    public void addToStock(Flower flower, int amount) {
        for (int i = 0; i < amount; i++) {
            stock.add(flower);
        }
    }

    public void getListGoods() {
        for (Flower flower : stock) {
            System.out.println(flower);
        }
    }

    public int numberOf(Flower flower) {
        int count = 0;
        Object[] flowers = stock.toArray();
        for (Object tmp : flowers) {
            if (flower.equals /*It had to be overridden*/(tmp)) {
                count++;
            }
        }
        return count;
    }

    public Flower getNextGoods() {
        Iterator<Flower> itr = stock.iterator();
        return itr.next();
    }

    public void addToOrder(Goods goods, Color color, int price, int amount) {
        if (price <= 0 || amount <= 0) {
            System.out.println("Price and amount must be more than 0");
        }
        Flower flower = whatFlower(goods, color, price);

        if (flower == null) {
            System.out.println("Check please, You is likely");
        }
         /*!!!Необходимо переопределить метод equals for  contains(flower) and numberOf(flower)*/
        if (stock.contains(flower) && amount <= numberOf(flower)) {
            order = Order.createOrder(new ArrayList<>());
            order.add(flower, amount);
        } else {
            System.out.println("The " + goods + " is absent");
        }
    }

    private Flower whatFlower(Goods goods, Color color, double price) {
        Flower flower = null;
        switch (goods) {
            case ROSE:
                flower = new Rose(color, price);
                break;
            case TULIP:
                flower = new Tulip(color, price);
                break;
            case CALLA:
                flower = new Calla(price);
                break;
            case CHAMOMILE:
                flower = new Chamomile(price);
                break;
        }
        return flower;
    }

    private class Cursor implements Iterator<Integer> {
        private int currentIndex;
        private int currentSize;

        public Cursor() {
            this.currentSize = ShopFlower.stock.size();
        }

        @Override
        public boolean hasNext() {
            return currentIndex < currentSize;
        }

        @Override
        public Integer next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            return currentIndex++;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }


}
