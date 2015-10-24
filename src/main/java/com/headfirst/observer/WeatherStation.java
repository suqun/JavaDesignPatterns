package com.headfirst.observer;

/**
 * Created by larry on 10/24/15.
 * 气象站，测试
 * OO基础：
 *        抽象，封装，多态，继承
 * OO原则：
 *       1，找出应用中可能需要变化之处，把它们独立出来，不要和那些不变化的代码混合在一起。  封装变化
 *       2，针对接口编程，而不是针对实现编程
 *       3，多用组合，少用继承
 *       4，为交互对象之间的松耦合设计而努力 ——松耦合设计更有弹性，更能应对变化
 * OO模式：观察者模式——在对象之间定义一对多的依赖，这样一来，当一个对象状态改变状态，依赖它的对象都会收到通知，
 *                      并自动更新。
 */
public class WeatherStation {
    public static void main(String[] args) {
        //建一个weatherData对象
        WeatherData weatherData = new WeatherData();

        //建立布告板，并把weatherData对象传给它进行注册
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
    }
}
