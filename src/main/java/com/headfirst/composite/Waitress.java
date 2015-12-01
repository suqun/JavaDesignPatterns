package com.headfirst.composite;

/**
 * Create on 15/12/01
 * 女招待
 */
public class Waitress {

	MenuComponent menuComponent;

	public Waitress(MenuComponent menuComponent) {
		this.menuComponent = menuComponent;
	}

	public void printMenu(){
		menuComponent.print();
	}
}
