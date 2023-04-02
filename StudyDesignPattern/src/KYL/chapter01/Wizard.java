package KYL.chapter01;

public class Wizard  implements Character {

  @Override
  public int hp(int changeHP) {
    System.out.println("마법사의 피: " + changeHP);
    return changeHP;
  }

  @Override
  public int mp(int changeMP) {
    System.out.println("마법사의 마나: " + changeMP);
    return changeMP;
  }

  @Override
  public void equip(Weapon weapon) {
    weapon.equipWeapon();
  }
}
