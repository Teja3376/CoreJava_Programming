
package com.studenttribe.corejava.constructors;
//super is a keyword it will call super class constructor
//each and every class needs constructor ,otherwise it will showing compile time error
//if u want create any constructor then automatically compiler will generate for us
class MyEmployee{
	// Default Constructor 
	MyEmployee(){
		System.out.println("Default Constructor ");
	}
	//Parameterized Constructor
	MyEmployee(int eno,String ename, int age, double esal){
		System.out.println("Employee ID: "+eno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Age: "+age);
		System.out.println("EMployee Salary: "+esal);
		
	}
}
public class Employee5 extends MyEmployee {
	Employee5 (){
		super();
	}
	int eno;
	String ename;
	int age;
	double esal;
	
	Employee5(int eno,String ename, int age, double esal){
		super(1,"Teja",23,55000);
		this.eno = eno;
		this.ename = ename;
		this.age = age;
		this.esal = esal;
	}
	void display() {
		System.out.println("Employee ID: "+eno);
		System.out.println("Employee Name: "+ename);
		System.out.println("Employee Age: "+age);
		System.out.println("EMployee Salary: "+esal);
		
	}
	public static void main(String[] args) {
//		new Employee5();
		Employee5 e = new Employee5(2,"Charan",22,55000);
		e.display();
	}
}
