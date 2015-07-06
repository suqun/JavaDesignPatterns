package Singleton;

/**
 * Created by Larry on 2015/7/6.
 * 饿汉模式-线程安全
 */
public class HungrySingleton {

    //1.将构造方法私有化，不允许外部直接创建对象
    private HungrySingleton(){}

    //2.自己创建一个类的唯一实例
    //3.将其便为static（如果将其设为private,更符合封装）
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

}
