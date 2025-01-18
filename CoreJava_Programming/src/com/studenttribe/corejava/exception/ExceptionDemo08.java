package com.studenttribe.corejava.exception;

public class ExceptionDemo08 {
	public void mydata() throws Exception{
		System.out.println("One");
		String name = "null";
		int n=0;
		System.out.println(name.length());
		int t=10/n;
		System.out.println(t);
		System.out.println("end");
	}
	public void mychange() throws Exception{
		System.out.println("My Change");
		mydata();
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo08  ed = new ExceptionDemo08();
			ed.mychange();
		}
		catch (Exception e){
			System.out.println("I can handle"+e);
		}
	}
}
