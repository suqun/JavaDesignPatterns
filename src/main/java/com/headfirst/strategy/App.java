package com.headfirst.strategy;

import com.headfirst.strategy.behavior.FlyRocketPowered;
import com.headfirst.strategy.duck.Duck;
import com.headfirst.strategy.duck.MallarDuck;
import com.headfirst.strategy.duck.ModelDuck;

/**
 * Created by larry on 15-10-23.
 * 策略模式测试类
 * OO基础：
 *        抽象，封装，多态，继承
 * OO原则：
 *       1，找出应用中可能需要变化之处，把它们独立出来，不要和那些不变化的代码混合在一起。  封装变化
 *       2，针对接口编程，而不是针对实现编程
 *       3，多用组合，少用继承
 * OO模式：策略模式——定义算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于算法的客户
 */
public class App {
    public static void main(String[] args){
        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();

        //加上模型鸭，并使模型鸭具有火箭动力
        Duck model = new ModelDuck();
        model.performFly();//第一次调用performFly会被委托给flyBehavior对象（也就是FlyNoWay实例），该对象是在模型鸭构造器中设置的
        model.setFlyBehavior(new FlyRocketPowered());//这会调用继承来的setter方法，把火箭动力飞行的行为设定到模型鸭中。
        model.performFly();//模型鸭可以动态的改变他的飞行行为。如果把行为的实现绑死在鸭子类中，就无法做到这样了。
    }
}

/**
 Quack
 I'm flying!!
 I can't fly
 I'm flying with a rocket!
 */