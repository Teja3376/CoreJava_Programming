package com.studenttribe.corejava.nestedloops;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		numbers pattern
		int n=0;
		for(int i=0;i<=5;i++) {
			System.out.println();
			for(int j=0;j<=5;j++) {
				if(i>j)
					System.out.print(n);
				
			}
			n++;
		}
		
//		reverse numbers pattern
		int k=5;
		for(int i=0;i<=5;i++) {
			System.out.println();
			for(int j=0;j<=5;j++) {
				if(i<j)
					System.out.print(k);
			}
			k--;
		}
		
		
//		star patterns
		for(int i=0;i<=5;i++) {
			System.out.println();
			for(int j=0;j<=5;j++)
				if(i>j)
					System.out.print("*");
				
		}
		
		
//		reverse star pattern
		for(int i=0;i<=5;i++) {
			System.out.println();
			for(int j=0;j<=5;j++)
				if(j>i)
					System.out.print("*");
		}
		
		

	}

}