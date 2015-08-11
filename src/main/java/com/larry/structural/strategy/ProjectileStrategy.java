package com.larry.structural.strategy;

/**
 * Created by larry on 15-8-11.
 *
 * Projectile strategy.
 *
 */
public class ProjectileStrategy implements DragonSlayingSrategy {
    public void execute() {
        System.out
                .println("You shoot the dragon with the magical crossbow and it falls dead on the ground!");
    }
}
