package com.yash;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

 interface DemoGenricInterface<E> {
	void add(E x);
	Iterator<E> iterator();
}


public class DemoInterface<List, E> implements DemoGenricInterface<List> {

	public void add(List x) {
		// TODO Auto-generated method stub
		
	
	}

	public Iterator<List> iterator() {
		// TODO Auto-generated method stub
		
		return null;
	}
	
	public static void main(String...args)
	{
		
		
	}

}

