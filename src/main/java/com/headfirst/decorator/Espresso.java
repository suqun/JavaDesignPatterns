package com.headfirst.decorator;

/**
 * Created by larry on 11/2/15.
 * 浓缩咖啡，具体的饮料，设置描述，实现cost方法
 */
public class Espresso extends Beverage {
    public Espresso() {//设置饮料的描述，description继承自Beverage
        description = "Espresso";
    }

    @Override
    public double cost() {//计算Espresso的价钱
        return 1.99;
    }
}
