package com.larry.structural.template_method;

/**
 * Created by larry on 15-8-12.
 * SubtleMethod implementation of StealingMethod.
 */
public class SubtleMethod extends StealingMethod{
    @Override
    public String pickTarget() {
        return "shop keeper";
    }

    @Override
    public void confuseTarget(String target) {
        System.out.println("Approach the " + target
                + " with tears running and hug him!");
    }

    @Override
    public void stealTheItem(String target) {
        System.out.println("While in close contact grab the " + target
                + "'s wallet.");
    }
}
