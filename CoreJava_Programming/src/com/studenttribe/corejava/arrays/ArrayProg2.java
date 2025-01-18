package com.studenttribe.corejava.arrays;

public class ArrayProg2 {
	public static void main(String[] args) {
		int i;
		String arr[] = new String[10];
		for(i=0;i<10;i++) {
			arr[i]="teja";
			arr[5]="Charan";
		}
		for(i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
	}
}
