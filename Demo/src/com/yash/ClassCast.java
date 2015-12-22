package com.yash;

class Animal {

	public void show() {
		System.out.println("hello from class A");
	}

}

class Dog extends Animal {

	public void show() {
		System.out.println("hello from class B");
	}
}

public class ClassCast {
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Animal a1 = (Dog) new Dog();
		if (a instanceof Dog) {
			System.out.println("Comparison is successfull");

		}
	}
}
