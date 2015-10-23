package com.headfirst.strategy.duck;

import com.headfirst.strategy.behavior.FlyNoWay;
import com.headfirst.strategy.behavior.Quack;

/**
 * Created by larry on 15-10-23.
 * 新增模型鸭，用来测试动态设定行为
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();//一开始，模型鸭是不会飞的
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
