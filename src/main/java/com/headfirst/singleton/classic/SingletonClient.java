package com.headfirst.singleton.classic;

/**
 * Created by larry on 11/7/15.
 *
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getDescription());
    }
}
