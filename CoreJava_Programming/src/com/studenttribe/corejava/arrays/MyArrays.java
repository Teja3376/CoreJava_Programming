package com.studenttribe.corejava.arrays;
//Java Program to Implement a Dynamic Array
//User Defined MyArrays
class MyArrays {

   private int arr[];
 private int count;

 // Method to return length of array
 public MyArrays(int size){
       arr = new int[size]; 
 }

 // Method to print array
 public void printArray(){

     for (int i = 0; i < count; i++) 
         System.out.print(arr[i] + " ");
 }

 // Method to insert element in array
 public void insert(int ele){

     if (arr.length == count) {

         // Creating a new array double the size
         // of array declared above
         int newArr[] = new int[2 * count];

         for (int i = 0; i < count; i++)
             newArr[i] = arr[i];

         // Assigning new array to original array
         arr = newArr;
     }

     arr[count++] = ele;
 }
}

