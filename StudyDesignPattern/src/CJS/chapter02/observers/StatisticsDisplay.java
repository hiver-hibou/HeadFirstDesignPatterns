package CJS.chapter02.observers;

import CJS.chapter02.interfaces.DisplayElement;
import CJS.chapter02.interfaces.Observer;
import CJS.chapter02.subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float totalTemp = 0.0f;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private int count;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("[온도] 평균 / 최대 / 최저 : " +
                (totalTemp / count) + " / " + maxTemp + " / " + minTemp);
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        totalTemp += temperature;
        count++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }
        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }
}
