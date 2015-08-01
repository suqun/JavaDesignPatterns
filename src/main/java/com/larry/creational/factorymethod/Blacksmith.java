package com.larry.creational.factorymethod;

/**
 * Created by larry on 15-8-1.
 * The interface containing method for producing objects.
 */
public interface Blacksmith {
    Weapon manufactureWeapon(WeaponType weaponType);
}
