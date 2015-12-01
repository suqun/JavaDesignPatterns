package com.headfirst.composite;

/**
 * Created on 15/12/1
 *
 * 组合模式——允许你将对象组合成树形结构来表现"整体/部分"层次结构.组合让
 *          客户以一致的方式处理个别对象以及对象组合
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Diner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sause, and a slice of sourdough bread",
                true,
                3.89
        ));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true,
                1.59
        ));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}

        /*ALL MENUS, All menus combined
        ---------------------

        PANCAKE HOUSE MENU, Breakfast
        ---------------------

        DINER MENU, Lunch
        ---------------------
        Pasta
        (V)
        , 3.89
        -- Spaghetti with Marinara Sause, and a slice of sourdough bread

        DESSERT MENU, Dessert of course!
        ---------------------
        Apple Pie
        (V)
        , 1.59
        -- Apple pie with a flakey crust, topped with vanilla ice cream

        CAFE MENU, Diner
        ---------------------
        */