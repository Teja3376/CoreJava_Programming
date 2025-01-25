//Factorial of the numbers
package com.studenttribe.corejava.nestedloops;

import java.util.Scanner;

public class Loop11 {

	public static void main(String[] args) {
		int n=1,t=0,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Factorial of Number :");
        t=sc.nextInt();


		do {
			fact=fact*n;
			n=n+1;
				
		}
		while(n<=t);
 System.out.println("Factorial value is :" +fact);
 sc.close();
 
	}

}
