package com.larry.structural.strategy;

/**
 * Created by larry on 15-8-11.
 *
 * DragonSlayer uses different strategies to slay the dragon.
 *
 */
public class DargonSlayer {
    private DragonSlayingSrategy srategy;

    public DargonSlayer(DragonSlayingSrategy srategy) {
        this.srategy = srategy;
    }

    public void changeStrategy(DragonSlayingSrategy srategy){
        this.srategy = srategy;
    }

    public void goToBattle(){
        srategy.execute();
    }
}
