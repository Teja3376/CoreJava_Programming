package com.studenttribe.corejava.statics;
// 7. Non static methods can access Static Variables and Methods
public class StaticProg4 {
	//Non static 
	String name = "Teja";
	//static
	static String fname = "Charan";
	//Non static method
	 void show() {
		System.out.println("non static data");
		System.out.println(fname);
		System.out.println(name);
		mydata();  // Using static in non-static method
	}
	 static void mydata() {
		 System.out.println("static method");
	 }
public static void main(String[] args) {
	mydata(); //static display display
	StaticProg4 sp = new StaticProg4();
	sp.show(); // non static method display
	
}
}
