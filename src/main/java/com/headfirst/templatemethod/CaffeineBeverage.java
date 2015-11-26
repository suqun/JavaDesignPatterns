package com.headfirst.templatemethod;

/**
 * Created by larry on 15/11/26.
 * 模板方法模式——在一个方法中定义一个算法的骨架,而将一些步骤延迟到子类中.模板方法使得子类可以
 *             在不改变算法结构的情况下,重新定义算法中的某些步骤.
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
