package KYL.chapter04;

public class FactoryClient {
  public static void main(String[] args) {
    FactoryClient client = new FactoryClient();
    client.print(new FactoryYellowShipFactory(), "yellowShip", "limlim@mail.com");
    client.print(new FactoryBlackShipFactory(), "blackShip", "hello@mail.com");
  }

  private void print(FactoryShipFactory shipFactory, String name, String email) {
    System.out.println(shipFactory.orderShip(name, email));
  }

}
