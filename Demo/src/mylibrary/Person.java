package mylibrary;

import java.util.ArrayList;
import java.util.List;

public class Person {
	public String pname;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Person [pname=" + pname + "]";
	}

	 
	
}
