package mylibrary;

import java.util.Iterator;
import java.util.Scanner;

public class TestLibrary extends Thread{
public static void main(String[] args) {
	MyLibrary mylib=new MyLibrary();
	
	/*MyLibrary myLibrary1=new MyLibrary();
	MyLibrary myLibrary2=new MyLibrary();
	MyLibrary myLibrary3=new MyLibrary();
	Thread thread1=new Thread(myLibrary1);
	Thread thread2=new Thread(myLibrary2);
	Thread thread3=new Thread(myLibrary3);
	thread1.start();
	thread2.start();
	thread3.start();*/
	int a;
	Scanner sc=new Scanner(System.in);
	
	do{
		System.out.println("1.Add Person \n2.Add Book \n3.Remove Person \n4.Remove Book \n5.View Books \n6.View Person \n0.Exit");
		System.out.println("Enter your choice");
		a=sc.nextInt();
	switch(a)
	{
	case 1:
	
		String pname;  
		Person person=new Person();
		System.out.println("Enter the person name");
		pname=sc.next();
		person.setPname(pname);
		mylib.addPerson(person);
		break;
	case 2:
		String title,author,bname;
		int id;
		Book book=new Book();
		System.out.println("Enter the book id");
		id=sc.nextInt();
		book.setId(id);
		System.out.println("Enter the book title");
		title=sc.next();
		book.setTitle(title);
		System.out.println("Enter the book author");
		author=sc.next();
		book.setAuthor(author);
		System.out.println("Enter the book name");
		bname=sc.next();
		book.setName(bname);
		mylib.addBook(book);
		break;
	case 3:
		String rpname;  
		Person person1=new Person();
		System.out.println("Enter the person name");
		rpname=sc.next();
		person1.setPname(rpname);
		mylib.removePerson(person1.getPname());
		break;
	case 4:
		
		int id1;
		Book book1=new Book();
		System.out.println("Enter the book id");
		id1=sc.nextInt();
		book1.setId(id1);
		mylib.removeBook(book1);
		break;
	case 5:
		mylib.getBookDetails();
		break;
	case 6:
		mylib.getPersonDetails();
		break;
	case 7:
			int bid;
			String pname2;
			System.out.println("Enter the book name");
			bid=sc.nextInt();
			System.out.println("Enter the person name");
			pname2=sc.next();
			mylib.CheckIn(bid,pname2);
			break;
	case 0:
		System.exit(0);
		
		default:
			System.out.println("please select the valid input");
			break;
}


	}while(true);
}
}

