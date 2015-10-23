package com.headfirst.strategy.duck;

import com.headfirst.strategy.behavior.FlyWithWings;
import com.headfirst.strategy.behavior.Quack;

/**
 * Created by larry on 15-10-23.
 * 绿头鸭
 */
public class MallarDuck extends Duck {
    public MallarDuck() {
        // 绿头鸭使用Quack类处理呱呱叫，所以当performQuack被调用时，叫的职责被委托给Quack对象，而我们得到了真正的呱呱叫。
        quackBehavior = new Quack();
        //使用FlyWithWings作为器FlyBehavior类型
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
