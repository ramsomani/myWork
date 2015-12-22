package com.yash.demo;


class A{
	public static void  gett(){
		System.out.println("A");
	}
	
}

class B extends A
{
	
	public static void  gett(){
		System.out.println("A");
	}
}
public class TestAbstract {
	public static void main(String[] args) {
		String s1="ram";
		String s2="somani";
		s1=s1+s2;
		System.out.println(s1);
		A a=new B();
		B b=new B();
		b.gett();
		a.gett();

	}
}
