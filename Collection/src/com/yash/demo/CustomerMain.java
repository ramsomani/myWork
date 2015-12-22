package com.yash.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CustomerMain {

	public static void main(String[] args) {
		
		//Set<Customer> set=new TreeSet<>(new Customer());
		Set<Customer> set=new HashSet<>();
		set.add(new Customer(3,"rama"));
		set.add(new Customer(2, "lakhan"));
		set.add(new Customer(1,"sj"));
		set.add(new Customer(1,"sj"));
		set.add(new Customer(4, "lakhana"));
		set.add(new Customer(5,"ramaa"));
		set.add(new Customer(6, "lakhanaa"));
		Iterator<Customer> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
