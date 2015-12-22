package com.useconnection;

import java.util.Scanner;

import com.mysql.UseMysql;
import com.oracle.UseOracle;

public class MyConnections {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		do{
		System.out.println("1 MySql  \n2 Oracle \n3 Exit \n");
		System.out.println("Enter your choice");
		int a=scanner.nextInt();
		
		switch(a)
		{
		case 1:
			UseMysql um=new UseMysql();
			um.connect();
			um.disconnect();
			break;
		case 2:
			UseOracle uo=new UseOracle();
			uo.connect();
			uo.disconnect();
			break;
		case 3:
			System.exit(0);
			default:
				System.out.println("please check your options");
		}
		}while(true);
	

}
}

