package com.larry.structural.proxy.aggregation;

/**
 * Created by larry on 15-8-2.
 * aggregation
 */
public class App {

    public static void main (String[] args) {
        WizardTowerProxy proxy = new WizardTowerProxy(new WizardTower());
        proxy.enter(new Wizard("White wizard"));
        proxy.enter(new Wizard("Green wizard"));
        proxy.enter(new Wizard("Red wizard"));
        proxy.enter(new Wizard("Black wizard"));
    }
}
