package com.larry.structural.adapter;

/**
 * Created by larry on 15-8-2.
 *
 */
public class App {
    public static void main(String[] args){
        Engineer manager = new GnomeEngineeringManager();
        manager.operateDevice();
    }
}
