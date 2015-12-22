package com.yash.demo;

import java.util.Comparator;

public class Customer implements Comparator {
	private int id;
	private String name;
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
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	/*@Override
	public int compareTo(Customer o) {
		int c=0;
		if(o.id>this.id)
			c=-1;
		if(o.id<this.id)
			c=1;
		return c;
	}*/
	 public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compare(Object o,Object o1){
		Customer cus=(Customer)o;
		Customer cus1=(Customer)o1;
		int c=0;
		if(cus.id>cus1.id)
			c=-1;
		if(cus.id<cus1.id)
			c=1;
		return c;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
