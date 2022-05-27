package com.examples.designpatterns.observer;


import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void testObserver() {
        // todo: to view the result watch the output console

        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver weatherObserver = new WeatherObserver(weatherStation);
        weatherStation.setHumidity(100);
        weatherStation.setPressure(200);
        weatherStation.setTemperature(300);

    }
}
