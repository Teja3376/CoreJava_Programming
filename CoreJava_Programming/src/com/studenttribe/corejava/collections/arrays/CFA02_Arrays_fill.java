package com.studenttribe.corejava.collections.arrays;

import java.util.Arrays;

public class CFA02_Arrays_fill {
public static void main(String[] args) {
	int numbers[] = new int[5];
	// creation of array
	Arrays.fill(numbers, 7);
	//filling the numbers with 7 
	// output is [7,7,7,7,7]
	System.out.println("Filled Array: "+ Arrays.toString(numbers));
}
}
