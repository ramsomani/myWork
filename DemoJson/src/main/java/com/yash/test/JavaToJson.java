package com.yash.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class JavaToJson {
	public void convertJavaToJson(){  
	    	
		  // simple object from student domain class  
		  Student student = new Student();  
		    
		  // added some data to student's object  
		  ArrayList<String> interests = new ArrayList<String>();  
		  interests.add("friends");  
		  interests.add("helping");  
		  interests.add("exploring");  
		    
		  student.setId(1);  
		  student.setFirstName("Lakhan");  
		  student.setLastName("Somani");  
		  student.setGender("male");
		  student.setCity("indore");
		  student.setInterests(interests);  
		    
		  // obtained Gson object   
		  Gson gson = new Gson(); 
		  FileWriter file;
		try {
			file = new FileWriter("json/student.json");
			file.write(gson.toJson(student));
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		/* File file = new File("json/student.json");
		  try {
			if (file.createNewFile()){
			        System.out.println("File is created!");
			        FileWriter fileWritter = new FileWriter(file.getName(),true);
			        BufferedWriter bufferWritter = new BufferedWriter(fileWritter);	        
			        String str=gson.toJson(student);
			        bufferWritter.write(str);
			        bufferWritter.flush();
			        bufferWritter.close();
			        fileWritter.write(str);
			        fileWritter.append(str);
			        fileWritter.flush();
			        fileWritter.close();
			        
			      }
			else{
			        System.out.println("File already exists.");
			     }
	

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		  // called toJson() method and passed student object as parameter  
		  // print generated json to console  
		  System.out.println(gson.toJson(student));  
		    
		  }  
}
