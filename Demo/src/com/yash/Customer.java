package com.yash;

import java.util.Comparator;

	public class Customer implements Comparator {
			public int age;
			public Customer(){}
				public Customer(int age)
				{
					this.age=age;
				}
					  
	public int compare(Object arg0, Object arg1) {
				// TODO Auto-generated method stub
					Customer obj1=(Customer)arg0;
					Customer obj2=(Customer)arg1;
					 
					if(obj1.age>obj2.age)
						return 1;
					else
				return -1;
	}
	}
