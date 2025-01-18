package com.studenttribe.corejava.interfaces;
// 7. Multiple Inheritance can work through interfaces

public class InterfaceDemo3 implements InterfaceMain3, InterfaceMain4 {
	public void method6() {
		System.out.println("Interface Method 6");
	}
	public void method7() {
		System.out.println("Interface Method 7");
	}
	public void method8() {
		System.out.println("Interface Method 8");
	}
	public void method9() {
		System.out.println("Interface Method 9");
	}
	public void method10() {
		System.out.println("Interface Method 10");
	}
	public void display() {
		System.out.println("class method");
	}
	public static void main(String[] args) {
		InterfaceMain3 i = new InterfaceDemo3();
		InterfaceMain4  i1 = new InterfaceDemo3();
		i.method6(); // Interface Method
		i.method7();		
		i.method8();
		i1.method9();
		i1.method10();
		InterfaceDemo3 ci = new InterfaceDemo3();
		ci.display(); // Class Method
	}
}
