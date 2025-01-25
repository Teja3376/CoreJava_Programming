package com.studenttridee.corejava.oops;

public class Calculation {
	int a=10,b=20,c;
	public void addition() {      //Step-4
		c=a+b;                //B.L Step-5
		System.out.println("Addition: "+c);  //Step-6
	}

	public static void main(String[] args) {  //Step-1
		   Calculation cal=new Calculation(); //Step-2
		   
		   cal.addition();                    //Step-3
		   
	}      //Step-7

}          //Step-8
