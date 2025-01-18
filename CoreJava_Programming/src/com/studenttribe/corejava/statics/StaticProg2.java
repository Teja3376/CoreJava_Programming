package com.studenttribe.corejava.statics;
//5. Static can only access static methods and static variables
public class StaticProg2 {
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
		//if the order is confused java will take static first
		//static declaration
		mydata();
		System.out.println(myname);
		// NON static Declaration
		StaticProg2 sp = new StaticProg2();
		sp.display();
		System.out.println(sp.name);
	}
}
