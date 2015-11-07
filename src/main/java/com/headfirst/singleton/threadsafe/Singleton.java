package com.headfirst.singleton.threadsafe;

/**
 * Created by larry on 11/7/15.
 * 缺点1——同步会降低性能
 * 缺点2——只有第一次执行此方法时，才真正需要同步，之后每次调用这个方法，同步都是一种累赘
 *
 * 选择1——如果性能对应用程序不是很关键，就什么都别做，直接使用
 * 选择2——使用“急切”创建实例（stat包内Singleton），而不用延迟实例化的做法
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){}

    //通过synchronized关键字到方法中，迫使每个线程在进入方法之前，要先等候别的线程离开此方法。
    public static synchronized Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
