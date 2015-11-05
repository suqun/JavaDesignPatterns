package com.headfirst.factory.factorymethod;

/**
 * Created by larry on 11/5/15.
 * 创建者Creator类，这是抽象创建者类。它定义了一个抽象的工厂方法，让子类实现此方法制造产品
 * 工厂方法用来处理对象的创建，并将这样的行为封装在子类中。这样，客户程序中关于超类的代码和子类对象创建代码解耦了。
 *
 * 每个子类都会覆盖createPizza方法，同时使用PizzaStore定义的orderPizza方法。甚至可以把orderPizza方法声明成final，以
 * 防止被子类覆盖
 */
public abstract class PizzaStore {

    //PizzaStore的子类在createPizza()方法中处理对象的实例化
    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    //现在，实例化披萨的责任被移动到一个“方法”中，此方法就如同是一个“工厂”
    protected abstract Pizza createPizza(String type);
}
