package com.headfirst.strategy.behavior;

/**
 * Created by larry on 15-10-23.
 *
 */
public class MuteQuack implements QuackBehavior{
    public void quack() {
        //什么事都不做，不会叫
        System.out.println("<< Silence >>");
    }
}
