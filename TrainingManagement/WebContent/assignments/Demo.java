import java.util.*;
import java.lang.*;

class Employee implements Comparable {
		private int id;
		private String name;
		public Employee(){}
		public Employee(int id,String name){
				this.id=id;
				this.name=name;
		}
		
		public String getName(String name){
			return this.name;
		}
		public void SetName(String  name){
			 this.name=name;
		}
		
		public int compareTo(Object obj){
			Employee emp=(Employee) obj;
			return this.name.compareTo(emp.name);
		}
		
		
		
}
public class Demo
{		
		public static void main(String args[])
	{
		Set<Employee> ts=new TreeSet<Employee>();
		ts.add(new Employee(1,"abc"));
		ts.add(new Employee(2,"xyz"));
		
			Iterator itr=ts.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		
	}
	
}
