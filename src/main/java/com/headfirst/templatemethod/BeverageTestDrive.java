package com.headfirst.templatemethod;

/**
 * Created on 15/11/26
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        tea.prepareRecipe();
        coffee.prepareRecipe();
    }
}


//        Boiling water
//        Steeping the tea
//        Pouring into cup
//        Adding Lemon
//        Boiling water
//        Dripping Coffee through filter
//        Pouring into cup
//        Adding Sugar and Milk