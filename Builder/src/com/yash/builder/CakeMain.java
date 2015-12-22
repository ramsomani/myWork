package com.yash.builder;

public class CakeMain {
	public static void main(String[] args) {
		Cake cake=new Cake.builder("chaoclate", 2, 3).build();
		System.out.println(cake.getFlavor());
		System.out.println(cake.getPound());
	}
}
