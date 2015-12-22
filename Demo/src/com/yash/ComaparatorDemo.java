package com.yash;

import java.util.*;

	public class ComaparatorDemo  {
			public static void main(String args[])
			{
		
				Customer cust1=new Customer(23);
				Customer cust2=new Customer(24);
				Customer cust3=new Customer(20);
				Customer cust4=new Customer(24);
				Customer[] cust ={cust1,cust2,cust3,cust4};
				
				Arrays.sort(cust,new Customer());
				for(Customer c : cust){
					System.out.println(c.age);
				}
			} 
}
