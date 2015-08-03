package com.larry.structural.adapter;

/**
 * Created by larry on 15-8-3.
 * Adapter class. Adapts the interface of the device (GoblinGlider) into
 * Engineer interface expected by the client (GnomeEngineeringManager).
 */
public class GnomeEngineer implements Engineer {
    private GoblinGlider glider;

    public GnomeEngineer() {
        this.glider = new GoblinGlider();
    }

    public void operateDevice() {
        glider.attachGlider();
        glider.gainSpeed();
        glider.takeOff();
    }
}
