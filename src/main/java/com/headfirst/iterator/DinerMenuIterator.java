package com.headfirst.iterator;


import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	public boolean hasNext() {
//		if (position >= items.length || items[position] == null) {
//			return false;
//		} else {
//			return true;
//		}
		return !(position >= items.length || items[position] == null);
	}

	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return  menuItem;
	}

	public void remove() {

	}

}
