package CJS.chapter01.ducks;

import CJS.chapter01.behavior.FlyWithWings;
import CJS.chapter01.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("나는야 청둥오리");
    }
}
