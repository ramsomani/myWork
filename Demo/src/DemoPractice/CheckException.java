package DemoPractice;




class Test1 extends Exception{}

public class CheckException {
		 
	
	  public static void main(String args[]) {
	   // some other stuff
	   try {
	       
	       throw new Test1();
	    }
	 
	   
	   catch(Test1 b)     { 
	       System.out.println("Caught base class exception"); 
	    }
	   
	   
	   
	  }
	} 

