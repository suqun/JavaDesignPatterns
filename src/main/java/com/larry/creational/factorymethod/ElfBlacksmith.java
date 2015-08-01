package com.larry.creational.factorymethod;

/**
 * Created by larry on 15-8-1.
 * Concrete subclass for creating new objects
 */
public class ElfBlacksmith implements Blacksmith {
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new ElfWeapon(weaponType);
    }
}
