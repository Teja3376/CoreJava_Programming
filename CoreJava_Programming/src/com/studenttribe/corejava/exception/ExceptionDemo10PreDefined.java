package com.studenttribe.corejava.exception;

public class ExceptionDemo10PreDefined {
	String name = null;
	public void mydata() throws Exception {
		if(name == null) {
			throw new NullPointerException("Null Is Pointer");
		}
		else
			System.out.println(name);
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo10PreDefined ee = new ExceptionDemo10PreDefined();
			ee.mydata();
		}
		catch (Exception e) {
			System.out.println("I can Handle " +e);
		}
	}
}
