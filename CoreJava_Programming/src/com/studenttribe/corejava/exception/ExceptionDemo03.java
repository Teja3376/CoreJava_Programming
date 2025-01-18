package com.studenttribe.corejava.exception;
// finally Block
public class ExceptionDemo03 {
public void mydata() {
	System.out.println("one");
	String name = null;
	try {
	System.out.println(name.length());
	int n = 2;
	int t = n/0;
	System.out.println(t);
	}
//	catch(ArithmeticException e) {
//		System.out.println("I can Handle " +e );
//	}
	catch(NullPointerException e) {
		System.out.println("I can Handle " +e );
	}
	finally {
		System.out.println("End");
	}
}
public static void main(String[] args) {
	ExceptionDemo03 e = new ExceptionDemo03();
	e.mydata();
}
}
