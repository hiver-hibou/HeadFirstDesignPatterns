package KYL.chapter04;

import lombok.Data;

@Data
public class FactoryShip {

  private String name;
  private String logo;
  private String color;

  public void setAnchor(YellowAnchor yellowAnchor) {

  }

  public void setWheel(YellowWheel yellowWheel) {

  }
}
