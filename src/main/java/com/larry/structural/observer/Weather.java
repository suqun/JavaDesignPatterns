package com.larry.structural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by larry on 15-8-10.
 * Weather can be observed by implementing WeatherObserver interface and
 * registering as listener.
 */
public class Weather {
    private List<WeatherObserver> weatherObservers;
    private WeatherType weatherType;

    public Weather() {
        weatherObservers = new ArrayList<WeatherObserver>();
        weatherType = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver weatherObserver) {
        weatherObservers.add(weatherObserver);
    }

    public void removeOberver(WeatherObserver weatherObserver) {
        weatherObservers.remove(weatherObserver);
    }

    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        weatherType = enumValues[(weatherType.ordinal() + 1) % enumValues.length];
        System.out.println("The weather changed to " + weatherType + ".");
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver weatherObserver : weatherObservers) {
            weatherObserver.update(weatherType);
        }
    }

}
