package KYL.chapter01;

import java.util.SortedMap;

public class StrategyPatternApplication {
  public static void main(String[] args) {
    Character worrier = new Worrier();
    worrier.hp(100);
    worrier.mp(50);
    worrier.equip(new Sword());
    System.out.println("=================");

    Character wizard = new Wizard();
    wizard.hp(70);
    wizard.mp(80);
    wizard.equip(new Staff());
    System.out.println("=================");

    Character worrier2 = new Worrier();
    worrier2.hp(100);
    worrier2.mp(50);
    worrier2.equip(new Staff());
    System.out.println("=================");
  }
}
