//Encapsulation example
package com.studenttridee.corejava.oops;

public class Calculation2 {
	int a=100,b=20,c;
	public void addition() {     
		c=a+b;                
		System.out.println("Addition: "+c);  
	}
	public void subtraction()           
	{
		c=a-b;                          
		System.out.println("Subtraction: "+c); 
		
	}
	public void multiplication()           
	{
		c=a*b;                          
		System.out.println("Multiplication: "+c); 
		
	}
	public void division()           
	{
		c=a/b;                          
		System.out.println("Division: "+c); 
		
	}
	public static void main(String[] args) {  
		   Calculation2 cal=new Calculation2(); 
		   
		   cal.addition();                 
		   cal.subtraction();             
		   cal.multiplication();
		   cal.division();
	}      

}          
