package com.yash.demorest.test;

import javax.inject.Inject;

public class TestAnnotation {

	
	
	@Inject
	String string;
	public void getString(){
		System.out.println(string);
	}
	
	public static void main(String[] args) {
		TestAnnotation t=new TestAnnotation();
		t.getString();
		
	}
	
}
