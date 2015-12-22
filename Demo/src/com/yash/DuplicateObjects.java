
package com.yash;
import java.util.*;
public class DuplicateObjects {
	
	

	    public static void main(String[] args) {
	        
	        List myList = new ArrayList();
	        myList.add(1);
	        myList.add(2);
	        myList.add(2);
	        myList.add(3);
	        
	        System.out.println(myList);
	        
	        Set mySet = new LinkedHashSet(myList);
	        //System.out.println("Set element");
	        Iterator iterator = mySet.iterator();
	        while (iterator.hasNext()) {
	        System.out.print(iterator.next() + " ");
	        }
	    }

	}

