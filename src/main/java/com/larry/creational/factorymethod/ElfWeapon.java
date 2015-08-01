package com.larry.creational.factorymethod;

/**
 * Created by larry on 15-8-1.
 *
 */
public class ElfWeapon implements Weapon {
    private WeaponType weaponType;

    public ElfWeapon(WeaponType weaponType){
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Elf " + weaponType;
    }
}
