package com.studenttribe.corejava.interfaces;
// 3. All Interfaces are by default Abstract classes
// 4. we can declare more than one interface methods
// 5. we must declare all the interface methods in class if not we get syntax error
public class InterfaceDemo1 implements InterfaceMain1 {
	public void method1() {
		System.out.println("Interface Method 1");
	}
	public void method2() {
		System.out.println("Interface Method 2");
	}
	public void method3() {
		System.out.println("Interface Method 3");
	}
	public static void main(String[] args) {
		InterfaceMain1 i = new InterfaceDemo1();
		i.method1();
		i.method2();		
		i.method3();
	}
}
