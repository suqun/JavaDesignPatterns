package com.headfirst.templatemethod;

/**
 * Created by larry on 15/11/26.
 *
 */
public class Tea extends CaffeineBeverage {
    public void brew() {
        System.out.println("Steeping the tea");
    }
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
