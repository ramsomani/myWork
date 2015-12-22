package mylibrary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyLibrary extends Thread {
	List personList=new ArrayList();
	List bookList=new ArrayList();
			
	public void run() {
		
	}
	
	public void addPerson(Person person)
	{
		 personList.add(person);		
		
	}
	
	public void addBook(Book book)
	{
		bookList.add(book);
		 
	}
	public void removePerson(String name1)
	{
		Iterator iterator=personList.iterator();
		while(iterator.hasNext())
		{
			Person person1 = (Person) iterator.next();

			String name = person1.getPname();

			if (name.equalsIgnoreCase(name1)) {
			iterator.remove();
			}
		}
			
		
	}
	
	public void removeBook(Book book)
	{
		Iterator iterator=bookList.iterator();
		while(iterator.hasNext())
		{
			Book book1 = (Book) iterator.next();
			int id=book.getId();
			
			if (id==book.getId())
			{
			iterator.remove();
			}
		}
		
		 
	}
	
	
	public void getBookDetails()
	{
		Iterator iterator=bookList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	

	public void getPersonDetails()
	{
		Iterator iterator=personList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
	
	public void CheckIn(int bid,String pname)
	{
		
		
		
	}

	
	
					
					

	
	
	
}


