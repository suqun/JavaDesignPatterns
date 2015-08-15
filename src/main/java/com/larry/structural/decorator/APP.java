package com.larry.structural.decorator;

/**
 * Created by larry on 15-8-15.
 *
 */
public class APP {
    public static void main(String[] args) {

        // simple troll
        System.out.println("A simple looking troll approaches.");
        Hostile troll = new Troll();
        troll.attack();
        troll.fleeBattle();

        // change the behavior of the simple troll by adding a decorator
        System.out.println("\nA smart looking troll surprises you.");
        Hostile smart = new SmartTroll(troll);
        smart.attack();
        smart.fleeBattle();
    }
}
