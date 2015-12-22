package com.yash;

import java.util.Comparator;


public class CompareAge implements Comparator {
	public int age;
	public CompareAge(){}
		public CompareAge(int age)
		{
			this.age=age;
		}
			  
public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
	YashEmploy obj1=(YashEmploy)arg0;
	YashEmploy obj2=(YashEmploy)arg1;
			 
			if(obj1.age>obj2.age)
				return 1;
			else
		return -1;
}
}