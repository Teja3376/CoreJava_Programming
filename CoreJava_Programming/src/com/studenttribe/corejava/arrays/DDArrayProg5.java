package com.studenttribe.corejava.arrays;

public class DDArrayProg5 {

	public static void main(String[] args) {
int arr[][]= new int[5][5];
		
		for(int i=0;i<5;i++)
			for(int j=0;j<5;j++)
			{
				 
				if(i==0 || j==0 || i==4 || j==4)
					arr[i][j]=7;
				
			    else
				     arr[i][j]=1;
			}
		for(int i=0;i<5;i++) {
			System.out.println();
			
			for(int j=0;j<5;j++)
				System.out.print(" "+arr[i][j]);
		}
			
	}

}
