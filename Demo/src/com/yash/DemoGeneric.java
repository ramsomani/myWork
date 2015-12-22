package com.yash;

public class DemoGeneric<T> {
	private T t;
	public void add(T t)
	{
		this.t=t;
	}
	public T get()
	{
		return t;
	}
	public static  void main(String...agrg)
	{
		DemoGeneric<Integer> integerBox=new DemoGeneric<Integer>();
		DemoGeneric<String> stringBox=new DemoGeneric<String>();
		integerBox.add(new Integer(10));
		stringBox.add(new String("Hello World"));
		System.out.println("Integer value"+integerBox.get());
		System.out.println("String value"+stringBox.get());
	}
}
