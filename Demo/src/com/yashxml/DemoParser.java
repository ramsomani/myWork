package com.yashxml;
	import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
	
	public class DemoParser {
	   public static void main(String[] args) throws UserException{

		   try {

				File fXmlFile = new File("mobile.xml");
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(fXmlFile);
				doc.getDocumentElement().normalize();
				NodeList nList = doc.getElementsByTagName("mobile");
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter the model name");
				String string=scanner.next();

				for (int temp = 1; temp < nList.getLength(); temp++) {

						Node nNode = nList.item(temp);
							
				

						Element eElement = (Element) nNode;
						if(string.equals(eElement.getElementsByTagName("Name").item(0).getTextContent()))
						{
						System.out.println("Mobile id : " + eElement.getElementsByTagName("Id").item(0).getTextContent());
						System.out.println("Mobile Name : " + eElement.getElementsByTagName("Name").item(0).getTextContent());
						System.out.println("Mobile Color : " + eElement.getElementsByTagName("Color").item(0).getTextContent());
						}
						else
						{
							throw new UserException("Please enter known device");
						}
					}
				
				
			    }
		   catch(UserException ue)
		   {
			   System.out.println("Please Be Specific With Your Device Name");
		   }
		   catch (Exception e) {
				e.printStackTrace();
			    }
		   
			  }
	   }
	

