//Nested Loops3
package com.studenttribe.corejava.arrays;

public class DDArrayProg7 {

	public static void main(String[] args) {
		int arr[][]= new int[5][5];
		int n=1;
		
		for(int i=0;i<5;i++) {
		
			System.out.println("");
			for(int j=0;j<5;j++) { 
				arr[i][j]=n;
				
				System.out.print(" "+n);
			       n++;
			}
		}
	}

}
