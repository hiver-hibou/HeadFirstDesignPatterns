package CJS.chapter04.ingredient;

import CJS.chapter04.ingredient.Dough;

public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();
}
