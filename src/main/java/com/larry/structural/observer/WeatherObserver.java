package com.larry.structural.observer;

/**
 * Created by larry on 15-8-5.
 * Observer interface.
 */
public interface WeatherObserver {
    void update(WeatherType weatherType);
}
