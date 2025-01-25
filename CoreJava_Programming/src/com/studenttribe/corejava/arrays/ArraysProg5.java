package com.studenttribe.corejava.arrays;

import java.util.Scanner;
public class ArraysProg5 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		String arr[] = new String[5];
		
		System.out.println("Enter String array 5 values :");
		
		 
		for(int i=0;i<arr.length;i++)
			  arr[i]=sc.next();
		
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		sc.close();
		
	}  

}

  