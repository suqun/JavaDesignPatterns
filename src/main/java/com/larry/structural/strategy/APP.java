package com.larry.structural.strategy;

/**
 * Created by larry on 15-8-11.
 *
 * Strategy (DragonSlayingStrategy) encapsulates an algorithm. The containing
 * object (DragonSlayer) can alter its behavior by changing its strategy.
 *
 */
public class APP {

    public static void main(String[] args){
        System.out.println("Green dragon spotted ahead!");
        DargonSlayer dargonSlayer = new DargonSlayer(new MeleeStrategy());
        dargonSlayer.goToBattle();

        System.out.println("Green dragon spotted ahead!");
        dargonSlayer.changeStrategy(new SpellStrategy());
        dargonSlayer.goToBattle();

        System.out.println("Black dragon lands before you.");
        dargonSlayer.changeStrategy(new ProjectileStrategy());
        dargonSlayer.goToBattle();
    }
}
