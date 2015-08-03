package com.larry.structural.adapter;

/**
 * Created by larry on 15-8-3.
 * GnomeEngineering manager uses Engineer to operate devices.
 */
public class GnomeEngineeringManager implements Engineer{
    private Engineer engineer;

    public GnomeEngineeringManager() {
        this.engineer = new GnomeEngineer();
    }

    public void operateDevice() {
        engineer.operateDevice();
    }
}
