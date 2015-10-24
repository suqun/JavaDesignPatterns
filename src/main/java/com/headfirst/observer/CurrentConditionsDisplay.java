package com.headfirst.observer;

/**
 * Created by larry on 10/24/15.
 * 目前状况布告板
 * 实现Observer接口，所以可以从WeatherData对象中获得改变
 * 实现DisplayElement接口
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    /**
     * 构造器需要weatherData对象（就是主题）作为注册之用
     *
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 当update()调用时，我们把温度，湿度保存起来，然后调用display()
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    /**
     * display()方法只是将最近的温度和湿度显示出来
     */
    public void display() {
        System.out.println("Currendt conditions:" + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
