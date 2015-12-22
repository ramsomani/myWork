package com.yash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {
	
		   public static void main(String[] args) {
		   // create vector object 
		   List list = new ArrayList();
		      
		   // populate the list
		   list.add("1");
		   list.add("2");
		   list.add("3");
		   list.add("4");
		   list.add("5");
		      
		   // create a synchronized list
		   List synlist = Collections.synchronizedList(list);
		     
		   System.out.println("Sunchronized list is :"+synlist);
		   }
}

