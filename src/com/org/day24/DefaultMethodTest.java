package com.org.day24;

public class DefaultMethodTest implements A,B {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		A.super.print();
		B.super.print();
		System.out.println("Override A");
	}
	public static void main(String[] args) {
		DefaultMethodTest testobj = new DefaultMethodTest();
		testobj.print();
		
		B.sayHello();
	}

}

interface A{
	default void print() {
		System.out.println("Interface A");
	}
}

interface B{
	default void print() {
		System.out.println("Interface B");
		hello();
	}
	
	private void hello() {
		System.out.println("Says hello");
	}
	
	static void sayHello() {
		System.out.println("Inside static method");
		staticHello();
	}
	private static void staticHello() {
		System.out.println("static hello");
	}
}

