package com.studenttribe.corejava.collections.arrays;

import java.util.Arrays;

public class CFA05_ArrayToString {
	public static void main(String[] args) {
		String [] fruits = {"apple","banana","carrot"};
		String arraystring = Arrays.toString(fruits);
		System.out.println("Array as String" + arraystring);
	}
}
