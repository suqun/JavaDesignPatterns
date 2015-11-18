package com.headfirst.adapter;

/**
 * Created by larry on 15/11/18.
 * 绿头鸭是鸭子的子类
 */
public class MallardDuck implements Duck{
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}
