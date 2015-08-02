package com.larry.structural.proxy.aggregation;

/**
 * Created by larry on 15-8-2.
 * The proxy controlling access to WizardTower.
 */
public class WizardTowerProxy extends WizardTower {
    private static final int NUM_WIZARDS_ALLOWED = 3;

    private int numWizards;

    private WizardTower wizardTower;

    public WizardTowerProxy(WizardTower wizardTower) {
        this.wizardTower = wizardTower;
    }

    @Override
    public void enter(Wizard wizard) {
        if(numWizards < NUM_WIZARDS_ALLOWED){
            wizardTower.enter(wizard);
            numWizards++;
        } else {
            System.out.println(wizard + " is not allowed to enter!");
        }
    }
}
