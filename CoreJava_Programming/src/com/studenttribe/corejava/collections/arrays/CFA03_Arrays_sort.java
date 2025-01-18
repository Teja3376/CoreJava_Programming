package com.studenttribe.corejava.collections.arrays;

import java.util.Arrays;

public class CFA03_Arrays_sort {
	public static void main(String[] args) {
		int [] numbers = {5,6,2,5,4,5,6,8,1,2,4,7,8,6,2,4};
		System.out.println("Original" +Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("Sorted  " + Arrays.toString(numbers));
	}
}
