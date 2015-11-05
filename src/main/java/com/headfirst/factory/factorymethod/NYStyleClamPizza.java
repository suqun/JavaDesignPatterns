package com.headfirst.factory.factorymethod;

/**
 * Created by larry on 11/5/15.
 * 纽约披萨
 */
public class NYStyleClamPizza extends Pizza{
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}
