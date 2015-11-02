package com.headfirst.decorator;

/**
 * Created by larry on 11/2/15.
 * 供应咖啡
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
