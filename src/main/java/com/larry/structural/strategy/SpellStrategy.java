package com.larry.structural.strategy;

/**
 * Created by larry on 15-8-11.
 *
 * Spell strategy.
 *
 */
public class SpellStrategy implements DragonSlayingSrategy{
    public void execute() {
        System.out
                .println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!");
    }
}
