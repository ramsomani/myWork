package com.yash;

import java.util.Comparator;

public class YashEmploy implements Comparable{
		Integer id;
		String name;
		Integer age;
		Double salary;
		public YashEmploy(){}
	 public YashEmploy(Integer id, String name, Integer age, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String toString()
	{
		return "ID : " + this.id  + "name : " +  this.name + "AGE  : " + this.age + "SALARY : " + this.salary;
	}

	public int compareTo(Object arg0) {
		YashEmploy obj1=(YashEmploy)arg0;
		 
		return this.name.compareTo(obj1.name);
			
		
	}
     

}
