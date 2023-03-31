package CJS.chapter01.behavior;

import CJS.chapter01.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("나는 날개로 훨훨 날아요!");
    }
}
