package com.studenttridee.corejava.oops;

import java.util.Scanner;

public class StudentGrades {
	int a=0;
	int b=0;
	int c=0;
	double total=0;
	double avg=0;	
	
	public void acceptdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Subject marks: ");
		System.out.println("Maths: ");
		int a=sc.nextInt();	
		System.out.println("Eng: ");
		int b=sc.nextInt();
		System.out.println("Science: ");
		int c=sc.nextInt();
		System.out.println("Maths:"+a);
		System.out.println("Eng:"+b);
		System.out.println("Science:"+c);
		total=a+b+c;
		avg=total/3;
		 sc.close();
	}
	
	public void Addtotal() {
		
		System.out.println("The total marks of the student :"+total);
		System.out.println("The avg of the student is: "+avg);
	}
	
	public void grade() {
		if(avg>75)
			System.out.println("First Class");
		else
         if(avg<75)
		System.out.println("Pass");
         else
        	 if(avg<35)
        	 System.out.println("Fail");
	}
	
	
	public static void main(String[] args) {
		
              StudentGrades student= new StudentGrades();
              student.acceptdata();
              student.Addtotal();
              student.grade();
              
             
             
	}
	

}
