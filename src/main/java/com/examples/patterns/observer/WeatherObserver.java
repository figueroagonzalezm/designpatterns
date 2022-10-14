package com.examples.patterns.observer;

public class WeatherObserver implements Observer {
    private int humidity;
    private int temperature;
    private int pressure;

    private Subject subject;

    public WeatherObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(int temperature, int pressure, int humidity) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;

        displayData();
    }

    private void displayData() {
        System.out.println("Data changed temperature: " + this.temperature +
                " pressure: " + this.pressure + " humidity: " + this.humidity);
    }

}
