package com.yash.demo;

 class Test extends RuntimeException{
	public Test(){}
	 public Test(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}

 class TestExcep extends Test{
	public void get() throws Test
	{
		throw new RuntimeException("hgh");
	}

}
 
 class TestMain{
	 public static void main(String[] args) {
		TestExcep t=new TestExcep();
		t.get();
	}
 } 