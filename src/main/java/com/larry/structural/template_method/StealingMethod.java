package com.larry.structural.template_method;

/**
 * Created by larry on 15-8-12.
 * StealingMethod defines skeleton for the algorithm.
 */
public abstract class StealingMethod {

    protected abstract String pickTarget();

    protected abstract void confuseTarget(String target);

    protected abstract void stealTheItem(String target);

    public void steal(){// final 可以阻止子类改变此方法git
        String target = pickTarget();
        System.out.println("The target has been chosen as " + target + ".");
        confuseTarget(target);
        stealTheItem(target);
    }
}
