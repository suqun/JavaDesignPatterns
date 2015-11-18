package com.headfirst.adapter;

/**
 * Created by larry on 15/11/18.
 *
 * 适配器模式:将一个类的接口,转换成客户所期望的另一个接口.
 *          适配器让原本不兼容的类可以合作无间.
 *
 * 客户使用适配器的过程如下
 * 1. 客户通过目标接口调用适配器的方法对适配器发出请求
 * 2. 适配器使用被适配者接口把请求转换成被适配者的一个或多个调用接口
 * 3. 客户收到调用的结果,但并未察觉这一切是适配器在起转换作用.
 * 注意:客户和适配器是解耦的,一个不知道另一个
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        //首先创建一只鸭子和火鸡
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        //然后将火鸡包装进一个火鸡的适配器中,使他看起来像只鸭子
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        //接着测试这只火鸡,让他咯咯叫和飞行
        System.out.println("The Turkey says ...");
        turkey.gobble();
        turkey.fly();

        //接着,调用testDuck方法来测试鸭子,这个方法需要传入一个鸭子对象
        System.out.println("\nThe Duck says ...");
        testDuck(duck);

        //重要的测试来了,我们传入一个假装是鸭子的火鸡
        System.out.println("\nThe TurkeyAdapter says ...");
        testDuck(turkeyAdapter);
    }

    //获得一只鸭子,并调用他的方法
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}

//        The Turkey says ...           //火鸡咯咯叫
//        Gobble gobble
//        I'm flying a short distance
//
//        The Duck says ...             //鸭子呱呱叫
//        Quack
//        I'm flying
//
//        The TurkeyAdapter says ...     //quack被调用时,适配器咯咯叫;fly被调用时
//        Gobble gobble                  //适配器飞行5次.testDuck方法根本不知道,这其实
//        I'm flying a short distance    //是一只假装成鸭子的火鸡
//        I'm flying a short distance
//        I'm flying a short distance
//        I'm flying a short distance
//        I'm flying a short distance