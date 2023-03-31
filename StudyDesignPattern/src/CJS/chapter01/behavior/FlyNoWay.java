package CJS.chapter01.behavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("사실 난 날 수 없어요.");
    }
}
