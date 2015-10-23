package com.headfirst.strategy.behavior;

/**
 * Created by larry on 15-10-23.
 *
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        //橡皮鸭吱吱叫
        System.out.println("Squeak");
    }
}
