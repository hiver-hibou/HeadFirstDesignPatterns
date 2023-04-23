package KYL.chapter02;

import java.util.ArrayList;

public class WeatherData implements Subject {
  private ArrayList<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  // Observer 객체를 저장하기 위해 ArrayList를 생성자에서 생성한다.
  public WeatherData() {
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }

  // 모든 옵저버들이 가지고 있는 update() 메소드를 이용하여 옵저버들에게 상태를 갱신
  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  // 기상 스테이션으로부터 갱신된 측정치를 받으면 옵저버들에게 알리는 notifyObservers()를 호출한다
  public void measurementsChanged() {
    notifyObservers();
  }

  // 기상 스테이션으로부터 갱신된 측정치를 받아 갱신 후, measurementsChanged() 호출
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}