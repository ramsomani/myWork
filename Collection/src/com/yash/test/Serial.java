package com.yash.test;

import java.io.Serializable;

public class Serial implements Serializable{
		public String name;
	   public String address;
	   public transient int SSN;
	   public int number;
	   
	   public void mailCheck()
	   {
	      System.out.println("Mailing a check to " + name + " " + address);
	   }
	
	  
	    
	    
}
