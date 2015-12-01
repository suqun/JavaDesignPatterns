package com.headfirst.composite;

/**
 * Create on 15/12/01
 * 菜单项
 *
 */
public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean vegetarian;
	double price;

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public boolean isVegatarian() {
		return vegetarian;
	}

	//覆盖print方法,对于菜单项来说会打印出完整条目:名字,描述,价格,是否为素食
	public void print() {
		System.out.println(" " + getName());
		if (isVegatarian()) {
			System.out.println(" (V) ");
		}
		System.out.println(", " + getPrice());
		System.out.println("    -- " + getDescription());
	}

}
