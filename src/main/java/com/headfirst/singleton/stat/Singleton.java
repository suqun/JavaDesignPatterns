package com.headfirst.singleton.stat;

/**
 * Created by larry on 11/7/15.
 * 依赖JVM加载这个类时马上创建此唯一的单例，
 * JVM保证在任何线程访问uniqueInstance静态变量之前，一定先创建此实例。
 */
public class Singleton {
    //在静态初始化器（static initializer）中创建单例。保证了线程安全
    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return uniqueInstance;//已经有实例了，直接使用
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }
}
