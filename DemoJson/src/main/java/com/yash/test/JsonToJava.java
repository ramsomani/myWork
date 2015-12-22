package com.yash.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

public class JsonToJava {
	public void jsonToJava(){  
	    
		  try {   
		   // obtained a file object from json file  
		   File file = new File("json/student.json");  
		  
		   // get json as buffer  
		   BufferedReader br = new BufferedReader(new FileReader(file));  
		  
		   // obtained Gson object  
		   Gson gson = new Gson();  
		  
		   // called fromJson() method and passed incoming buffer from json file  
		   // passed student class reference to convert converted result as Student object  
		   Student student = gson.fromJson(br, Student.class);  
		     
		   // printed student data on console  
		   System.out.println("id: "+student.getId()+" First Name:"+student.getFirstName()  
		   +" Last Name: "+student.getLastName()+" Gender: "+student.getGender()+" City: "+student.getCity());  
		     
		   System.out.println("Interests: ");  
		   for(int i=0;i<=student.getInterests().size()-1;i++){  
		    System.out.println(student.getInterests().get(i));  
		   }  
		     
		  } catch (FileNotFoundException e) {  
		   e.printStackTrace();  
		  }  
		    
		    
		 }  
}
