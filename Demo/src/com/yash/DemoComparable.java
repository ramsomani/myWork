package com.yash;

public class DemoComparable implements Comparable {
	public int age;
	public DemoComparable(){}
		public DemoComparable(int age)
		{
			this.age=age;
		}
	public int compareTo(Object arg0) {
		YashEmploy obj1=(YashEmploy)arg0;
		 
		if(this.age>obj1.age)
			return 1;
		else
	return -1;
		
	}
}
