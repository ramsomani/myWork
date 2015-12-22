package com.yash;


import java.util.*;

public class MapDemo{
	Integer id;
	String name;
	Integer age;
	Double salary;
	 public MapDemo(Integer id, String name, Integer age, Double salary) {
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
@Override
public String toString() {
	return "MapDemo [id=" + id + ", name=" + name + ", age=" + age
			+ ", salary=" + salary + "]";
}
    
    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        MapDemo m=(MapDemo) obj;
        
        if(this.id==m.id)
            return true;
            return false;
    }

    public static void main(String args[]){
        
        //Map<MapDemo,String> myMap = new HashMap<MapDemo, String>();
       
        MapDemo mapDemo = new MapDemo(1,"rawat",22,10000d);
        MapDemo mapDemo1 = new MapDemo(2,"merwani",22,10000d);
        MapDemo mapDemo2 = new MapDemo(3,"vatsa",22,1000000d);
        MapDemo mapDemo3 = new MapDemo(4,"somani",22,100000d);
        MapDemo mapDemo4 = new MapDemo(5,"yadav",22,100000d);
        
        //Map myMap=new HashMap();
       
        Map myMap=new HashMap();
        myMap.put(mapDemo.getName(),mapDemo.getSalary());
        myMap.put(mapDemo1.getName(),mapDemo1.getSalary());
        myMap.put(mapDemo2.getName(),mapDemo2.getSalary());
        myMap.put(mapDemo3.getName(),mapDemo3.getSalary());
        myMap.put(mapDemo4.getName(),mapDemo4.getSalary());
        
        //Set set = myMap.keySet();
        
        System.out.println(myMap);
    }
	

    
    
}