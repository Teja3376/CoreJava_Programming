package com.studenttribe.corejava.arrays;

public class ArrayMatrixSub {

	public static void main(String[] args) {
		int a[][]= new int[3][3];
		int b[][]= new int[3][3];
		int c[][]= new int[3][3];
		
		
		System.out.print("Matrix A: ");
		
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j]=10;
		
		for(int i=0;i<3;i++) {
			System.out.println("");
			
			for(int j=0;j<3;j++)
				System.out.print(" "+a[i][j]);
		}
		System.out.println();
		System.out.print("Matrix B: ");
			
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				b[i][j]=5;
		
		for(int i=0;i<3;i++) {
			System.out.println();
			for(int j=0;j<3;j++) 
				System.out.print(" "+b[i][j]);
		}
		System.out.println("");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]-b[i][j];}
		}
		System.out.println("Matrix Subtraction Result :");
		System.out.print("Matrix C: ");
		System.out.println();
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.print(" "+c[i][j]); 
		} 
	System.out.println();
		}
	
	}

}
