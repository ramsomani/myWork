package com.yash;

 class DemoPrint1 {
 static{
	 System.out.println("static 1");
 }
 {
	 System.out.println("instance 1");
 }
 DemoPrint1()
 {
	 System.out.println("counstructor 1");
 }
}
class DemoPrint2 extends DemoPrint1 {
	 static{
		 System.out.println("static 2");
	 }
	 {
		 System.out.println("instance 2");
	 }
	 DemoPrint2()
	 {
		 System.out.println("counstructor 2");
	 }
	}

public class DemoPrint{
	public static void main(String []args)
	{
	System.out.println("hello");
	DemoPrint2 dm=new DemoPrint2();	
	//System.out.println("hello");
	}
	}

