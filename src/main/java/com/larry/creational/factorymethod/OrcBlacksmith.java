package com.larry.creational.factorymethod;

/**
 * Created by larry on 15-8-2.
 * Concrete subclass for creating new objects
 */
public class OrcBlacksmith implements Blacksmith{

    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new OrcWeapon(weaponType);
    }
}
