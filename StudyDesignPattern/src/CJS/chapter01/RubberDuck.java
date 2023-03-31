package CJS.chapter01;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("나는야 장난감 오리");
    }

    @Override
    public void quack() {
        System.out.println("삑삑");
    }
}
