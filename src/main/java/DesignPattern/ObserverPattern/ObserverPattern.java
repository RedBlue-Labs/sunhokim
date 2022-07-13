package DesignPattern.ObserverPattern;

public class ObserverPattern {
    public void start() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.f);
        weatherData.setMeasurements(82, 70, 29.f);
        weatherData.setMeasurements(78, 90, 36.f);
    }
}
