package com.yash;

import java.util.Comparator;


	public class CompareSalary implements Comparator {
		public int salary;
		public CompareSalary(){}
			public CompareSalary(int salary)
			{
				this.salary=salary;
			}
				  
public int compare(Object arg0, Object arg1) {
			// TODO Auto-generated method stub
	YashEmploy obj1=(YashEmploy)arg0;
	YashEmploy obj2=(YashEmploy)arg1;
				 
				if(obj1.salary>obj2.salary)
					return 1;
				else
			return -1;
}
	}

