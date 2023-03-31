package CJS.chapter01;

public class Main {
    public static void main(String[] args) {
        Duck readheadDuck = new RedheadDuck();
        readheadDuck.display();
        readheadDuck.fly();
        readheadDuck.quack();


        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.fly();
        mallardDuck.quack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.fly(); //슈퍼 클래스에 fly() 메소드를 추가해버려서 장난감 오리도 날아다니게 됨
        rubberDuck.quack();
    }
}
