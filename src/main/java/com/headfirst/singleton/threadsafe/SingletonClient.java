package com.headfirst.singleton.threadsafe;

/**
 * Created by larry on 11/7/15.
 *
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
