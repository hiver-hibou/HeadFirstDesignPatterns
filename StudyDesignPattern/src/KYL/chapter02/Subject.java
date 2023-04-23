package KYL.chapter02;


public interface Subject {
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  // Subject 객체의 상태가 변경되었을 때 모든 옵저버들에게 알리기위해 호출되는 메소드
  public void notifyObservers();
}