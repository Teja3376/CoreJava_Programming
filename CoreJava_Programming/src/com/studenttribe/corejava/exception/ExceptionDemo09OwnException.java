package com.studenttribe.corejava.exception;

public class ExceptionDemo09OwnException {
	int pno = 500;
//	int pno = 99;
	public void myData() throws PublicNotFoundException{
		if(pno >100) {
			throw new PublicNotFoundException("Product not found");
		}
		else {
			System.out.println("Product is there");
		}
	}
	public static void main(String[] args) {
		try {
			ExceptionDemo09OwnException ee = new ExceptionDemo09OwnException();
			ee.myData();
		}
		catch(Exception e) {
			System.out.println("I can Handle "+e);
		}
	}
}
