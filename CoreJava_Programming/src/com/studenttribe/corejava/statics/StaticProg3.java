package com.studenttribe.corejava.statics;
//6. static methods cannot access non static methods and non static variables
public class StaticProg3 {
	// non static variable
		String name = "Kameswari";
		//Static variable
		static String myname = "K.Charan Teja";
		//Non static Method
		void display() {
			System.out.println("Non Static Method");
		}
		//Static Method
		static void mydata() {
			System.out.println("Static Method");
		}
		public static void main(String[] args) {
			System.out.println(myname);
			StaticProg3.mydata();
		}
}
