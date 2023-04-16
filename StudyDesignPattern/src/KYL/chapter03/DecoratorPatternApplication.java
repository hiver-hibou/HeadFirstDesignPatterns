package KYL.chapter03;
/**
 * 1.어떤 상황에 이 패턴을 이용할지
 * - 기존 객체들에게 영향을 주지 않고 개별 객체에 기능들을 추가하고 싶을때 사용!
 * - 상속을 사용하여 기능을 확장하는 것이 힘들 경우에 사용!
 * 2.예시
 * 3.장단점
 * - 객체에 추가적인 것을 동적으로 첨가해준다. 데코레이터는 서브클래스를 만드는 것을 통해서 기능을 유연하게 확장할 수 있는 방법을 제공!
 * - 구성요소를 초기화 하는 코드가 너~무 복잡해진다. (Client 부분)
 */
public class DecoratorPatternApplication {
  public static void main(String[] args) {

    // Deco 없이 에스프레소만 주문해보기!
    Beverage beverage = new Espresso();
    System.out.println(beverage.getName() + " $" + beverage.costs());

    // 우유랑 자바칩 추가
    Beverage beverage1 = new Frappuccino();
    beverage1 = new Milk(beverage1);
    beverage1 = new JavaChip(beverage1);

    System.out.println(beverage1.getName() + ", $" + beverage1.costs());
  }
}