package KYL.chapter03;

public class Milk extends BeverageDecorator {
  // 데코레이션 할 음료를 저장하기 위한 인스턴스 변수
  Beverage beverage;

  // 생성자를 통해 데코레이션 할 음료객체를 전달
  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double costs() {
    // 음료 가격에 우유요금 추가
    return 0.5 + beverage.costs();
  }

  // 어떤걸 데코했는지 설명란
  @Override
  public String getName() {
    return beverage.getName() + " + Milk";
  }
}