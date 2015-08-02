package com.larry.creational.factorymethod;

/**
 * Created by larry on 15-8-1.
 *
 * In Factory Method we have an interface (Blacksmith) with a method for
 * creating objects (manufactureWeapon). The concrete subclasses (OrcBlacksmith,
 * ElfBlacksmith) then override the method to produce objects of their liking.
 *
 */
public class App {
    public static void main(String[] args){
        Blacksmith elfBlacksmith = new ElfBlacksmith();
        Weapon elfAxe = elfBlacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(elfAxe);

        Weapon elfSpear = elfBlacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(elfSpear);

        Blacksmith orcBlacsmith = new OrcBlacksmith();
        Weapon orcAxe = orcBlacsmith.manufactureWeapon(WeaponType.AXE);
        Weapon orcSpear = orcBlacsmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(orcAxe);
        System.out.println(orcSpear);

    }
}
