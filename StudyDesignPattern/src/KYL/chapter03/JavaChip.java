package KYL.chapter03;

// 나는 자바칩 데코가 짱좋아!
public class JavaChip extends BeverageDecorator{
  Beverage beverage;

  public JavaChip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double costs() {
    return 0.8 + beverage.costs();
  }

  @Override
  public String getName() {
    return beverage.getName() + " + Java Chip";
  }
}