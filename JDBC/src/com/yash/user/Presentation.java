package com.yash.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yash.dao.Customerdao;
import com.yash.domain.Customer;

public class Presentation {

	public static void main(String[] args) {
		Customer customer = new Customer();

		Scanner scanner = new Scanner(System.in);

		Customerdao customerdao = new Customerdao();

		do {
			System.out
					.println("1.Add Customer \n2.Display Customer \n3.Update Customer \n4.Remove Customer\n");
			System.out.println("enter your choice");
			int ch = scanner.nextInt();
			switch (ch) {
			case 1:

				System.out.println("Enter the name");
				String name = scanner.next();
				customer.setName(name);
				System.out.println("Enter the address");
				String address = scanner.next();
				customer.setAddress(address);
				customerdao.save(customer);
				break;
			case 2:
				List<Customer> list=new ArrayList<Customer>();
				list = customerdao.select();
				for(Customer c : list){
					System.out.println(c);					
				}
				break;
			case 3:
				System.out.println("enter the id");
				int id1 = scanner.nextInt();
				System.out.println("enter the name");
				String name1 = scanner.next();
				customerdao.update(id1, name1);
				break;
			case 4:
				System.out.println("enter the id");
				int id2 = scanner.nextInt();
				customerdao.delete(id2);
				break;
			default:
				System.out.println("please select valid option");
			}
		} while (true);
	}
	

}
