package KYL.chapter04;

public interface FactoryShipFactory {

  default FactoryShip orderShip(String name, String email) {
    validate(name, email);
    prepareFor(name);
    FactoryShip ship = createShip();
    // notify
    sendEmailTo(email, ship);
    return ship;
  }

  // 반듯이 하위클래스가 정리해줘야하는 메소드로 정의.
  FactoryShip createShip();

  private void validate(String name, String email) {
    // validate
    if (name == null || name.isBlank()) {
      throw new IllegalArgumentException("배이름을 지어주세요");
    }
    if (email == null || email.isBlank()) {
      throw new IllegalArgumentException("연락처를 남겨주세요");
    }
  }

  private void prepareFor(String name) {
    System.out.println(name + "만들 준비 중");
  }

  private void sendEmailTo(String email, FactoryShip ship) {
    System.out.println(ship + "다 만들었습니다. " + email + "로 알림을 보냈습니다.");
  }

}
