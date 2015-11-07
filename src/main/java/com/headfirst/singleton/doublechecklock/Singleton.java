package com.headfirst.singleton.doublechecklock;

/**
 * Created by larry on 11/7/15.
 * Danger!  This implementation of Singleton not guaranteed to work prior to Java 5
 *
 */
public class Singleton {
    //volatile关键字确保：当uniqueInstance变量被初始化成Singleton实例时，多个线程正确的处理uniqueInstance变量。
    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        //检查实例，如果不存在，进入同步区块
        if (uniqueInstance == null){
            //进入同步块后，再检查一次。如果仍为null，才创建实例
            //注意：只有第一次才彻底执行这里的代码
            synchronized (Singleton.class){
                if (uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }
}
