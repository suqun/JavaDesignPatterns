package com.larry.creational.factorymethod;

/**
 * Created by larry on 15-8-1.
 *
 */
public class App {
    public static void main(String[] args){
        Blacksmith blacksmith = new ElfBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(weapon);
    }
}
