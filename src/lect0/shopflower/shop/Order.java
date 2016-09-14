package lect0.shopflower.shop;


import lect0.shopflower.flowers.Flower;

import java.util.List;

/**
 * Singleton
 */
public class Order {

    private static Order order;
    private List<Flower> flowers;

    private Order(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public static Order createOrder(List<Flower> flowers) {
        if (order == null) {
            order = new Order(flowers);
            return order;
        }
        return order;
    }

    public void add(Flower flower, int amount) {
        for (int i = 0; i < amount; i++) {
            flowers.add(flower);
        }

    }
}
