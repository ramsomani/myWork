package com.yash.demo;

public class CustomerImpl implements CustomerIntf {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		CustomerImpl c=new CustomerImpl();
		c.show();
	}

}
