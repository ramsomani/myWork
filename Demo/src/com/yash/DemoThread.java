package com.yash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DemoThread {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(22);
		list.add(23);
		list.add(12);
		list.add(13);
		list.add(21);
		list.add(20);

		Iterator<Integer> itr = list.iterator();
		Collections.synchronizedCollection(list);
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}
}
