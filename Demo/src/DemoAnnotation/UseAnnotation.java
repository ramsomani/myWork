package DemoAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;




public class UseAnnotation  {
	
	@Simple(message="Ram " ,location="d://xyz.txt")
	void display()
	{
		System.out.println("hii");
	}
	
}
