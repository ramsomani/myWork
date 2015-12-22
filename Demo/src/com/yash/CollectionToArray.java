package com.yash;
import java.util.*;


public class CollectionToArray {

	   public static void main(String[] args){
	      List<String> list = new ArrayList<String>();
	      list.add("This "); 
	      list.add("is "); 
	      list.add("a ");
	      list.add("good ");
	      list.add("program.");
	      String[] s1 = list.toArray(new String[0]); 
	      String[] s2=list.toArray(new String[1]);
	      for(int i = 0; i < s2.length; ++i){
	         String contents = s2[i];
	         System.out.print(contents);
	     } 
	   }
	}

