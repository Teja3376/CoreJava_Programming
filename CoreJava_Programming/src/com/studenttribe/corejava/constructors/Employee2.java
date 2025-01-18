package com.studenttribe.corejava.constructors;
//constructor does not have any return type value not even in void
//If we declare constructor as a void it is consider as a method not a constructor
public class Employee2 {
	void Employee2(){
		System.out.println("Default Constructor");
	}
	public static void main(String[] args) {
		//new Employee2(); // Error: This method has a constructor name
		Employee2 e = new Employee2();
		e.Employee2();
	}

}
 