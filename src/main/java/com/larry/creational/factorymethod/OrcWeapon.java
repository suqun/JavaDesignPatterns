package com.larry.creational.factorymethod;

/**
 * Created by larry on 15-8-2.
 *
 */
public class OrcWeapon implements Weapon{
    private WeaponType weaponType;

    public OrcWeapon (WeaponType weaponType){
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Orc " + weaponType;
    }
}
