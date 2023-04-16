package KYL.chapter03;

// 음료의 공통적인 성질을 따로 뺀 것으로 카페에서 판매하는 모든 음료는 이 클래스를 상속 받아햐 한다.
public abstract class Beverage {
  protected String name;

  public String getName() {
    return name;
  }
  public abstract double costs();
}