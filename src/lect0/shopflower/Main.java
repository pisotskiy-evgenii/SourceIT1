package lect0.shopflower;

import lect0.shopflower.flowers.*;
import lect0.shopflower.shop.Goods;
import lect0.shopflower.shop.ShopFlower;

/*
 * 1) Определить иерархию цветов. Собрать букет с определением его стоимости.
 */
public class Main {

    public static void main(String[] args) {

        ShopFlower shop = new ShopFlower();
        shop.addToStock(new Rose(Color.WHITE, 9.75), 1);
        shop.addToStock(new Tulip(Color.PURPLE, 5.55), 3);
        shop.addToStock(new Calla(7.65), 1);
        shop.addToStock(new Chamomile(3.45), 3);

        System.out.println("Hello, What flowers would you like to buy:");
        shop.getListGoods();

        shop.addToOrder(Goods.ROSE, Color.WHITE, 1);


        System.out.println();


    }
}
