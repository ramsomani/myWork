package com.yash.demo;

 abstract class xyz{
	static int a=10;
	public xyz() {
		
	}
	public abstract void show();

}



public class AbstractDemo  extends xyz{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(a);	
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		AbstractDemo ac=new AbstractDemo();
		ac.show();
		xyz az;
		az =new AbstractDemo();
		az.show();
		try {
			Class<?> pq = Class.forName("xyz");
			xyz xz = (xyz) pq.newInstance();
			xz.show();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
