package com.yash;
import java.util.*;
public class SynchronizedSet {
	

	
	   public static void main(String[] args) {
	   // create set
	   Set set = new HashSet();
	      
	   // populate the set
	   set.add("TP");
	   set.add("IS");
	   set.add("FOR");
	   set.add("ABC");
	      
	      
	   // create a synchronized set
	   Set synset = Collections.synchronizedSet(set);
	     
	   System.out.println("Synchronized set is :"+synset);
	  }
	}

