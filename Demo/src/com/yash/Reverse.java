package com.yash;
import java.util.*;

public class Reverse {


	static int count;
	static int i;
    public static void main(String []args)
    {
      
        Scanner sc=new Scanner(System.in);
        sc.useDelimiter("\r\n");
        String str;
        str=sc.next();
        //String d="";
       /* for(int i=0; i<str.length(); i++){
             if (str.charAt(i) == ' ') {
                 count++;
            }
        }*/
        
        String s[]=new String[1];
        
        int j=0;
        s[0]="";
        for(i=0;i<str.length();i++)
        {	
        	if(str.charAt(i)!=' ')
        	{
        	
        			s[j] = s[j] + str.charAt(i);
        			
        	}
        	else{
        		s = (String[]) Arrays.copyOf(s, s.length+1);
        		j++;
        		s[j]="";
        	}
        }
        
        System.out.print("The reverse is:-  ");
       for(int i=s.length-1;i>-1;i--){
    	   System.out.print(s[i]+" ");
       }
    }

        
      
             
      
        
    
    
    
    
    
    }
    


