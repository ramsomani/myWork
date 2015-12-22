package com.yash;

import java.util.HashMap;

public class DuplicateCharacter {
	String str;
	public DuplicateCharacter(String str)
	{
		this.str=str;
	}
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	public static void main(String[]args)
	{
		DuplicateCharacter dc=new DuplicateCharacter("raaam");
		HashMap<String,String> hm=new HashMap<String, String>();
		hm.put("string",dc.getStr());
		String s=hm.get("string");
		//char[] chrs = s.toCharArray();
		//ArrayCheck ac = new ArrayCheck();
		 
		dc.duplicate(s);
		 
		
	}
	void duplicate(String s){
		    
		    //str=s;
			int distinct = 0;
			
		    for (int i=0; i < s.length(); i++) {

		        for (int j = 0; j < s.length(); j++) {

		            if(s.charAt(i)==s.charAt(j))
		            {
		                distinct++;
		            }
		            
		        }   
		        
		        //String d=String.valueOf(s.charAt(i));
		        System.out.println(s.charAt(i)+"--"+distinct);
		        
		        distinct = 0;

		    }
		   
		
		
	}
}

