package com.headfirst.composite;

/**
 * Create on 15/12/01
 * 菜单组件
 *
 * 所有组件都必须实现MenuComponent接口;然而,叶子节点和组合节点角色不同,所有有些方法
 * 可能并不适合某种节点.面对这种情况,有时候,你最好是抛出运行时异常.这样,如果菜单或菜单项
 * 不支持某个操作,他们就不需要做任何事情,直接继承默认实现即可.
 */
public abstract class MenuComponent {

	//菜单项"操作"方法,其中一些也可用在菜单上
	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getDescription() {
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		throw new UnsupportedOperationException();
	}

	public boolean isVegatarian() {
		throw new UnsupportedOperationException();
	}
	//print是一个"操作"方法,这个方法同时被菜单和菜单项所实现
	public void print() {
		throw new UnsupportedOperationException();
	}

	//我们把"组合"方法放在一起,即新增,删除,取得菜单组件
	public void add(MenuComponent component) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent component) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int index) {
		throw new UnsupportedOperationException();
	}

}
