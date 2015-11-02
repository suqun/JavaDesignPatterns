package com.headfirst.decorator;

/**
 * Created by larry on 11/2/15.
 * 供应咖啡
 *
 * OO基础：
 *        抽象，封装，多态，继承
 * OO原则：
 *       1，找出应用中可能需要变化之处，把它们独立出来，不要和那些不变化的代码混合在一起。  封装变化
 *       2，针对接口编程，而不是针对实现编程
 *       3，多用组合，少用继承
 *       4，为交互对象之间的松耦合设计而努力 ——松耦合设计更有弹性，更能应对变化
 *       5，对扩展开放，对修改关闭
 * OO模式：装饰模式——动态的讲责任附加到对象上。想要扩展功能，装饰者提供有别于继承的另一种选择
 */
public class StartbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();//订一杯Espresso，不需要调料，打印它的描述及价钱
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();//制造一个DarkRoast对象
        beverage1 = new Mocha(beverage1);//用Mocha装饰它
        beverage1 = new Mocha(beverage1);//用第二个Mocha装饰它
        beverage1 = new Whip(beverage1);//用Whip装饰它
        System.out.println(beverage1.getDescription()
                + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();//再来一杯调料为豆浆，摩卡，奶泡的HouseBlend咖啡
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
    }
}
