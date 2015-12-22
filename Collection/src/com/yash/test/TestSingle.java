package com.yash.test;

import java.io.Serializable;

public class TestSingle implements Serializable {
	 	private static TestSingle singleton = new TestSingle();
	   private TestSingle(){}
	   public static TestSingle getInstance( ) {
		      return singleton;
		 }
	   public static void main(String[] args) {
		      TestSingle tmp = TestSingle.getInstance( );
		      System.out.println(tmp.hashCode());
		 }
}
