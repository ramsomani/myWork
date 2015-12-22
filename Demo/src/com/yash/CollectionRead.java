package com.yash;

import java.util.*;

public class CollectionRead {

	public static void main(String[] args) {
		// create array list
		List<Character> list = new ArrayList<Character>();

		// populate the list
		list.add('X');
		list.add('Y');

		System.out.println("Initial list: " + list);

		// make the list unmodifiable
		List newList = Collections.unmodifiableList(list);

		//newList.remove('Z');
		System.out.println(list);
	}

}
