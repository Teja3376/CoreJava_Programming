//Factorial of the numbers
package com.studenttribe.corejava.nestedloops;

import java.util.Scanner;

public class Loop8 {

	public static void main(String[] args) {
		int t=0,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Factorial of Number :");
        t=sc.nextInt();


		for( int n=1;n<=t;n++) {
			fact=fact*n;
			
			
			
		}
 System.out.println("Factorial value is :" +fact);
 sc.close();
 
	}

}
