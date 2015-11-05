package com.headfirst.factory.factorymethod;

/**
 * Created by larry on 11/5/15.
 * 芝加哥pizza
 */
public class ChicagoStyleClamPizza extends Pizza{
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
