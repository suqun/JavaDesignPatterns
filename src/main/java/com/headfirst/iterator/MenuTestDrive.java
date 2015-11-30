package com.headfirst.iterator;

/**
 * Created on 15/11/30
 *
 * 迭代器模式——提供一种方法顺序访问一个聚合对象中的各个元素,而又不暴露其内部的表示
 *
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}


/*
MENU
----
BREAKFAST
K&B's Pancake Breakfast,
2.99 --
Pancakes with scrambled eggs, and toast
Regular Pancake Breakfast,
2.99 --
Pancakes with fried eggs, sausage
Blueberry Pancakes,
3.49 --
Pancakes made with fresh blueberries, and blueberry syrup
Waffles,
3.59 --
Waffles, with your choice of blueberries or strawberries

LUNCH
Vegetarian BLT,
2.99 --
(Fakin') Bacon with lettuce & tomato on whole wheat
BLT,
2.99 --
Bacon with lettuce & tomato on whole wheat
Soup of the day,
3.29 --
Soup of the day, with a side of potato salad
Hotdog,
3.05 --
A hot dog, with saurkraut, relish, onions, topped with cheese
Steamed Veggies and Brown Rice,
3.99 --
Steamed vegetables over brown rice
Pasta,
3.89 --
Spaghetti with Marinara Sauce, and a slice of sourdough bread
*/
