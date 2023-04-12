package CJS.chapter02;

import CJS.chapter02.observers.CurrentConditionsDisplay;
import CJS.chapter02.observers.ForecastDisplay;
import CJS.chapter02.observers.StatisticsDisplay;
import CJS.chapter02.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(31, 77, 21.4f);
        weatherData.setMeasurements(28.8f, 65, 30.4f);
        weatherData.setMeasurements(35, 87, 30.4f);
    }
}
