package com.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.*;
import com.domain.Account;
import com.domain.Register;

public class Presentation {
	public static void main(String... args) {
		Register register = new Register();
		Account account = new Account();
		Registerdao registerdao = new Registerdao();
		Logindao logindao = new Logindao();
		Bankdao bankdao=new Bankdao();
		Accountdao accountdao = new Accountdao();
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("1.Register \n2.Login \n3.Exit \n");
			System.out.println("Enter your choice");
			int a = scanner.nextInt();
			switch (a) {
			case 1:
				
				System.out.println("Enter the name");
				String name = scanner.next();
				System.out.println("Enter the password");
				String password = scanner.next();
				register.setName(name);
				register.setPassword(password);
				registerdao.save(register);

				break;
			case 2:
				System.out.println("Enter the name");
				String name1 = scanner.next();
				System.out.println("Enter the password");
				String password1 = scanner.next();
				register.setName(name1);
				register.setPassword(password1);
				int s = logindao.check(register);
				if (s == 0)
					System.out.println("please check your credentials");
				else {
					
					System.out.println("Enter Salary");
					int salary = scanner.nextInt();
					account.setAccBalance(salary);
					bankdao.save(account);
					
					do {
						System.out
								.println("1.Deposit \n2.Withdraw \n3.Available Balance \n4.Transfer \n5.Exit \n");
						System.out.println("Enter your choice");
						int a1 = scanner.nextInt();
						switch (a1) {
						case 1:
							System.out.println("Enter the id ");
							int id1 = scanner.nextInt();
							System.out.println("Enter the amount to deposit");
							int amount = scanner.nextInt();
							accountdao.deposit(id1, amount);
							break;
						case 2:
							System.out.println("Enter the id ");
							int id2 = scanner.nextInt();
							System.out.println("Enter the amount to withdraw");
							int amount1 = scanner.nextInt();
							accountdao.withdraw(id2, amount1);
							break;
						case 3:
							System.out.println("Enter the id");
							int id3 = scanner.nextInt();
							List<Account> list = new ArrayList<Account>();
							list = accountdao.display(id3);
							for (Account ac : list) {
								System.out.println(ac);
							}
							break;
						case 4:
							List<Account> list1 = new ArrayList<Account>();
							list1 = accountdao.show();
							for (Account ac : list1) {
								System.out.println(ac);
							}
							System.out.println("Enter current account id");
							int id4 = scanner.nextInt();
							System.out.println("Enter beneficiery account id");
							int id5 = scanner.nextInt();
							System.out.println("Enter amount to be transfered");
							int bal = scanner.nextInt();
							accountdao.transfer(id4, id5, bal);
							break;
						case 5:
							System.exit(0);
							break;
							
						}
					} while (true);

				}
				break;
			case 3:
				main();

			default:
				System.out.println("please select the correct input");
			}
		} while (true);
	}
}
