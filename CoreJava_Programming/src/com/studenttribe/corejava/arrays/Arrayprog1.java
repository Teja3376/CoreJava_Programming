package com.studenttribe.corejava.arrays;

public class Arrayprog1 {
	public static void main(String[] args) {
		int i,j, arr[][]=new int[5][5];
	
		for(i=0; i<5;i++) {
			for(j=0;j<5;j++) {
				if(i==j) 
					arr[i][j]=7;
				else 
					arr[i][j]=0;
			}
		}
		for(i=0;i<5;i++) {
			System.out.println();
			for(j=0;j<5;j++) {
				System.out.print(" "+arr[i][j]);
			}
			
		}
	}
}
