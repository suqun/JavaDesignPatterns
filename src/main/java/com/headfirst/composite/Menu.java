package com.headfirst.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Create on 15/12/01
 * 组合菜单
 *
 */
public class Menu extends MenuComponent {
	//菜单可以有任意数目的孩子,这些孩子必须属于MenuComponent
	ArrayList menuComponents = new ArrayList();
	String name;
	String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void add(MenuComponent component) {
		menuComponents.add(component);
	}

	public void remove(MenuComponent component) {
		menuComponents.remove(component);
	}

	public MenuComponent getChild(int index) {
		return (MenuComponent) menuComponents.get(index);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");

		//我们用了迭代器.用它遍历所有菜单组件...
		//遍历过程中,可能遇到其他菜单,或者是遇到菜单项.由于菜单和菜单项都实现了print,那我们只要调用print即可
		Iterator iterator = menuComponents.iterator();
		while (iterator.hasNext()){
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			//请注意:在遍历期间,如果遇到另一个菜单对象,它的print方法会开始另一个遍历,以此类推
			menuComponent.print();
		}
	}

}
