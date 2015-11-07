package com.headfirst.singleton.chocolate;


/**
 * Created by larry on 11/7/15.
 *
 */
public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler1 =  ChocolateBoiler.getInstance();
        boiler1.fill();
        //boiler1.boil();
        //boiler1.drain();
        System.out.println("boiler1 is empty: " + boiler1.isEmpty());
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        System.out.println("boiler2 is empty: " + boiler2.isEmpty());
        boiler2.fill();
        System.out.println("boiler2 is empty: " + boiler2.isEmpty());
    }
}
