package com.yash;


	import java.util.*;

	class NoOfOcc{
	static int count=0;
	 
	public static void main(String []args){
	String input = "QWERTYQWERTY";
	System.out.println("Enter Char to be Searched: ");
	Scanner sc = new Scanner(System.in);
	String r = sc.next();
	char r1 = r.charAt(0);
	 
	for(int i=0;i<input.length();i++){
	if(input.charAt(i)==r1){
	count++;}
	}
	System.out.println("Enter Char has occoured " +count + "times");
	}
	}


