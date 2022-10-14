package com.examples.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private int humidity;
    private int temperature;
    private int pressure;

    private List<Observer> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        this.observers.forEach(observer -> observer.update(temperature, pressure, humidity));
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }
}
