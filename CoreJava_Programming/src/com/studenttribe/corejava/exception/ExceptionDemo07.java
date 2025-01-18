package com.studenttribe.corejava.exception;

public class ExceptionDemo07 {
	public void mydata() throws Exception{
		System.out.println("One");
		String name = "null";
		int n=0;
		System.out.println(name.length());
		int t=10/n;
		System.out.println(t);
		System.out.println("end");
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo07  ed = new ExceptionDemo07();
			ed.mydata();
		}
		catch (Exception e){
			System.out.println("I can handle"+e);
		}
	}
}
