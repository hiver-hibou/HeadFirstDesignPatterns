package CJS.chapter04.store;

import CJS.chapter04.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("mushroom")) {
            return new ChicagoStyleMushroomPizza();
        } else {
            return null;
        }
    }
}
