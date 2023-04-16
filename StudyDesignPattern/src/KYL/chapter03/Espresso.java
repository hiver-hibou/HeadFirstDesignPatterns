package KYL.chapter03;

// Decorator 적용 X
public class Espresso extends Beverage {

  public Espresso() {
    // Beverage 로 부터 상속 받은 name
    name = "Espresso";
  }

  // Deco 없는 가격
  @Override
  public double costs() {
    return 2.5;
  }
}