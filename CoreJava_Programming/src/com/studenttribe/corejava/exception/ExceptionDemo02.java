package com.studenttribe.corejava.exception;
//Only Try and catch
public class ExceptionDemo02 {
	public void myData() {
		System.out.println("one");
		String name = null;
		try {
			System.out.println(name.length());
			System.out.println("end");
		}
		catch (Exception e) {
			System.out.println("I can Handle " +e);
		}
	}
public static void main(String[] args) {
	ExceptionDemo02 e = new ExceptionDemo02();
	e.myData();
}
}
