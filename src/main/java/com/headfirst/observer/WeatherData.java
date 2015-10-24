package com.headfirst.observer;

import java.util.ArrayList;

/**
 * Created by larry on 10/24/15.
 *
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;//加上一个ArrayList用来记录观察者，此ArrayList是在构造器中建立的
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * Subject接口的实现
     * 当注册观测者时，我们只需把它加入到ArrayList的后面
     * @param o
     */
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * Subject接口的实现
     * 同样的，当观察者想取消注册，我们把它从arrayList中删除即可
     * @param o
     */
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * Subject接口的实现
     * 有趣的地方来了！在这里，我们把状态告诉每一个观察者。因为观察者都实现了update()，
     * 所以我们知道如何通知它们。
     */
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当从气象站得到更新的观测值时，我们通知观测者
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    /**
     * 测试布告板，获取观测值
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temp,float humidity,float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
