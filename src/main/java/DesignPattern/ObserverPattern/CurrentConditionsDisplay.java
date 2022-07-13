package DesignPattern.ObserverPattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private String logMessage;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        logMessage = String.format("현재 온도 상태: 온도 : %f F, 습도: %f", temperature, humidity);

        System.out.println(logMessage);
    }

    public String getLogMessage() {
        return logMessage;
    }
}
