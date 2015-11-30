package com.headfirst.iterator;

import java.util.Iterator;

public interface Menu {

    public abstract Iterator<MenuItem> createIterator();

}
