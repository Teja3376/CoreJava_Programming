package com.studenttribe.corejava.oops;

import java.util.Scanner;

public class Demo1 {
	
	public void Object1() {
		String name ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello User Enter Your Name :");
		name = sc.next();
		System.out.println("Thank you Sir !!!");
		
	}
	public void Object2() {
		int id,i1,i2,i3,i4,i5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your ID :");
		id = sc.nextInt();
		System.out.println("Enter your M1 Marks");
		i1 = sc.nextInt();
		System.out.println("Enter your E1 Marks");
		i2 = sc.nextInt();
		System.out.println("Enter your C1 Marks");
		i3 = sc.nextInt();
		System.out.println("Enter your C2 Marks");
		i4 = sc.nextInt();
		System.out.println();
		i5 = (i1+i2+i3+i4)/4;
		System.out.println("Your Average marks are:"+i5);
		
	}


	
	public static void main(String[] args) {
		
	}
		
		 
}
