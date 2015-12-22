package com.yash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class YashEmployDemo {
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		
		al.add(new YashEmploy(1,"ram",22,20000d));
		al.add(new YashEmploy(2,"lakhan",20,20000d));
		al.add(new YashEmploy(3,"deepak",23,20000d));
		al.add(new YashEmploy(4,"saransh",26,20000d));
		al.add(new YashEmploy(5,"sameer",27,20000d));
		al.add(new YashEmploy(6,"rahul",28,20000d));
		al.add(new YashEmploy(7,"kunal",29,20000d));
		al.add(new YashEmploy(8,"kamal",29,20000d));
		al.add(new YashEmploy(9,"palash",20,20000d));
		al.add(new YashEmploy(10,"prakhar",18,20000d));
		Collections.sort(al);
		//Collections.sort(al,new CompareAge());
		//Collections.sort(al,new CompareSalary());
		Iterator iterator=al.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next()); 
		}
	}
}
