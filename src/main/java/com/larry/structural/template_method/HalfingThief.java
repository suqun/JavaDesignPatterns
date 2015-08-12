package com.larry.structural.template_method;

/**
 * Created by larry on 15-8-12.
 * Halfling thief uses StealingMethod to steal.
 */
public class HalfingThief {
    private StealingMethod method;

    public HalfingThief(StealingMethod method) {
        this.method = method;
    }

    public void steal(){
        method.steal();
    }

    public void changeMethod(StealingMethod method){
        this.method = method;
    }
}
