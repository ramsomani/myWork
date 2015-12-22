package com.yash.test;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee o) {
		//Employee emp=(Employee)o;
		int c=0;
		if(this.id>o.id)
			c=-1;
		else c=1;
		return c;
	}
	
	
	
}
