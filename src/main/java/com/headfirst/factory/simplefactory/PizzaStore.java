package com.headfirst.factory.simplefactory;

/**
 * Created by larry on 11/3/15.
 * 客户代码
 */
public class PizzaStore {
    //为PizzaStore加上一个对SimplePizzaFactory的引用
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
