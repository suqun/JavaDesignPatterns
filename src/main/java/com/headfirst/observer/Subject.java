package com.headfirst.observer;

/**
 * Created by larry on 10/24/15.
 * 主题接口
 */
public interface Subject {
    void registerObserver(Observer o);//这两个方法都需要一个观测者作为变量，该观察者用来注册或删除的
    void removeObserver(Observer o);
    void notifyObservers();//当主题状态改变时，这个方法会被调用，以通知所有的观察者
}
