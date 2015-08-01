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
        Blacksmith blacksmith = new ElfBlacksmith();
        Weapon axe = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(axe);

        Weapon spear = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(spear);
    }
}
