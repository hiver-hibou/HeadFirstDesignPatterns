package CJS.chapter01;

import CJS.chapter01.behavior.*;
import CJS.chapter01.ducks.Duck;
import CJS.chapter01.ducks.MallardDuck;
import CJS.chapter01.ducks.RedheadDuck;
import CJS.chapter01.ducks.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Duck readheadDuck = new RedheadDuck();
        readheadDuck.setFlyBehavior(new FlyWithWings());
        readheadDuck.setQuackBehavior(new Quack());
        readheadDuck.display();
        readheadDuck.performFly();
        readheadDuck.peformQuack();


        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new MuteQuack());
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.peformQuack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehavior(new FlyNoWay());
        rubberDuck.setQuackBehavior(new Squeak());
        rubberDuck.display();
        rubberDuck.performFly(); //슈퍼 클래스에 fly() 메소드를 추가해버려서 장난감 오리도 날아다니게 됨
        rubberDuck.peformQuack();
    }
}
