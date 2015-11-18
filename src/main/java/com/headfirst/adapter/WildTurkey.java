package com.headfirst.adapter;

/**
 * Created by larry on 15/11/18.
 * 火鸡的具体实现类
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
