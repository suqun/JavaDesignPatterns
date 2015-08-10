package com.larry.structural.observer;

/**
 * Created by larry on 15-8-4.
 *
 */
public class App {

    public static void main(String[] args){
        Weather weather = new Weather();
        weather.addObserver(new Hobbits());
        weather.addObserver(new Orcs());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
    }
}
