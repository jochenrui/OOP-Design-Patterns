package com.designpatterns.observerpattern.subject;

import com.designpatterns.observerpattern.observers.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{

    // kennt seine Observer
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers(){
        observers.forEach((observer) -> {
            ((Observer)observer).update(temperature, humidity, pressure);
        });
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
