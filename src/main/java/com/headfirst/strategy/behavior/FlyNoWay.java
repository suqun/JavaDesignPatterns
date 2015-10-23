package com.headfirst.strategy.behavior;

/**
 * Created by larry on 15-10-23.
 *
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        //什么事也不做，不会飞
        System.out.println("I can't fly");
    }
}
