package TDD;

import DesignPattern.ObserverPattern.CurrentConditionsDisplay;
import DesignPattern.ObserverPattern.WeatherData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverSelfShunt extends WeatherData {

    @Test
    public void SelfShunt() {
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(this);

        setMeasurements(82.5f,20.1f,50.f);
        setMeasurements(14.5f,17.1f,22.f);
        setMeasurements(50.5f,15.1f,30.f);

        assertEquals(50.5f, getTemperature());
    }
}
