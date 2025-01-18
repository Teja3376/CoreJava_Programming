package com.studenttribe.corejava.constructors;
//this is a keyword for pointing instance variables (Global variables)
public class Employee4 {
	Employee4() {
		System.out.println("Default constructor");
	}
	int eno;
	String ename;
	double esal;
	Employee4(int eno1, String ename1, double esal1){
		this.eno = eno1;
		this.ename = ename1;
		this.esal = esal1;
	}
	public void display() {
		System.out.println("Employee no "+eno);
		System.out.println("Employee name "+ename);
		System.out.println("Employee salary "+esal);
	}
	public static void main(String[] args) {
		new Employee4();
		Employee4 e = new Employee4(1,"Teja",65000);
		e.display();
	}
}
