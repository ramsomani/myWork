package com.yash.domain;

public class Test {
public void show()
{
	System.out.println("hii from show");
}
public void display()
{
	System.out.println("hii from display");
}


public static void main(String[] args) {
	Test t=new Test();
	t.display();
	t.show();
}
}
