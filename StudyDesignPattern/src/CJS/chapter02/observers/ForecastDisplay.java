package CJS.chapter02.observers;

import CJS.chapter02.interfaces.DisplayElement;
import CJS.chapter02.interfaces.Observer;
import CJS.chapter02.subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.print("[기상 예보] ");

        if (currentPressure > lastPressure) {
            System.out.print("날씨 기존보다 맑고 화창할 것으로 예상됩니다. ");
        } else if (currentPressure < lastPressure) {
            System.out.print("날씨 기존보다 흐리고 비소식이 있습니다. 주의부탁드립니다. ");
        } else {
            System.out.print("날씨 기존과 동일할 것으로 예상됩니다. ");
        }
        System.out.println("날씨 였습니다.");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }
}
