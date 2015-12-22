package com.yash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EnterDemo {
	public static void main(String args[])
	{
		EnterDemo ed=new EnterDemo();
		Set set =new HashSet();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String sname=sc.next();
		System.out.println("enter age");
		int sage=sc.nextInt();
		set.add(ed);
		Iterator itr=set.iterator();
		System.out.println(set);
	}

}
