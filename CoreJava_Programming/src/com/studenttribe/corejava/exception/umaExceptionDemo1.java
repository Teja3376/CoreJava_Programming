package com.studenttribe.corejava.exception;

public class umaExceptionDemo1 {
		public static void main(String[] args) {
			String name = "null";
			
			try {
				System.out.println(name.length());
				int n = 10;
				int n2 = 0;
				int n3 = n/n2;
				try {
					
					System.err.println(n3);
				}
				catch(ArithmeticException e1) {
					System.out.println(e1);
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
}
