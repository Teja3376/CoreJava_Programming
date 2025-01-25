package com.studenttribe.corejava.arrays;

public class DDArrayProg1 {

	public static void main(String[] args) {
		int arr[][]= new int[5][5];
		
		for(int i=0;i<5;i++)
			for(int j=0;j<5;j++)
				arr[0][0]=7;
		arr[0][4]=7;
		arr[1][3]=7;
		arr[3][1]=7;
		arr[4][0]=7;
		        arr[1][1]=7;
		        arr[2][2]=7;
		        arr[3][3]=7;
		        arr[4][4]=7;
		
		for(int i=0;i<5;i++) {
			System.out.println();
			
			for(int j=0;j<5;j++)
				System.out.print(" "+arr[i][j]);
		}
		
		
		
	}

}
