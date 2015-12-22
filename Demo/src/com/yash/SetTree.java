package com.yash;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class SetTree {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Order(20));
		ts.add(new Order(10));
		ts.add(new Order(20));
		ts.add(new Order(15));
		Iterator iterator =  ts.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
	}
}
