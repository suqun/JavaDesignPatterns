package com.headfirst.strategy.duck;

import com.headfirst.strategy.behavior.FlyBehavior;
import com.headfirst.strategy.behavior.QuackBehavior;

/**
 * Created by larry on 15-10-23.
 * 鸭子父类
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    //动态设定行为，而不是在构造器内实例化
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
