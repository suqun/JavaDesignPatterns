package Singleton;

/**
 * Created by Larry on 2015/7/6.
 * 懒汉模式-线程不安全
 */
public class IdleSingleton {
    //1.将构造函数私有化，不允许外部直接创建对象
    private IdleSingleton() {
    }
    //2.声明类的唯一实例，使用private static 修饰
    private static IdleSingleton idleSingleton;
    //3.判断一下，也即运行时加载
    public static IdleSingleton getInstance() {
        if (null == idleSingleton) {
            idleSingleton = new IdleSingleton();
        }
        return idleSingleton;
    }

}
