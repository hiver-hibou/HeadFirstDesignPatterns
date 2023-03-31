package CJS.chapter01;

public abstract class Duck {
    public void quack(){
        System.out.println("꽥꽥");
    }

    public void swim() {
        System.out.println("첨벙첨벙");
    }

    public abstract void display();

    public void fly() {
        System.out.println("훨훨");
    }
}
