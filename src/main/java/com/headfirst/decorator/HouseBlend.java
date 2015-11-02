package com.headfirst.decorator;

/**
 * Created by larry on 11/2/15.
 * 家常咖啡，具体的饮料，设置描述，实现cost方法
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {//设置饮料的描述，description继承自Beverage
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {//计算HouseBlend的价钱
        return .89;
    }
}
