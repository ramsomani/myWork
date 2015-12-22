package com.yash.demo;

 class Abc {
	private Abc(){}
	private static Abc a=new Abc();
	public static Abc getInstance(){
		return a;
	}
}
public  class Demo {
public static void main(String[] args) {
	Abc ac=Abc.getInstance();
	System.out.println(ac);
}
}
