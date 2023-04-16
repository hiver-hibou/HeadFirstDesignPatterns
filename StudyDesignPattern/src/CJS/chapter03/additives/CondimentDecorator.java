package CJS.chapter03.additives;

import CJS.chapter03.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();

}
