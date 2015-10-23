package com.headfirst.strategy.behavior;

/**
 * Created by larry on 15-10-23.
 *
 */
public class Quack implements QuackBehavior{
    public void quack() {
        //实现鸭子呱呱叫
        System.out.println("Quack");
    }
}
