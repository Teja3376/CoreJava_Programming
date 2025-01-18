package com.studenttribe.corejava.interfaces;


public class InterfaceDemo2 implements InterfaceMain2 {
	public void method1() {
		System.out.println("Interface Method 1");
	}
	public void method2() {
		System.out.println("Interface Method 2");
	}
	public void method3() {
		System.out.println("Interface Method 3");
	}
	public void method4() {
		System.out.println("Interface Method 4");
	}
	public void method5() {
		System.out.println("Interface Method 5");
	}
	public static void main(String[] args) {
		InterfaceMain2 i = new InterfaceDemo2();
		i.method1();
		i.method2();		
		i.method3();
		i.method4();
		i.method5();
	}
}
