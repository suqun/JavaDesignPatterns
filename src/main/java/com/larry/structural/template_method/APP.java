package com.larry.structural.template_method;

/**
 * Created by larry on 15-8-12.
 *
 * Template Method defines a skeleton for an algorithm. The algorithm subclasses
 * provide implementation for the blank parts.
 *
 * In this example HalflingThief contains StealingMethod that can be changed.
 * First the thief hits with HitAndRunMethod and then with SubtleMethod.
 *
 */
public class APP {
    public static void main(String[] args){
        HalfingThief thief = new HalfingThief(new HitAndRunMethod());
        thief.steal();

        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }
}
