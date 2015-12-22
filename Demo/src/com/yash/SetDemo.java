package com.yash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
 public static void main(String [] args)
 {
	 Set set = new HashSet();
	 set.add(new Order(10));
	 set.add(new Order(20));
	 set.add(new Order(20));
	 set.add(new Order(25));
	 Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next()); 
		}
 }
}
