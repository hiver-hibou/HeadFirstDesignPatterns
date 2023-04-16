package CJS.chapter03;

import CJS.chapter03.additives.Mocha;
import CJS.chapter03.additives.Soy;
import CJS.chapter03.additives.Whip;
import CJS.chapter03.beverages.Beverage;
import CJS.chapter03.beverages.DarkRoast;
import CJS.chapter03.beverages.Decaf;
import CJS.chapter03.beverages.Espresso;

public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new Decaf();
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
