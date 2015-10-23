package com.headfirst.strategy.behavior;

/**
 * Created by larry on 15-10-23.
 *
 */
public class FlyWithWings implements FlyBehavior{

    public void fly() {
        //实现鸭子的飞行
        System.out.println("I'm flying!!");
    }
}
