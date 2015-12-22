package com.yash.test;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Map<Integer,String> m=new TreeMap<>();
		/*TreeSet<Employee> hs=new TreeSet<>();
		System.out.println("adding elements to hashSet");
		hs.add(new Employee(1,"ram"));
		hs.add(new Employee(2, "lakhan"));
		hs.add(new Employee(3, "kush"));
		hs.add(new Employee(4, "deep"));*/
		m.put(1, "ram");
		m.put(2, "lakhan");
		m.put(3, "kush");
		
		for (Map.Entry<Integer, String> entry : m.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		/*Iterator<Employee> iterator=hs.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
*/
	}

}
