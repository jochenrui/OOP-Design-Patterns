package com.designpatterns.observerpattern;

import com.designpatterns.observerpattern.observers.CurrentConditionsDisplay;
import com.designpatterns.observerpattern.observers.HeatIndexDisplay;
import com.designpatterns.observerpattern.subject.WeatherData;

/**
 * the observer pattern
 * allows observers to subscribe to a subject (of interest)
 * the subject will notify observers once it's state has changed
 *
 * 1:n Relationship -> 1 Subject, Many Observers who want its State
 *
 * Subject Interface
 * allows the Observers to register/remove themselves
 *
 * Observer Interface
 * has the update() method which is called by the Subject
 */

public class WeatherStationApplication {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(10, 32, 10.4f);
        weatherData.setMeasurements(3.5f, 2.67f, 3);
    }
}
