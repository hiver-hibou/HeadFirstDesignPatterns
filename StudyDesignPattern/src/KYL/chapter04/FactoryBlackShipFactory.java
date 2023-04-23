package KYL.chapter04;

public class FactoryBlackShipFactory implements FactoryShipFactory {
  @Override
  public FactoryShip createShip() {
    return new FactoryBlackShip();
  }
}
