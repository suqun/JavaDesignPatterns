package com.larry.structural.strategy;

/**
 * Created by larry on 15-8-11.
 *
 * Melee strategy.
 *
 */
public class MeleeStrategy implements DragonSlayingSrategy {
    public void execute() {
        System.out.println("With your Excalibur you severe the dragon's head!");
    }
}
