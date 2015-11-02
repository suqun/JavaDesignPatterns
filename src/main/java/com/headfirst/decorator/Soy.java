package com.headfirst.decorator;

/**
 * Created by larry on 11/2/15.
 * 调料 豆浆，具体的装饰者
 */
public class Soy extends CondimentDecorator {//豆浆是一个装饰者，扩展自CondimentDecorator

    Beverage beverage;//让mocha能够引用一个Beverage，用一个实例记录饮料（也就是被装饰者）

    //想办法让被装饰者（饮料）被记录在实例变量中。把饮料当作构造函数的参数，再由构造函数将此饮料记录在实例变量中
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        //完整的连调料都描述出来
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        //首先把调用委托给被装饰对象，以计算价钱，然后在加上mocha的价钱
        return .20 + beverage.cost();
    }
}
