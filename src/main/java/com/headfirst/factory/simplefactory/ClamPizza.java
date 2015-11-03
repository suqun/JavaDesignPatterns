package com.headfirst.factory.simplefactory;

/**
 * Created by larry on 11/3/15.
 * 具体产品
 */
public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
