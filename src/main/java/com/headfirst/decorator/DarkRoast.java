package com.headfirst.decorator;

/**
 * Created by larry on 11/2/15.
 * 深焙咖啡，具体的饮料，设置描述，实现cost方法
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {//设置饮料的描述，description继承自Beverage
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {//计算HouseBlend的价钱
        return .99;
    }
}
