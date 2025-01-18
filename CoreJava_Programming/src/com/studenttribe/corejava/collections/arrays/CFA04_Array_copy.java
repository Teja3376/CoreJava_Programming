package com.studenttribe.corejava.collections.arrays;

import java.util.Arrays;

public class CFA04_Array_copy {
	public static void main(String[] args) {
		int [] numbers = {10,20,30,40,50};
		System.out.println("Original " +Arrays.toString(numbers));
		int [] copyArray = Arrays.copyOf(numbers, 7);
		System.out.println("Copy " +Arrays.toString(copyArray));
	}
}
