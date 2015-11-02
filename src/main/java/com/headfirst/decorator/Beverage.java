package com.headfirst.decorator;

/**
 * Created by larry on 11/2/15.
 * 饮料 相当于抽象的Component类,有两个方法getDescription()和cost()
 */
public abstract class Beverage {
    String description = "Unknow Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
