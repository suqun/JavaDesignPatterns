package com.larry.structural.template_method;

/**
 * Created by larry on 15-8-12.
 * HitAndRunMethod implementation of StealingMethod.
 */
public class HitAndRunMethod extends StealingMethod{
    @Override
    protected String pickTarget() {
        return "old goblin woman";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println("Approach the " + target + " from behind.");
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println("Grab the handbag and run away fast!");
    }
}
