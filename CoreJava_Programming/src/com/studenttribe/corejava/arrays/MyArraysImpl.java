package com.studenttribe.corejava.arrays;

public class MyArraysImpl {
	 public static void main(String[] args){

	     // Creating object of Array(user-defined) class
	     MyArrays numbers = new MyArrays(3);

	       // Adding elements to array
	     numbers.insert(10);
	     numbers.insert(20);
	     numbers.insert(30);
	   
	       // Extra element exceeding array
	     numbers.insert(50);
	     numbers.insert(500);
	       // Calling printArray() method
	     numbers.printArray();
	 }
	}
