package com.larry.structural.proxy.aggregation;

/**
 * Created by larry on 15-8-2.
 * The object to be proxied .
 */
public class WizardTower {
    public void enter(Wizard wizard){
        System.out.println(wizard + " enters the tower .");
    }
}
