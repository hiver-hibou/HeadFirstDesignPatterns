package CJS.chapter04.store;

import CJS.chapter04.pizza.NYStyleCheesePizza;
import CJS.chapter04.pizza.NYStyleMushroomPizza;
import CJS.chapter04.pizza.NYStyleVeggiePizza;
import CJS.chapter04.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("mushroom")) {
            return new NYStyleMushroomPizza();
        } else {
            return null;
        }
    }
}
