package com.larry.structural.observer;

/**
 * Created by larry on 15-8-5.
 *
 */
public enum WeatherType {
    SUNNY,RAINY,WINDY,COLD;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
