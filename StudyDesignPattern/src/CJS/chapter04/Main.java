package CJS.chapter04;

import CJS.chapter04.pizza.Pizza;
import CJS.chapter04.store.ChicagoPizzaStore;
import CJS.chapter04.store.NYStylePizzaStore;
import CJS.chapter04.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("내가 주문한 피자 : " + pizza1.getName());

        Pizza pizza2 = chicagoStore.orderPizza("mushroom");
        System.out.println("엄마가 주문한 피자 : " + pizza2.getName());
    }
}
