//Factorial of the numbers
package Loops;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		int n=1,t=0,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Factorial of Number :");
        t=sc.nextInt();


		while(n<=t) {
			fact=fact*n;
			n=n+1;
			
			
		}
 System.out.println("Factorial value is :" +fact);
 sc.close();
 
	}

}
