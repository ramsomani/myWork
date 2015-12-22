package com.yash.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeMap<Integer,String> map=new TreeMap<>();
		Map<Integer, String> map=new HashMap<>();
		Employee e=new Employee(1,"ram");
		Employee e1=new Employee(2, "lakhan");
		Employee e7=new Employee(2,"lakhan");
		Employee e2=new Employee(3, "lakhan1");
		Employee e3=new Employee(4,"ram1");
		Employee e4=new Employee(5, "lakhan2");
		Employee e5=new Employee(1,"ram");
		Employee e6=new Employee(6, "lakhan12");
		map.put(e.getId(), e.getName());
		map.put(e1.getId(), e1.getName());
		map.put(e2.getId(), e2.getName());
		map.put(e3.getId(), e3.getName());
		map.put(e4.getId(), e4.getName());
		map.put(e5.getId(), e5.getName());
		map.put(e6.getId(), e6.getName());
		map.put(e7.getId(), e7.getName());
		for(Map.Entry<Integer, String> entry:map.entrySet()){
			System.out.println(entry.getValue()+"//"+entry.getKey());
		}
	}

}
