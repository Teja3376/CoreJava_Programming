package com.studenttribe.corejava.operators;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=30,b=20,c=10;
			//arthemetic operators
			int d = a+b+c, e = a-b+c, f = a*b*c, g = a/c;
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(g);
			
			//if and else cases and logical operators
			if(a>b && a>c) {
				System.out.println("a:"+a+" is the big number");
			}
			else if(b>a && b>c) {
				System.out.println("b:"+b+" is the big number");
			}
			else {
				System.out.println("c:"+c+ " is the big number");
			}

	}
			
}
