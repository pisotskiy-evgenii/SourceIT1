package lect0.shopflower.shop;

import lect0.shopflower.flowers.Color;
import lect0.shopflower.flowers.Flower;
import lect0.shopflower.flowers.Rose;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Admin on 12.09.2016.
 */
public class ShopFlower {

    private Sale sale;
    private Map<Flower, Double> stock = new HashMap<>();
    private Order order;


    public ShopFlower() {

    }

    public void addToStock(Flower flower, int amount) {
        for (int i = 0; i < amount; i++) {
            stock.put(flower, flower.getPrice());
        }
    }

    public void getListGoods() {
        Set<Flower> setFlower = stock.keySet();
        for (Flower flower : setFlower) {
            System.out.println(flower);
        }
    }

    public void addToOrder(Goods goods, Color color, int amount) {
        Flower flower = // преобразовать входящие параметры в товар


        // возможно для правильной работы contains нужно будет написать методв equals для цветов
        if (stock.contains(flower)) {
            order = Order.createOrder(new ArrayList<>());
            order.add(flower, amount);
        }
    }

    private Flower getFlower(Goods goods, Color color) {
        switch (goods) {
            case ROSE:

                Rose rose = new Rose(, color);

                return rose;

        }
    }


//    public String getPurchase (){
//        this.purchase = Purchase.createPurchase();
//        return "Your purchase: " +
//                "";
//    }

}
