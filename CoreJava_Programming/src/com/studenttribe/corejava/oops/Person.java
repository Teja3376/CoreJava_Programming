package com.studenttridee.corejava.oops;

import java.util.Scanner;

public class Person {
	 String pname;
	 int age;
	 String address;
	 double sal;
	 public void acceptdata() {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the Name: ");
		 pname=sc.next();
		 System.out.println("Enter the Age: ");
		 age=sc.nextInt();
		 System.out.println("Enter the Address: ");
		 address=sc.next();
		 System.out.println("Enter the Salary: ");
		 sal=sc.nextInt();
		 sc.close();
		 
	 }
	 public void display() {
		 System.out.println("Person name is : "+pname);
		 System.out.println("Person age is : "+age);
		 System.out.println("Person address is : "+address);
		 System.out.println("Person Salary is : "+sal);
		 
	 }
	 
	public static void main(String[] args) {
		Person p= new Person();
		p.acceptdata();
		p.display();
	}
	
	

}
