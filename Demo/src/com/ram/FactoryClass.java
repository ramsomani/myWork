package com.ram;

import java.util.Scanner;

public class FactoryClass {
	public FactoryClass(){
		String input;
		System.out.println("enter the object to be created");
		Scanner scanner=new Scanner(System.in);
		input=scanner.next();
		switch(input)
		{
		case "employee":
			Employee employee=new Employee();
			break;
		case "manager":
			Manager manager=new Manager();
			break;
		case "trainee":
			Trainee trainee=new Trainee();
			break;
		default:
			System.out.println("please select the apropriate class");
	
}
}
}
