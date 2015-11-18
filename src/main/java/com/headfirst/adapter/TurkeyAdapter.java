package com.headfirst.adapter;

/**
 * Created by larry on 15/11/18.
 * 火鸡适配器
 */
//首先,你需要实现想转换成的类型接口,也就是你的客户所期望的接口.
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    //接着,需要取得适配器的对象引用,这里我们利用构造器取得这个引用
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    //现在我们需要实现接口中的所有方法.quack在类之间的转换很简单,只要调用gobble就可以了
    public void quack() {
        turkey.gobble();
    }

    //固然两个接口都具备fly方法,火鸡的飞行距离较短,要让鸭子的飞行距离和火鸡飞行距离相对应,连续5次调用火鸡的fly完成
    public void fly() {
        for (int i = 0; i < 5; i++){
            turkey.fly();
        }
    }
}
