package com.larry.structural.decorator;

/**
 * Created by larry on 15-8-15.
 *
 * Troll implements Hostile interface directly.
 *
 */
public class Troll implements Hostile {
    public void attack() {
        System.out.println("The troll swings at you with a club!");
    }

    public void fleeBattle() {
        System.out.println("The troll shrieks in horror and runs away!");
    }
}
