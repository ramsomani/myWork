package DemoAnnotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

import jdk.jfr.events.FileWriteEvent;


public class Test {
	public static void main(String[] args) 
	{
		Class clazz = UseAnnotation.class;
		
		try {
			
			Method m=clazz.getDeclaredMethod("display");
			Simple a =m.getAnnotation(Simple.class);
			System.out.println(a.message());
			File file = new File(a.location());
			/*if(!file.exists())
			{
				
					file.createNewFile();
				 
			}*/
			
				FileWriter fw = new FileWriter(file);
				fw.write(a.message());
				fw.close();
				System.out.println("Reading a file");
				FileReader fr=new FileReader(file);
				char [] read = new char[50];
			    fr.read(read); 
			    for(char c : read)
			      System.out.print(c); 
			      fr.close();
			} 
		
		catch (NoSuchMethodException | SecurityException | IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
		
	
		
	}
}
