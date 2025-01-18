package com.studenttribe.corejava.constructors;
// constructor are always overload
// In constructors there are 2 types
// 1. Default Constructor
// 2. Parameterized constructor
// constructor is used for initialization
public class Employee3 {
	int eno;            //
	String ename;		// Instance(Global) Variable
	double esal;		//
	Employee3(){ //Default constructor
		System.out.println("Default Constructor");
	}
	Employee3(int Eno1, String Ename1, double Esal1) { //parameterized constructor
		eno = Eno1;
		ename = Ename1;
		esal = Esal1;
	}
	public void display() {
		System.out.println("Employee no "+eno);
		System.out.println("Employee name "+ename);
		System.out.println("Employee salary "+esal);

	}
	public static void main(String[] args) {
		Employee3 e = new Employee3(1,"ravi",55000);
		e.display();
	}
}
