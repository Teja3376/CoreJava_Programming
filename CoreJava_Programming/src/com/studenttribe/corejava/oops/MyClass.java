//Inheritance example
package com.studenttribe.corejava.oops;

public class MyClass extends Calculation2 { // Reused the class from same package using 'extends'
	
	public void show() {
		System.out.println("show method: Local method"); //Created a method to call
		
	}

	public static void main(String[] args) {
		MyClass my=new MyClass();
		my.show();
		
		my.addition(); // Called the method from super class
		my.subtraction();
		my.multiplication();
		my.division();
		

	}

}
