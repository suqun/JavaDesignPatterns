package com.headfirst.templatemethod;

/**
 * Created by larry on 15/11/26.
 * ß
 */
public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
