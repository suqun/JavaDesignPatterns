package com.headfirst.observer;

/**
 * Created by larry on 10/24/15.
 * 观察者接口
 * 所有观察者都必须实现update方法，以实现观察者接口
 */
public interface Observer {
    //当气象状态改变时，这个方法会被调用，以通知所有的观察者
    //直接传入观测值不明智，种类及个数在将来可能出现变化
    public void update(float temp,float humidity,float pressure);
}
