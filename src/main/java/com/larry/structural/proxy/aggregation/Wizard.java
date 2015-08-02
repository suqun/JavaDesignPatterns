package com.larry.structural.proxy.aggregation;

/**
 * Created by larry on 15-8-2.
 *
 */
public class Wizard {
    private String name ;

    public Wizard(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
