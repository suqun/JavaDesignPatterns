package com.headfirst.strategy.behavior;

/**
 * Created by larry on 15-10-23.
 * 火箭动力飞行
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
