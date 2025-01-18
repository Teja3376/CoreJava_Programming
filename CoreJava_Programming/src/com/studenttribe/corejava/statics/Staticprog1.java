package com.studenttribe.corejava.statics;
// 1.Static is a keyword 
// 2.We can declare static as variables and methods
// 3.Without object creation we can access the static methods and variables
// 4.Static methods and variables we can access through
//	 classname.variablename or classname.methodname.
public class Staticprog1 {
	static String name = "teja";
	static void add() { //public is optional
		int a,b,c;		// main: static >> void >> method(){ code }
		a=10;
		b=12;
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		System.out.println(name);
		add();
	}
}
