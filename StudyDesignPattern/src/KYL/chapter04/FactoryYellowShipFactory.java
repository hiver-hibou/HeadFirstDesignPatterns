package KYL.chapter04;

public class FactoryYellowShipFactory implements FactoryShipFactory {

  @Override
  public FactoryShip createShip() {
    return new FactoryYellowShip();
  }
}
