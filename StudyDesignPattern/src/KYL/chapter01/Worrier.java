package KYL.chapter01;

public class Worrier implements Character{

  @Override
  public int hp(int changeHP) {
    System.out.println("전사의 피: " + changeHP);
    return changeHP;
  }

  @Override
  public int mp(int changeMP) {
    System.out.println("전사의 마나: " + changeMP);
    return changeMP;
  }

  @Override
  public void equip(Weapon weapon) {
    weapon.equipWeapon();
  }
}
