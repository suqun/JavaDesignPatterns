package com.larry.creational.factorymethod;

/**
 * Created by larry on 15-8-1.
 *
 */
public enum WeaponType {
    SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), UNDEFINED("");

    private String title;

    WeaponType(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
