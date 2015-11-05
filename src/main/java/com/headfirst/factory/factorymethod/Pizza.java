package com.headfirst.factory.factorymethod;

import java.util.ArrayList;

/**
 * Created by larry on 11/3/15.
 * 抽象披萨类，所有的具体的披萨都必须派生自这个类
 */
abstract public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}

/**
 Prepare NY Style Sauce and Cheese Pizza
 Tossing dough...
 Adding sauce...
 Adding toppings:
 Grated Reggiano Cheese
 Bake for 25 minutes at 350
 Cut the pizza into diagonal slices
 Place pizza in official PizzaStore box
 Ethan ordered a NY Style Sauce and Cheese Pizza

 Prepare Chicago Style Deep Dish Cheese Pizza
 Tossing dough...
 Adding sauce...
 Adding toppings:
 Shredded Mozzarella Cheese
 Bake for 25 minutes at 350
 Cutting the pizza into square slices
 Place pizza in official PizzaStore box
 Joel ordered a Chicago Style Deep Dish Cheese Pizza


 Process finished with exit code 0
**/

