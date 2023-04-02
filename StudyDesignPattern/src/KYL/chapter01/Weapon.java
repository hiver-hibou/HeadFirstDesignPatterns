package KYL.chapter01;

public class Weapon {
  /**
   * 1.어떤 상황에 이 패턴을 이용할지
   * - 구현된 알고리즘은 다르지만 동일한 목적을 지닌 클래스들이 존재할 때 사용한다.
   * 2.예시
   * 3.장단점
   * - 기존 클래스의 코드 변경 없이 새로운 전략을 추가할 수 있다.
   * - 코드 중복을 방지할 수 있다.
   * - 많은 객체를 생성해야한다...
   */


  void equipWeapon() {
    System.out.println("무기 장착!!");
  }
}
